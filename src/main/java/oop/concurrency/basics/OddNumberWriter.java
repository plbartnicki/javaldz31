package oop.concurrency.basics;

import java.util.Random;

public class OddNumberWriter implements Runnable
{
	@Override
	public void run()
	{
		Random rand = new Random(  );
		for(int i = 1; i > 0; i+=2)
		{
			System.out.print( i + " " );
			try
			{
				Thread.sleep( 1000 + rand.nextInt(4001  ) );
			}
			catch ( InterruptedException e )
			{
				System.out.println( e );
				//jesli tutaj nastapi zlapanie wyjatka to oczywiscie aplikacja dziala dalej
			}
		}
	}
}
