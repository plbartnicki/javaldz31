package oop;

public class Employee
{
	//hermetyzacja

	//prywatne skladowe sa widoczne tylko w odrebie klasy w ktorej sa zdefiniowane
	private int id;
	private String name;
	private String lastname;

	//wartosc ponizszej skladowej bedzie mozna zmieniac
	//przyklad agregacji czyli zawierania obiektu w obiekcie
	private String address;

	//konstruktor definiuje sposob robienia instancji (obiektu) klasy

	public Employee( int id, String name, String lastname )
	{
		this.id = id;
		this.name = name;
		this.lastname = lastname;
	}

	//przeciazenie konstruktora (inna wersja konstruktora)
	public Employee( int id, String name, String lastname, String address )
	{
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.address = address;
	}

	//metoda która zwraca true jesli pracownik (obbiekt) na ktorym ta metoda jest wywolywana ma taki sam adres
	//jak pracownik ktory jest podany metodzie jako argument oraz obaj pracownicy maja ustawione adresy
	public boolean isTheSameAddress(Employee emp2)
	{
		if(this.address == null || emp2.getAddress() == null)
		{
			return false;
		}

		return address.equals( emp2.getAddress() );
	}

	public String getAddress( )
	{
		return address;
	}

	public void setAddress( String address )
	{
		this.address = address;
	}

	public int getId( )
	{
		return id;
	}

	public String getName( )
	{
		return name;
	}

	public String getLastname( )
	{
		return lastname;
	}
}
