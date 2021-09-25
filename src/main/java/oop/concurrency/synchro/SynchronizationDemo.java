package oop.concurrency.synchro;

public class SynchronizationDemo
{
	public static void main( String[] args )
	{
		Account account = new Account();
		Incrementator b1 = new Incrementator(account);
		Incrementator b2 = new Incrementator(account);

		Thread t1 = new Thread(b1);
		Thread t2 = new Thread(b2);

		t1.start();
		t2.start();

		try {
			t1.join();  //dzieki joint watek glowny musi poczekac az watek t1 zakonczy swoja prace
			t2.join(); //dzieki joint watek glowny musi poczekac az watek t2 zakonczy swoja prace
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println( account.getAccount() );

	}
}
