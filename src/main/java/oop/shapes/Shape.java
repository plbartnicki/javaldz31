package oop.shapes;

public abstract class Shape
{
	protected Double x, y;

	public Shape( Double x, Double y )
	{
		this.x = x;
		this.y = y;
	}

	public abstract Double computeArea();

	//TODO: dodaj brakujace elementy
}
