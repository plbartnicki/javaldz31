package oop.lambda;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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

		List<Integer> vals = Arrays.asList(-2, 30, 15, -8, 16);
		vals.stream().filter( v -> v < 0 )
			.forEach( el -> {
				System.out.print( el + " " );
			}  );

		System.out.println(  );

		Set<Invoice> invoices = new HashSet<>(  );
		invoices.add(new Invoice( 1, "Abc", 15000.0 )  );
		invoices.add(new Invoice( 2, "Soft1", 15000.0 )  );
		invoices.add(new Invoice( 3, "Soft1", 9000.0 )  );
		invoices.add(new Invoice( 4, "Soft1", 20000.0 )  );

		//chcemy zliczyc ilosc faktur wystawionych przez firme Soft1, ktorych wartosc netto jest > 10000 i mniejsza niz 30000
		long numOfInvoices = invoices.stream()
			.filter( inv -> inv.getCompanyName().equals( "Soft1" ) && inv.getNettoValue() > 10000 &&  inv.getNettoValue() < 30000)
			.count();
		System.out.println( numOfInvoices );

		//chcemy wypisac  idki tych faktur wystawionych przez firme Soft1, ktorych wartosc netto jest > 10000 i mniejsza niz 30000
		List<Integer>  res1 = invoices.stream()
			.filter( inv -> inv.getCompanyName().equals( "Soft1" ) && inv.getNettoValue() > 10000 &&  inv.getNettoValue() < 30000)
			.map(inv -> inv.getId())   //map jest funkcja wywolywana na strumieniu i zwracajaca kolejny strumien. map, zamienia jeden typ na drugi
			.collect( Collectors.toList());
		System.out.println( res1 );
	}
}
