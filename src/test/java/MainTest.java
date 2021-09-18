
import oop.*;
import oop.vehicles.Bike;
import oop.vehicles.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest
{
	@Test
	public void testMaxOddNumber()
	{
		int test1[] = {2,1,4,7,6};
		int result1 = Main.maxOddNumber(test1 );
		assertEquals(7, result1);
	}

	@Test
	public void testBike()
	{
		Object bike1 = new Bike("bk", 999.0, 5, Bike.BikeType.MOUNTAIN);
		assertNotNull(bike1);

		Vehicle bike2 = new Bike("bk", 999.0, 4, Bike.BikeType.MOUNTAIN);
		assertEquals("bk", bike2.getBrand());

		Bike bike3 = new Bike("bk", 999.0, 4, Bike.BikeType.MOUNTAIN);
		assertEquals(4, bike3.getNumOfGears());

	}
}
