package oop;

public class Truck extends Car
{
	private final int maxWeight;   //final oznacza ze to jest stala
	private int currentWeight;

	public Truck(String brand, int power, final int maxWeight )
	{
		//TODO: complete it
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
}
