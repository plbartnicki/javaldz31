package oop;

public class Point2d
{
	private double x, y;

	public Point2d( double x, double y )
	{
		this.x = x;
		this.y = y;
	}

	//przeciazony konstruktor do inicjalizowania obiektu (punktu) z defaultowymi wartosciami (0, 0)
	public Point2d( )
	{
		x = y = 0;
	}

	public double distance( Point2d secondPoint )
	{
		double distX = this.x - secondPoint.getX( );
		double distY = this.y - secondPoint.getY( );

		double dst = Math.sqrt( distX * distX + distY * distY);
		return dst;
	}

	//dodać gettery i settery (alt + insert)
	public double getX( )
	{
		return x;
	}

	public void setX( double x )
	{
		this.x = x;
	}

	public double getY( )
	{
		return y;
	}

	public void setY( double y )
	{
		this.y = y;
	}
}
