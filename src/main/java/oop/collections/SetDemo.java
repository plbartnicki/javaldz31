package oop.collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo
{

	public static void main( String[] args )
	{
		Set<String> set1 = new HashSet<>(  );
		set1.add( "Kasia" );
		set1.add( "Zosia" );
		set1.add( "Kasia" );
		set1.add( "zosia" );
		String name = "Ola";
		set1.add( name );
		System.out.println( name.hashCode());

		System.out.println( set1 );
		System.out.println( set1.contains( "Kasia" ) );

		Integer num = 45345493;
		System.out.println( num.hashCode() );

		//hashcode jest po to zeby efektywnie (optymalnie (z jak najlepsza zlozonoscia czasowa))
		//dodawac wartosc do zbioru oraz sprawdzac czyy istnieje w zbiorze

		Double num2 = 99.234;
		System.out.println( num2.hashCode() );
	}
}
