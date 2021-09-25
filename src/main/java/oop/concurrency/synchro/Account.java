package oop.concurrency.synchro;

import java.util.concurrent.Semaphore;

class Account
{
	private int account = 0;
	private int x;
	private Semaphore semaphore = new Semaphore( 1 );  //1 oznacza ze korzystamy z semafora binarnego (tylko jeden szlaban dla watkow)

	//sekcja krytyczna, ponieważ może stać się tak, że jeden wątek jeszce nie skonczy tej metody
	//a w miedzy czasie, drugi watek "wtrąci" się i przez to nastąpi zła aktualizacja zmiennej account

	/*
	   Istnieja rozne sposoby zapobiegajace temu zeby dwa watki nie mogly jednoczesnie byc w trakcie
	   wykonywania tej metody
	   1. slowo kluczowe synchronized - dzieki temu nie pojawi sie problem zw. z niepoprawnymi obliczeniami
	   2. semafory
	   3. Locki...
	 */

/*  //przyklad 1

	public void increment( )  //zawartosc tej metody jest sekcja krytyczna poniewaz moze nastapic przeklamanie w obbliczeniach gdy kilka watkow jednoczenie realizuje kod tej metody
	{
		//		synchronized ( this )   //kolejny sposob uzycia synchronized (zamiast uzycia tego slowa przed metoda) - wtedy okresalmy precyzyjnie fragment kodu kotry jest sekcja krytyczna
		//		{
		int temp = account;  //temp to kopia aktualnego stanu konta
		temp++;  //zwiekszamhy o 1
		account = temp;  //aktualizacja konta
		//		}
	}  */

	//przyklad 2 - dzieki semaforom mozna osiagnac taki efekt (nie bedzie bledu w obliczeniach) jak w przykladzie 1
	public void increment( )  //zawartosc tej metody jest sekcja krytyczna poniewaz moze nastapic przeklamanie w obbliczeniach gdy kilka watkow jednoczenie realizuje kod tej metody
	{
		try
		{
			semaphore.acquire();  //zamykamy szlaban dla innych wątków
		}
		catch ( InterruptedException e )   //e jest referencja na bląd typu InterruptedException
		{
			e.printStackTrace( );  //duzo wiecej informacji na konsoli niz gdybysmy uzyli System.out.println(e)
		}
		int temp = account;  //temp to kopia aktualnego stanu konta
		temp++;  //zwiekszamhy o 1
		account = temp;  //aktualizacja konta

		semaphore.release();  //podnosimy szlaban i dzieki temu inny (oczekujac) watek bedzie mogl rozpoczac tę metodę
	}

	public int getAccount( )
	{
		return account;
	}
}
