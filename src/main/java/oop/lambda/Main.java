package oop.lambda;

@FunctionalInterface
interface Operation  //kazdy inteerfejs ktory jest funkcyjny musi zawierac jedna i tylko jedna metode
{
	//ponizsza metoda bedzie reprezentowala wszystkie operacje (funkcje) R->R
	//czyli funkcje ktore dla argumentu rzeczywistego, beda zwracaly liczby rzeczywiste

	double f(double x);  //tutaj okreslamy pewne spektrum dozwolonych sygnatur funkcji
}

@FunctionalInterface
interface AnotherOperation
{
	int f(String x, String y, int z);  //zapowiedz sygnatury funkcji
}

public class Main
{
	private static double g(double x, Operation op )
	{
		//funkcja g jako pierwszy argument przyjmuje liczbe rzeczywista
		//a jako drugi - d o w o l n a  funcje o sygnaturze takiej jak w interfejsie Operation  (czyli double -> double)
		return 2*Math.abs(x) + op.f( x );
		          //6        +  ( h -> h + 1) (-3)  = -2
		          //6        + (-2) = 6 - 2 = 4
	}
	public static void main( String[] args )
	{
		double result = g(-3, h -> h + 1 ); //h -> h + 1  jest wyrazeniem lambda zgodnym z interfejsem Operation
		System.out.println( result );

		double result2 = g(-3, h -> 5.2*h - 7.5 );
		System.out.println( result2 );

//		double result2 = g(-3, (h, s) -> 5.2*h - 7.5 );

		AnotherOperation lambdaExpression = (x, y, z) -> x.length()  + y.length()  + z;  //wyrazenie lambda (po prawej stronie) jest zgodne z interfejsem funkcyjnym AnotherOperation
	}
}
