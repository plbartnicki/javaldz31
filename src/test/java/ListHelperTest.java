import oop.collections.ListHelper;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ListHelperTest
{
	@Test
	public void testComputeArytmAverage()
	{
		//given
		List test0 = new ArrayList<>(  );

		//when
		Double actualValue = ListHelper.computeArytmAverage( test0);

		//then
		assertNull(actualValue);

		//given
		List test1 = new ArrayList<>(  );
		test1.add( 2.0 );
		test1.add( 4.0 );

		//when then
		Double expectedValue = 3.0;
		assertEquals(expectedValue , ListHelper.computeArytmAverage( test1));
	}
}
