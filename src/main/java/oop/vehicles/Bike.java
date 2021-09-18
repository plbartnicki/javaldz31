package oop.vehicles;

public class Bike extends Vehicle
{
	private int numOfGears;
	private BikeType bikeType;

	@Override //ta adnotacja to jest tez informacja (w kodzie) ze metoda draw jest dziedziczona
	public void draw()
	{
		System.out.println( "drawing bike .." + x + ", " + y  );
	}

	public enum BikeType{SPORT, MOUNTAIN, CITY}

	public Bike( String brand, Double price, int numOfGears, BikeType bikeType )
	{
		super( brand, price );
		this.numOfGears = numOfGears;
		this.bikeType = bikeType;
	}

	public int getNumOfGears( )
	{
		return numOfGears;
	}

	public BikeType getBikeType( )
	{
		return bikeType;
	}

	@Override public String toString( )
	{
		return "Bike{" +
			"numOfGears=" + numOfGears +
			", bikeType=" + bikeType +
			", brand='" + brand + '\'' +
			", price=" + price +
			'}';
	}


}
