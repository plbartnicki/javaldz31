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

}
