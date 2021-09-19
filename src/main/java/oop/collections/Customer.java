package oop.collections;

import java.util.Objects;

public class Customer
{
	private final Integer id;  //ta wartosc jest unique
	private String address;

	public Customer( Integer id )
	{
		this.id = id;
	}

	public Customer( Integer id, String address )
	{
		this.id = id;
		this.address = address;
	}

	public String getAddress( )
	{
		return address;
	}

	public void setAddress( String address )
	{
		this.address = address;
	}

	public Integer getId( )
	{
		return id;
	}

	@Override public String toString( )
	{
		return "Customer{" +
			"id=" + id +
			", address='" + address + '\'' +
			'}';
	}

	@Override public boolean equals( Object o )
	{
		if ( this == o )
			return true;
		if ( o == null || getClass( ) != o.getClass( ) )
			return false;
		Customer customer = ( Customer ) o;
		return id.equals( customer.id ) && address.equals( customer.address );
	}

	@Override public int hashCode( )
	{
		return Objects.hash( id, address );
	}
}
