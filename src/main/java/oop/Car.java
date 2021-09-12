package oop;

public class Car
{
	protected String brand;
	protected int power;
	protected GearType grType;

	public enum GearType {MANUAL, AUTO}

	public Car( String brand, int power, GearType grType )
	{
		this.brand = brand;
		this.power = power;
		this.grType = grType;
	}

	public String getBrand( )
	{
		return brand;
	}

	public int getPower( )
	{
		return power;
	}

	public void setPower( int power )
	{
		this.power = power;
	}

	public GearType getGrType( )
	{
		return grType;
	}

	public void setGrType( GearType grType )
	{
		this.grType = grType;
	}

	@Override
	public String toString( )
	{
		return "Car{" +
			"brand='" + brand + '\'' +
			", power=" + power +
			", grType=" + grType +
			'}';
	}
}
