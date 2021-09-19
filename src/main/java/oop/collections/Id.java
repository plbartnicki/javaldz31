package oop.collections;

import java.util.Objects;

//przyklad wrapper
public class Id
{
	private Integer idValue;

	//jesli pole jest statyczne to wszystkie obiejjty tej klasy wspoldziela to pole (a nie maja swojej kopii)
	private final static String info = "the value of id contains only digits";

	public Id( Integer idValue )
	{
		this.idValue = idValue;
	}

	public Integer getIdValue( )
	{
		return idValue;
	}

	@Override public String toString( )
	{
		return "Id{" +
			"idValue=" + idValue +
			'}';
	}

	//jesli nie nadpiszemy (zaimplementujemy) metody equals to w kolekcjach opartych na haszowaniu to bedzie uzyta
	//implementacja equals z klasy Object ktora porownuje adresy obiektow
	//!!dlatego bardzo jest wazne zeby do kazdej klasy ktorej obiekty bedziemy dodawac do kolekcji opartej na
	//haszowaniu, dodawac z a r o w n o    equals jak i hashode (ktory w domslnej implementacji jest liczony na podstawie adresu obiektu)

	@Override public boolean equals( Object o )
	{
		if ( this == o )
			return true;
		if ( o == null || getClass( ) != o.getClass( ) )
			return false;
		Id id = ( Id ) o;
		return idValue.equals( id.idValue );
	}

	@Override public int hashCode( )
	{
		return Objects.hash( idValue );
	}
}
