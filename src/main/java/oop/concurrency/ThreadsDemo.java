package oop.concurrency;

public class ThreadsDemo
{
	//uruchomienie tej aplikacji powoluje do zycia proces z watkiem glownym (main)
	public static void main( String[] args ) throws InterruptedException
	{
		//Roznica pomiedzy watkiem a processem
		//proces jest to instancja aplikacji
		//kazdy proces ma swoje id. Procesami zarzadza pewien komponent systemu operacyjnego

		//wątek jest to składowa procesu => proces może mieć 1 albo więcej wątków
		//watkamie zarzadza programista (programista moze je kontrolowac) - procesy powoluje do zycia OS a watki programista
		//!! proesy moga konkurowac o zasoby (np. plik) ktore sa w OS a watki wspoldziela obiety zdefiniowane przez programiste
		//!!InteliJ jest procesem w sklad ktorego wchodza watki ktore moga sie komunikowa tylko w odrebie tego procesu

		//przyklad --------------------

		//checmy miec tu dwa dodatkowe watki:
		//1. watek o nazwie "losowy" bedzie wypisywal liczby losowe z zakresu od 100 do 200
		Runnable randThreadLogic = new RandomNumbers();
		Thread randThread = new Thread( randThreadLogic );  //fizyczny watek

		//2. watek o nazwie "timer" bedzie co 1 sekunde wypisywal 1s, 2s, 3s...
		Runnable simpleTimerLogic = new SimpleTimer();
		Thread simpleTimerThread = new Thread( simpleTimerLogic );  //fizyczny watek

		//uruchamiamy watki
		randThread.start();  //ta metoda uruchomi watek ktory wykona logike zaimplementowana przez nas w metodzie run
		simpleTimerThread.start();

		System.out.println( "this is the main thread" );

		randThread.join();
		simpleTimerThread.join();


	}
}
