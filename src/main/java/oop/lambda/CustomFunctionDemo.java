package oop.lambda;

public class CustomFunctionDemo
{
	private static double f(double a, double b, CustomFunction funlambda) {
		return a*b + funlambda.fun( a, b );
	}

	public static void main( String[] args )
	{
		System.out.println( f(1, 2, (a,b)->a*b));
		System.out.println( f(3, 2, (a,b)->2*a+b));
	}
}
