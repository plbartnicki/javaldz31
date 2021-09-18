package oop.logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Date;

//ten logger zapisuje logi do pliku
public class FileLogger implements Logger
{
	@Override
	public void log( String message )
	{
		String pattern = "MM/dd/yyyy HH:mm:ss";
		SimpleDateFormat format = new SimpleDateFormat(pattern);  //obiekt formatu daty/czasu
		Date currentDate = new Date();   //obiekt biezacej daty i czasu
		String sDate = format.format( currentDate );
		String logLine = String.format( "%s %s", sDate, message);

		try {   //try to jest fragment kodu w ktorym moze nastapic nieprzewidziana sytuacja
			Files.write( Paths.get("C:\\logs\\output.txt"), logLine.getBytes(), StandardOpenOption.APPEND);
		} catch ( IOException e) {  //catch zawiera reakcje w sytuacje gdy polecial wyjatek
			//wyjatek to jest "błąd" spowodowany np. brakiem miejsca na dysku, brakiem dostepu
			e.printStackTrace();    //w e sa informacje o błędzie które szczegolowo wypisujemy
		}
	}
}
