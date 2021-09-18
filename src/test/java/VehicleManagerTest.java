import oop.vehicles.*;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleManagerTest
{
	@Test
	public void testVehicleManager()
	{
		VehicleManager vehicleManager = new VehicleManager();

		Bike bike = new Bike("bk", 999.0, 4, Bike.BikeType.MOUNTAIN);
		vehicleManager.addVehicle( bike );

		vehicleManager.addVehicle( new Truck( "Vovlo", 99999.99, 222, Car.GearType.AUTO, 5, 1000 ) );
		vehicleManager.addVehicle( new Car("Vovlo",  20000.0, 1221, Car.GearType.AUTO, 5) );

		int result = vehicleManager.numOfVehicleByGivenBrand( "Vovlo" );
		assertEquals(2, result  );
	}

	@Test
	public void testGetVehicle()
	{
		VehicleManager vehicleManager = new VehicleManager();
		Vehicle veh = vehicleManager.getVehicle( 1 );
		assertNull(veh);

		vehicleManager.addVehicle( new Truck( "Vovlo", 99999.99, 222, Car.GearType.AUTO, 5, 1000 ) );
		Vehicle veh2 = vehicleManager.getVehicle( 0 );
		assertNotNull(veh2);

	}
}
