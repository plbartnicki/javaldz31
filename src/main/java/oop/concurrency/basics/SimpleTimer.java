package oop.concurrency.basics;

import java.util.Random;

//klasa z logiką którą będzie wykonywał obiekt wątka
public class SimpleTimer implements Runnable
{
	private static final String name = "Simple timer";

	//logika tej metody run zostanie uruchomiona przez watek
	@Override
	public void run( )
	{
		int second = 1;
		while(true) {

			System.out.println(name + ": " + second + "s"  );
			try
			{
				Thread.sleep( 1000 );  //usypiamy watek na 1 sekunde
			}
			catch ( InterruptedException e )
			{
				System.out.println(e);
			}
			second++;
		}
	}
}
