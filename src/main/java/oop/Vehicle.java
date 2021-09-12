package oop;

/*
	nie można utworzyć obiektu klasy abstrakcyjnej
	klasa abstrakcyjna zawiera wspolne skladowe dla wszystkich klas ktore po niej dziedzicz

	kazda klasa abstrakcyjna (podobna do interfejsu) stanowi pewnego rodzaju kontrakt, to znaczy
	ze na obiekcie kazdej klasy ktora dziedziczy po klasie abstrakcyjnej, mamy pewnosc ze mozna wywolac
	dowolna metode publiczna (public) z tej klasy abstrakcyjnej
 */
public abstract class Vehicle
{
	protected String brand;
	protected Double price;

	public Vehicle( String brand, Double price )
	{
		this.brand = brand;
		this.price = price;
	}

	public String getBrand( )
	{
		return brand;
	}

	public Double getPrice( )
	{
		return price;
	}

	public void setPrice( Double price )
	{
		this.price = price;
	}
}
