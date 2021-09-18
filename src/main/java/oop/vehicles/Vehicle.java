package oop.vehicles;

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
	protected Double x, y;   //aktualne wspolrzedne pojazdu

	public Vehicle( String brand, Double price)
	{
		this.brand = brand;
		this.price = price;
		x = 0.0;
		y = 0.0;
	}

	//przeciazenie konstruktora (inna wersja )
	public Vehicle( String brand, Double price, Double x, Double y)
	{
		this.brand = brand;
		this.price = price;
		this.x = x;
		this.y = y;
	}

	//ponizsze metody maja implementacje (czyli nie sa abstrakcyjne)
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

	public Double getX( )
	{
		return x;
	}

	public void setX( Double x )
	{
		this.x = x;
	}

	public Double getY( )
	{
		return y;
	}

	public void setY( Double y )
	{
		this.y = y;
	}

	/*
			kazda klasa ktora bedzie dziedziczyla po tej, m u s i zaimplementowac (na swoj sposob) tą metodę
			metoda abstrakcyjna nie moze miec implementacji
		 */
	public abstract void draw();
}
