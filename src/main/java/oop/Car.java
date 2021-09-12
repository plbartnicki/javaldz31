package oop;

public class Car extends Vehicle
{
	protected int numOfPass;
	protected GearType gearType;
	protected  int power;

	//enum jest definicja wlasnego typu
	public enum GearType {MANUAL, AUTO}

	public Car( String brand, Double price, int power, GearType grType, int numOfPass )
	{
		super(brand, price);
		this.numOfPass = numOfPass;
		this.gearType = grType;
		this.power = power;
	}

	public int getNumOfPass( )
	{
		return numOfPass;
	}

	public void setNumOfPass( int numOfPass )
	{
		this.numOfPass = numOfPass;
	}

	public GearType getGearType( )
	{
		return gearType;
	}

	public void setGearType( GearType gearType )
	{
		this.gearType = gearType;
	}

	@Override public String toString( )
	{
		return "Car{" +
			"numOfPass=" + numOfPass +
			", gearType=" + gearType +
			", power=" + power +
			", brand='" + brand + '\'' +
			", price=" + price +
			'}';
	}
}
