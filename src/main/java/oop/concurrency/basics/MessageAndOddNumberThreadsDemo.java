package oop.concurrency.basics;

public class MessageAndOddNumberThreadsDemo
{
	public static void main( String[] args )
	{
		OddNumberWriter oddNumberWriter = new OddNumberWriter();
		MessageWriter messageWriter = new MessageWriter( "Hello" );

		//obiekty anonimowe
		new Thread( messageWriter ).start();
		new Thread( oddNumberWriter ).start();
	}
}
