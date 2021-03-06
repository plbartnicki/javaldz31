package oop.collections;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListHelper
{
	public static Double computeArytmAverage( List<Double> numbers )
	{
		Double sum = 0.0;
		for ( int i = 0; i < numbers.size( ); i++ )
		{
			sum += numbers.get( i );
		}

		if ( numbers.size( ) == 0 )
		{
			return null;
		}

		return sum / numbers.size( );
	}

	//metoda zwraca true jesli w pierwszej zadanej jako argument liscie, znajduja sie takie
	//same wartosci jak w drugiej liscie
	//np: dla list [1,2,1,3] oraz [3,2,2,1] metoda powinna zwrocic true
	//[1,2,3]  [4,5,6]
	//dla list [4,2,5] oraz [4,5,2,7]  -> false
	//dla list [4,2,5] oraz [4,5,2,7]  -> false
	//[4,2,5,6] oraz [4,5,2,7]  -> false
	public static boolean theSameValues( List<Integer> list1, List<Integer> list2 )
	{
		//klasa HashSet ktora jest immplementacja interfejsu Set, czesto sluzy
		//jako "trick" do optymalizacji algorytmu
		Set<Integer> uniqueValues = new HashSet<>( );
		for ( Integer val : list1 )
		{
			uniqueValues.add( val );
		}

		for ( Integer val : list2 )  //ta petla sprawdza czy istnieje taki element val ktora nie wystepuje w zbiorze uniqueValues
		{
			if ( !uniqueValues.contains( val ) )
			{
				return false;
			}
		}

		if ( list1.isEmpty( ) && !list2.isEmpty( ) || !list1.isEmpty( ) && list2.isEmpty( ) )
		{
			return false;
		}

		return true;
	}

	public static boolean diffValues( List<Double> list )
	{
		Set<Double> uniqueValues = new HashSet<>( );
		//dodaj do uniqueValues wszystkie wartosci z list
		uniqueValues.addAll( list ); //można też użyć pętli

		//zastanow sie nad warunkiem (if)  oraz odpowiednia relacją pomiędzy rozmiarem list oraz uniqueValues
		//		if(list.size() != uniqueValues.size()) {
		//			return true;
		//		}
		//
		//		return false;

		return list.size( ) == uniqueValues.size( );
	}

	//words = ["Kasia", "Ola", "Agnieszka" ,"Ola"]
	//wordsCount={("Kasia", 1), ("Ola", 2), ("Agnieszka", 1)}
	// zlozonosc czasowe O(n)
	public static Map<String, Integer> numberOfWords( List<String> words )
	{
		Map<String, Integer> wordsCount = new HashMap<>( );  //tutaj bedzie wynik
		for ( String w : words )
		{
			if ( !wordsCount.containsKey( w ) )
			{  ///sprawdzamy czy slowo w juz wystapilo
				wordsCount.put( w,
					1 );  //jesli nie wystapilo (czyli nie zostalo jeszcze wrzucone do mapy) to dodajemy do mapy to slowo z licznikime 1
			}
			else
			{
				Integer value = wordsCount
					.get( w );  //metoda get na podstawie klucza zwraca wartosc - pobieramy wartosc (value) dla slowa w
				wordsCount.put( w, value + 1 );
			}
		}

		return wordsCount;
	}

	public static Map<String, Long> numberOfWordsUsingSteams( List<String> words )
	{
		/*  words = ["abc", "123", "abc"]
		   wordsCount: ("abc", 2), ("123", 1)
		 */
		Map<String, Long> wordsCount =
			words.stream( ).collect( Collectors.groupingBy( Function.identity( ), Collectors.counting( ) ));

		return wordsCount;
	}

}
