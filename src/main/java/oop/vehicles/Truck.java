package oop.vehicles;

public class Truck extends Car
{
	private final int maxWeight;   //final oznacza ze to jest stala
	private int currentWeight;

	public Truck(String brand, Double price, int power, GearType grType, int numOfPass, final int maxWeight )
	{
		//wywolujemy konstruktor z klasy wyzej (Car) po to zeby przeniesc wartosci brand, power, grType
		super(brand, price, power, grType, numOfPass);

		//wartosci charakterystyczne tylko dla klasy Truck
		this.maxWeight = maxWeight;
		currentWeight = 0;
	}

	public void load(int weight)
	{
		if(currentWeight + weight <= maxWeight)
		{
			currentWeight = currentWeight + weight;  // to samo currentWeight += weight;
		}
	}

	public void unload(int weight)
	{
		if(currentWeight - weight >= 0)
		{
			currentWeight -= weight;
		}
	}

	public int getMaxWeight( )
	{
		return maxWeight;
	}

	public int getCurrentWeight( )
	{
		return currentWeight;
	}

	@Override public String toString( )
	{
		return "Truck{" +
			"maxWeight=" + maxWeight +
			", currentWeight=" + currentWeight +
			", brand='" + brand + '\'' +
			", price=" + price +
			'}';
	}

	@Override //ta adnotacja to jest tez informacja (w kodzie) ze metoda draw jest dziedziczona
	public void draw( )
	{
		System.out.println( "drawing truck .." + x + ", " + y );
	}

}
