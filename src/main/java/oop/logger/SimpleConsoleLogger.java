package oop.logger;

public class SimpleConsoleLogger implements Logger
{
	@Override
	public void log( String message )
	{
		System.out.println(String.format( "--- %s ---",message));
	}
}
