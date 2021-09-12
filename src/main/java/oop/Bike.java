package oop;

public class Bike extends Vehicle
{
	private int numOfGears;
	private BikeType bikeType;

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
