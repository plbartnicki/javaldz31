package oop.point;

public class Point3d extends Point2d
{
	private double z;

	public Point3d( double x, double y, double z, Color color )
	{
		super( x, y, color ); //wywolujemy konstruktor z nadklasy (Point2d) przekazujac wartosci x i y
		this.z = z;
	}

	public double getZ( )
	{
		return z;
	}

	public void setZ( double z )
	{
		this.z = z;
	}

	@Override
	public String toString( )
	{
		return "(" +
			"x=" + x +
			", y=" + y +
			", z=" + z +
			')';
	}

	public double distance3d( Point3d secondPoint )
	{
		double distX = this.x - secondPoint.getX( );
		double distY = this.y - secondPoint.getY( );
		double distZ = this.z - secondPoint.getZ( );

		double dst = Math.sqrt( distX * distX + distY * distY + distZ * distZ);
		return dst;
	}
}
