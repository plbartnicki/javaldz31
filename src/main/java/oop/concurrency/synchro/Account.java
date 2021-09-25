package oop.concurrency.synchro;


class Account
{
	private int account = 0;
	int x;

	public void increment()
	{
		int temp  = account;
		temp++;
		account = temp;
	}

	public int getAccount() {
		return account;
	}
}
