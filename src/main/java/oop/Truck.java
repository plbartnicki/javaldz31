package oop;

public class Truck extends Car
{
	private final int maxWeight;   //final oznacza ze to jest stala
	private int currentWeight;

	public Truck(String brand, int power, GearType grType, final int maxWeight )
	{
		//wywolujemy konstruktor z klasy wyzej (Car) po to zeby przeniesc wartosci brand, power, grType
		super(brand, power, grType);

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

	@Override public String toString( )
	{
		return "Truck{" +
			"brand='" + brand + '\'' +
			", power=" + power +
			", grType=" + grType +
			", maxWeight=" + maxWeight +
			", currentWeight=" + currentWeight +
			'}';
	}
}
