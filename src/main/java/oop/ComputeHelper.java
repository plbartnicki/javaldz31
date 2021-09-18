package oop;

public class ComputeHelper
{
	//dzieki temu nikt przeaz (przez przypadek)  nie zrobi isntacji tej klasy
	private ComputeHelper() {

	}

	//TODO: change the function name
	//nie trzeba robic obiektu tej klasy zeby wywolac ta metode
	public static double fun1(int n)
	{
		int k;
		//okreslamy k - najwieksza liczba parzysta nie wieksza niz n
		if(n % 2 == 0)
		{
			k = n;
		} else //czyli n jest nieparzyste
		{
			k = n - 1;
		}
		int sum1 = 0;
		int sum2 = 1;

		for(int i = 2; i <= k; i+=2)
		{
			//TODO: it is only for debug - remove it
//			System.out.println("numI: " + i);

			sum1 += i;
			sum2 *= i;
		}

		return (double) sum1 / sum2;
	}
}
