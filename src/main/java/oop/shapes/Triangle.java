package oop.shapes;

//trojkat rownoboczny
public class Triangle extends Shape
{
	protected Double a;

	public Triangle( Double x, Double y, Double a )
	{
		super( x, y );
		this.a = a;
	}

	@Override
	public Double computeArea( )
	{
		return Math.pow( a, 2 ) * Math.sqrt( 3 ) / 4.0;
	}

	public Double getA( )
	{
		return a;
	}

	public void setA( Double a )
	{
		this.a = a;
	}
}
