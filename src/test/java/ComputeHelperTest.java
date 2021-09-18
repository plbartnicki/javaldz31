import oop.ComputeHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ComputeHelperTest
{
	@Test
	public void testFun1()
	{
		Assertions.assertEquals(1.0, ComputeHelper.fun1( 2));

		Assertions.assertEquals(0.052083333333333336, ComputeHelper.fun1( 9));
	}
}
