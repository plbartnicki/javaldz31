package oop.lambda;

public class Invoice
{
	private int id;
	private String companyName;
	private Double nettoValue;

	public Invoice( int id, String companyName, Double nettoValue )
	{
		this.id = id;
		this.companyName = companyName;
		this.nettoValue = nettoValue;
	}

	public int getId( )
	{
		return id;
	}

	public void setId( int id )
	{
		this.id = id;
	}

	public String getCompanyName( )
	{
		return companyName;
	}

	public void setCompanyName( String companyName )
	{
		this.companyName = companyName;
	}

	public Double getNettoValue( )
	{
		return nettoValue;
	}

	public void setNettoValue( Double nettoValue )
	{
		this.nettoValue = nettoValue;
	}

	@Override public String toString( )
	{
		return "Invoice{" +
			"id=" + id +
			", companyName='" + companyName + '\'' +
			", nettoValue=" + nettoValue +
			'}';
	}
}
