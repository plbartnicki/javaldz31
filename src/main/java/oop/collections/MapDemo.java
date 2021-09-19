package oop.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo
{
	public static void main( String[] args )
	{
		Map<String, String> polishToEnglish = new HashMap<>( );
		polishToEnglish.put( "zwierze", "animal" );
		polishToEnglish.put( "zamek", "lock" );
		polishToEnglish.put( "zamek", "castle" );
		System.out.println( polishToEnglish );

		//HashMap traktujemy jako zbior par (klucz, wartosc)
		//dzieki mapie, na podstawie klucza, mamy szybki w czasie O(1) do wartosci

		//w ponizszej mapie na podstawie klucza (id) mam szybki dostep do obiektu Customer
		Map<Id, Customer> customers = new HashMap<>( );
		customers.put( new Id(222), new Customer( 222, "Lodz ul Abc" ) );
		customers.put( new Id(333), new Customer( 333, "Lodz ul Piotrkowska" ) );
		customers.put( new Id(222), new Customer( 222, "Lodz ul Wwww" ) );

		System.out.println(customers);

//		Id id1 = new Id(1);
//		Id id2 = new Id(1);
//		System.out.println(id1 + " " + id2);
//		System.out.println(id1.equals( id2 ));
	}
}
