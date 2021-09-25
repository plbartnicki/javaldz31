package oop.exceptions;

public class Main
{
	private static Double div( Double x, Double y )
		throws Exception  //ta metoda moze rzucuc wyjatek klasy Exception (checked)
	{  //dzieli x przez y
		if ( y == 0 )
		{
			throw new Exception(
				"You cannot divide by 0" );  //rzucenie wyjatku powoduje przerwanie dzialania metody (jak return)
			//jesli rzucamy wyjatek ktory jest "checked" (czyli klasa Excpetion i pochodne tej klasy) to trzeba dodac do sygnatury metody
			//zapowiedz ze metoda moze rzucic taki wyjatek
		}

		return x / y;
	}

	public static void main( String[] args ) throws Exception
	{
		//wyjatki klasy Error zawieraja informacje o sytuacjach najtrudniejszych do przewidzenia
		//np. zerwanie połączenia z serwerem

		//		double value = 10.77 / 0;
		//		int[] values = { 1, 2, 3 };
		//		int v = values[ 100 ]; //nieprzechwycony wyjatek powoduje przerwanie dzialania aplikacji
		//		System.out.println( "value" + v );

		int[] values = { 1, 2, 3 };
		try
		{
			int v = values[ -1 ];
			System.out.println( "value" + v );
		}
		catch ( ArrayIndexOutOfBoundsException ex )
		{
			//ArrayIndexOutOfBoundsException  jest klasa ktora dziedziczy po RuntimeException
			//natomiast (diagram ze slacka) RuntimeException jest unchecked (czyli nie trzeba tego obslugiwac jak w linii 12)
			System.out.println( "Incirrect index value" );
		}

		//istnieja klasy wyjatkow (klasa Exception oraz jej pochodne) ktore trzeba obslugiwac
		try
		{
			Double result = div( 10.0, 0.0 );
			System.out.println( result );
		}
		catch ( Exception e )
		{
			System.out.println(e.getMessage()  );
//			e.printStackTrace();  //mozna tez wyswietlic bardziej szczegolowe informacje
//			throw e;  //mozna tez przerzucic wyjatek dalej (wtedy JVM juz sie tym zajmie) i spowoduje przerwanie dzialania aplikkacji
		}

		System.out.println( "aplication is still running" );
	}
}
