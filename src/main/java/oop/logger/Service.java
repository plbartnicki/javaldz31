package oop.logger;

public class Service
{
	private static void saveEmployeesToDatabase(Logger logger)
	{
		//istrukcje

		//po skonczonej operacji ta logika zapisuje informacje poprzez logger
		logger.log( "Employees has been saved" );
	}

	private static void deleteEmployeesFromDatabase(Logger logger)
	{
		//istrukcje

		//po skonczonej operacji ta logika zapisuje informacje poprzez logger
		logger.log( "Employees has been removed" );
	}

	//takich metod moze  byc duzo

	public static void main( String[] args )
	{
		//operacje
		Logger logger = new ConsoleLogger();  //dzieki temu ze w powyzsze motody przyjmuja loggera przez interfejsy (a nie przez konkretne implementacje)
		//w latwy swposob mozemy zamienic w kodzie implementacje
		saveEmployeesToDatabase(logger);
	}
}
