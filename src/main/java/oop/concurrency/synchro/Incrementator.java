package oop.concurrency.synchro;

import java.util.Random;

class Incrementator implements Runnable {
	private Account account;
	private static final Random rand = new Random();


	public Incrementator(Account account) {
		this.account = account;  //kazdy obiekt tej klasy referuje na wspolny account
	}

	@Override
	public void run() {
		for(int i =0; i < 100; i ++) {
			account.increment();

			try {
				Thread.sleep(100 + rand.nextInt(2)*100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
