package oop;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

//A extends B and B extends C => A dziedziczy po C
public class Main
{

	//static oznacza ze nie musze robic obiektu tej klasy (Main) zeby wywolac ta funkcji
	public static int maxOddNumber(int []values)
	{
		int maxOdd = -1;   //kandydat na maksymalna wartosc nieparzysta (-1 oznacza ze jeszcze nie znaleziono zadnego elementu nieparzystego)
		int maxEven = -1; // ...wartosc parzysta...

		for(int i = 0; i < values.length; i++)
		{
			if(values[i] % 2 == 1 && values[i] > maxOdd)  //jesli i-ta (kolejna) wartosc komorki tablicy
			{
				maxOdd = values[i];
			}
			else if(values[i] % 2 == 0 && values[i] > maxEven)
			{
				maxEven = values[i];
			}
		}

		if(maxOdd != -1)
		{
			return maxOdd;
		}

		return maxEven;
	}

	private static boolean checkPairs( double[] values )
	{
		int numOfValues = values.length;

		if ( numOfValues % 2 != 0 )
		{
			return false;
		}

		Set<Double> nums = new HashSet<>( );
		for ( double x : values )
		{
			nums.add( x );
		}

		System.out.println( nums );

		for ( int i = 0; i < numOfValues; i++ )
		{
			double neg = -1 * values[ i ];
			if ( !nums.contains( neg ) )
			{
				return false;
			}
		}
		//[-2,1,-1,2] -> true
		//[1,2,3,4] -> false
		//[-5,4,5,-4,3] -> false

		//[-4,-2,3,3] -> false
		//set = (-4, -2, 3 )

		//[-2,1,-1,2] -> true
		//set = (-2, 1, -1, 2)

		return true;

	}

	private static void demoCheckPairs( )
	{
		double[] vals1 = { -4, -2, 3, 3 };
		System.out.println( checkPairs( vals1 ) );

		double[] vals2 = { -2, 1, -1, 2 };
		System.out.println( checkPairs( vals2 ) );
	}

	private static void demoEmployees( )
	{
		Employee emp1 = new Employee( 1, "Bartnicki", "Lukasz" );
		emp1.setAddress( "Krakow ul xyz" );
		System.out.println( emp1.getAddress( ) );

		Employee emp2 = new Employee( 2, "Kasia", "Abcd", "Lodz www" );
		System.out.println( emp2.getId( ) );

		System.out.println( emp1.isTheSameAddress( emp2 ) );

		Employee emp3 = new Employee( 3, "Kasia", "Nowak", "Lodz www" );
		System.out.println( emp2.isTheSameAddress( emp3 ) );
	}

	private static void demoPoint2d( )
	{
		//robimy obiekt punktu za pomoca konstruktora domyslnego
		Point2d p1 = new Point2d( );
		System.out.println( "(" + p1.getX( ) + ", " + p1.getY( ) + ")" );

		//zrob punkt o wspolrzednych (-0.02, 2.34) i wyswietl obie wspolrzedne
		Point2d p2 = new Point2d( -0.02, 2.34, Color.BLUE );
		System.out.println( "(" + p2.getX( ) + ", " + p2.getY( ) + ")" );

		Point2d p3 = new Point2d( 3, 4, Color.GREEN );

		//odleglosc pomiedzy p3 i p1
		double dist = p1.distance2d( p3 );

		System.out.println( dist );

		System.out.println( p1 );  // to jest rownowazne System.out.println( p1.toString() );
	}

	private static void demoPoint3d( )
	{
		Point3d p1 = new Point3d( -0.02, 2.34, 1, Color.BLUE );
		Point3d p2 = new Point3d( -0.02, 2.34, 1, Color.RED );
//		Point2d p3 = new Point2d( -0.02, 2.34);

		System.out.println( p1 );
		System.out.println( p1.distance3d( p2 ) );
	}

	public static void testMaxOddNumber()
	{
		int test1[] = {2,1,4,7,6};
		int result1 = Main.maxOddNumber(test1 );
		System.out.println( result1 );

		int test2[] = {};
		int result2 = Main.maxOddNumber(test2 );
		System.out.println( result2 );

		int test3[] = {2,8,4,10,6};
		int result3 = Main.maxOddNumber(test3 );
		System.out.println( result3 );
	}

	private static void carsTest()
	{
		Truck tr1 = new Truck( "Vovlo", 1221, Car.GearType.AUTO, 1000 );
		System.out.println(tr1);

		Car car1 = new Car("Vovlo", 1221, Car.GearType.AUTO);
		Object car2 = new Car("Toyota", 1221, Car.GearType.AUTO);

		System.out.println( car1 );

	}

	public static void main( String[] args )
	{
		//demoEmployees( );
//		//demoPoint2d( );
//		demoPoint3d();

//		testMaxOddNumber();

		carsTest();

	}
}
