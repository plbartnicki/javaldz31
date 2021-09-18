package oop.shapes;

public class Oval extends Shape
{
	protected Double r;

	public Oval( Double x, Double y, Double r )
	{
		super( x, y );
		this.r = r;
	}

	@Override
	public Double computeArea( )
	{
		return Math.PI * Math.pow( r, 2 );
	}

	public Double getR( )
	{
		return r;
	}

	public void setR( Double r )
	{
		this.r = r;
	}
}
