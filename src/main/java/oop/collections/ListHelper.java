package oop.collections;

import java.util.List;

public class ListHelper
{
	public static Double computeArytmAverage( List<Double> numbers)
	{
		Double sum = 0.0;
		for(int i = 0; i < numbers.size(); i++)
		{
			sum += numbers.get( i );
		}

		if(numbers.size() == 0) {
			return null;
		}

		return sum / numbers.size();
	}
}
