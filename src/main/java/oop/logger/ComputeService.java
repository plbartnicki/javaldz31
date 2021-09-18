package oop.logger;

public class ComputeService
{
	public static void main( String[] args )
	{
		Logger logger = new SimpleConsoleLogger();
		logger.log( "application started" );
	}
}
