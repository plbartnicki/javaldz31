package oop.logger;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * implementacja interfejsu Logger ktora loguje tylko na konsole
 * Jesli klasa implementuje interfejs to musi zaimplementowac wszystkie jego metoda
 */
public class ConsoleLogger implements Logger
{
	@Override
	//dzieki tej metodzie bedziemy mogli zapisywac wazne informacje zwiazane z dzialaniem aplikacji
	public void log( String message )
	{
		String pattern = "MM/dd/yyyy HH:mm:ss";
		SimpleDateFormat format = new SimpleDateFormat(pattern);  //obiekt formatu daty/czasu
		Date currentDate = new Date();   //obiekt biezacej daty i czasu
		String sDate = format.format( currentDate );
		System.out.println(String.format( "%s %s", sDate, message));
	}
}
