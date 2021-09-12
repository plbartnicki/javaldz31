package oop;

/*
	nie można utworzyć obiektu klasy abstrakcyjnej
	klasa abstrakcyjna zawiera wspolne skladowe dla wszystkich klas ktore po niej dziedzicz
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
