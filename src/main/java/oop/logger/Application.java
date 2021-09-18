package oop.logger;

public class Application
{
	private static ConsoleLogger logger = null;

	private static void getEmployeesFromDatabase()
	{
		//istrukcje

		//po skonczonej operacji ta logika zapisuje informacje poprzez logger
		logger.log( "Getting employees from database has been completed" );
	}
	public static void main( String[] args )
	{
		//operacje
		logger = new ConsoleLogger();
		getEmployeesFromDatabase();
	}
}
