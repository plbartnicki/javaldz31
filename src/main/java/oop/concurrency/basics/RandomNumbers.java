package oop.concurrency.basics;

import java.util.Random;

//klasa z logiką którą będzie wykonywał obiekt wątka
public class RandomNumbers implements Runnable
{
	private static final String name = "Random Number Writer";

	//logika tej metody run zostanie uruchomiona przez watek
	@Override
	public void run( )
	{
		Random losGenerator = new Random(  );
		while(true) {
			int randomNum = 100 + losGenerator.nextInt(101  );
			System.out.println(name + ": " + randomNum  );
			try
			{
				Thread.sleep( 5000 );
			}
			catch ( InterruptedException e )
			{
				System.out.println(e);
			}
		}
	}
}
