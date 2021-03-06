package oop.vehicles;

import java.util.ArrayList;

//służy do przechowywania kolekcji różnych pojazdów
public class VehicleManager
{
	//enkapsulowany obiekt listy (struktura danych podobna do tablicy 1D (kazdy element ma swoj indeks
	//zaczynajac od 0, 1....
	//mozemy sie spodziewac ze na kazdym obiekcie lezacym w tej liscie (car, truck, bike)  mozna wywolac metode draw (dzieki polimorfizmowi zostanie wywolana
	//wlasciwa implementacja metody draw
	private ArrayList<Vehicle> vehicles = null;

	public VehicleManager() {
		vehicles = new ArrayList<>(  );
	}

	public void addVehicle(Vehicle vehicle)
	{
		vehicles.add( vehicle );
	}

	//metoda zwraca i-ty element z listy
	public Vehicle getVehicle(int i)
	{
		if(i >= 0 && i < vehicles.size()) {
			return vehicles.get( i );
		}

		return null;  //null jest umowna informacja ze ktos podal i spoza dozwolonego zakresu
	}

	//metoda ktora zlicza ilosc pojazdow podanej jako argument marki (brand)
	public int numOfVehicleByGivenBrand(String brand)
	{
		int count = 0;
		for(Vehicle veh : vehicles) {  //dla kazdego elementu z listy vehicles  (veh referuje na biezacy analizowany element)
			if(brand.equals( veh.getBrand())) {
				count++;
			}
		}

		return count;
	}

	public void drawAllVehicles()
	{
		for(Vehicle veh : vehicles)
		{
			veh.draw( );  //zostaje wywolana odpowiednia implementacja (w zaleznosci czy veh referuje na car, bike,...)
		}
	}

}


