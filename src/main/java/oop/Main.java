package oop;

import java.util.HashSet;
import java.util.Set;

public class Main
{

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
		System.out.println( "(" +  p1.getX() + ", " + p1.getY() + ")");

		//zrob punkt o wspolrzednych (-0.02, 2.34) i wyswietl obie wspolrzedne
		Point2d p2 = new Point2d(-0.02, 2.34 );
		System.out.println( "(" +  p2.getX() + ", " + p2.getY() + ")");

		Point2d p3 = new Point2d(3, 4);

		//odleglosc pomiedzy p3 i p1
		double dist = p1.distance(p3);

		System.out.println(dist);
	}

	public static void main( String[] args )
	{
		//demoEmployees( );
		demoPoint2d();
	}
}
