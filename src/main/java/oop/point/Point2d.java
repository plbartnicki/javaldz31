package oop.point;

import java.util.Objects;

public class Point2d //extends Object - kazda klasa domyslnie dziedziczy po klasie Object
	//dziedziczy, to znaczy ze są "kopiowane" na skutek dziedziczenia wszystkie skladowe (metody, pola (zmienne, obiekty)) ktore nie sa private
{
	//chronione (protected) skladowe sa widoczne tylko w odrebie klasy w ktorej sa zdefiniowane oraz w klasie po ktorej ta klasa dziedziczy (pochodnej)
	protected double x, y;
	protected Color color;

	public Point2d( double x, double y, Color color )
	{
		this.x = x;
		this.y = y;
		this.color = color;
	}

	//przeciazony konstruktor do inicjalizowania obiektu (punktu) z defaultowymi wartosciami (0, 0)
	public Point2d( )
	{
		x = y = 0;
	}

	//skladowa publiczna ma najwieksza widocznosc
	public double distance2d( Point2d secondPoint )
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

	public Color getColor( )
	{
		return color;
	}

	public void setColor( Color color )
	{
		this.color = color;
	}

	//nadpisujemy (zastepujemy) defaultowa implementacje metody toString (ktora pochodzi z klasy Object) czyli implementujemy wlasne zachowanie tej metody
	@Override
	public String toString( )
	{
		return "(" +
			"x=" + x +
			", y=" + y +
			')';
	}

	@Override public boolean equals( Object o )
	{
		if ( this == o )
			return true;
		if ( o == null || getClass( ) != o.getClass( ) )
			return false;
		Point2d point2d = ( Point2d ) o;
		return Double.compare( point2d.x, x ) == 0 && Double
			.compare( point2d.y, y ) == 0 && color == point2d.color;
	}

	@Override public int hashCode( )
	{
		return Objects.hash( x, y, color );
	}
}
