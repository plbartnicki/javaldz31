package oop.collections;

import oop.point.Point2d;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Element<T>
{
	private T value;  //wartosc typu T
	private Element next;
	private Element previous;

	//..
}

public class ListDemo
{
	public static void main( String[] args )
	{
		List<Integer> listOfNums = new ArrayList<>(  );
		listOfNums.add( 1 );
		listOfNums.add( 2 );
		System.out.println( listOfNums.get( 1 ) );

		List<Double> listOfNums2 = new LinkedList<>(  );
		listOfNums2.add( 1.0 );
		listOfNums2.add( 2.0 );
		System.out.println( listOfNums2.get( 1 ) );
	}
}
