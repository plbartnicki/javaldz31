package oop.concurrency.basics;

import java.util.Random;

public class MessageWriter implements Runnable
{
	private String message;

	public MessageWriter( String message )
	{
		this.message = message;
	}

	public String getMessage( )
	{
		return message;
	}

	public void setMessage( String message )
	{
		this.message = message;
	}

	@Override
	public void run()
	{
		Random rand = new Random(  );
		for(;;)  //petla nieskonczona
		{
			System.out.print( message + " " );
			try
			{
				Thread.sleep( 1000 + rand.nextInt(4001  ) );
			}
			catch ( InterruptedException exp )
			{
				System.out.println( exp.getMessage() );
			}
		}
	}
}
