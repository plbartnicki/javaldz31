package oop.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo
{
	public static void main( String[] args )
	{
		List<String> words = Arrays.asList( "zzzzzz", "abc", "aaa", "test" );

		//stream (strumien) jest sekwencja danych uzyskanych z kolekcji
		//! poprzez strumien nie mozna zmienic oryginalnych danych kolecji

		//przyklad - na podstawie listy words checmy uzsykac liste tych slow,
		//ktorych dlugosci są > 3
		words.stream().filter( x -> x.length() > 3 )
			.forEach( el -> {   //filter zwraca kolejny strumien i kazdy element z tego strumienia, wypisujemy na konsoli
				System.out.print( el + " " );
			}  );

		System.out.println( " " );

		//zamiast wypisywac na ekranie, mozna wynik zamiescic w nowej liscie (i ewentualnie dodatkowo posortowac)
		List<String> words2 = words.stream().filter( x -> x.length() > 3 ).sorted().collect( Collectors.toList());
		System.out.println( words2 );
	}
}
