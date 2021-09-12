package java;

import oop.Main;
import org.junit.jupiter.api.Test;

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
}
