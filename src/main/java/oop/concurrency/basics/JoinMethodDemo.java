package oop.concurrency.basics;

public class JoinMethodDemo
{
	public static void main( String[] args ) throws InterruptedException  //throws oznacza przerzucenie wyjątka (który może zostać rzucowny w tej metodzie) dalej
	{
		Thread t1 = new Thread()
		{
			@Override
			public void run()
			{
				for(int i = 0; i < 5; i++)
				{
					System.out.println(i);
					try
					{
						Thread.sleep( 1000 );
					}
					catch ( InterruptedException e )
					{
						System.out.println( e.getMessage() );
					}
				}
			}
		};

		t1.start();
		//t1.join();   //join powoduje ze glowny watek poczeka na to az t1 skonczy swoja prace

		System.out.println( "main" );

		/** Do poczytania
		 Metody z klasy Thread:
		yield (ustąp) - powoduje poinformowanie systemu ze miejsce biezacego watka MOŻE (ale nie musi) zajac inny watek
		- dzieki temu mozna otrzymac bardziej rownolegla/naprzemienna prace watkow ale nie musi byc idealnie naprzemienna
		stop() - metoda niezalecana (niebezpieczna) zamiast niej nalezy sprawdzac warunek w run() i ewentualnie przerywac
		join();  wywolanie tej metody powoduje oczekiwanie przez watek glowny (biezacy-program) na zakonczenie pracy watku ktory zostal zainicjalizowany w watku glownym

		Metody z klasy Object
		notify() - budzi jeden watek ktory oczekuje na ten obiekt
		notifyAll() - budzi wszystkie watki ktore oczekuja na ten obiekt
		wait() - zwalnia watek ktory zajmuje obiekt (monitor) na ktorym zostala wykonana ta metoda (czyli inny watek moze posiasc ten obiekt)
		na tak dlugo az zostanie na nim wykonana metoda notify
		 */
	}
}
