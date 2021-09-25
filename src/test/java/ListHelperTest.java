import oop.collections.ListHelper;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.Assert.*;

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

	@Test
	public void testTheSameValues()
	{
		//given
		//dla list [1,2,1,3] oraz [3,2,2,1] metoda powinna zwrocic true
		List<Integer> listTest1a = Arrays.asList( 1,2,1,3 );
		List<Integer> listTest2a = Arrays.asList( 3,2,2,1 );

		//when
		boolean result1 = ListHelper.theSameValues(  listTest1a, listTest2a);

		//then
		assertTrue( result1 );

		//given
		//dla list [4,2,5] oraz [4,5,2,7]  -> false
		List<Integer> listTest1b = Arrays.asList( 4,2,5 );
		List<Integer> listTest2b = Arrays.asList( 4,5,2,7 );

		//when
		boolean result2 = ListHelper.theSameValues(  listTest1b, listTest2b);

		//then
		assertFalse( result2 );

		//given
		List<Integer> listTest1c = Arrays.asList(  );
		List<Integer> listTest2c = Arrays.asList(  );

		//when
		boolean result3 = ListHelper.theSameValues(  listTest1c, listTest2c);

		//then
		assertTrue( result3 );


		//given
		List<Integer> listTest1d = Arrays.asList( 1 );
		List<Integer> listTest2d = Arrays.asList(  );

		//when
		boolean result4 = ListHelper.theSameValues(  listTest1d, listTest2d);

		//then
		assertFalse( result4 );
	}

	@Test
	public void testdiffValues()
	{
		//given
		List<Double> test1 = Arrays.asList( 4.0, 5.0,2.0, 7.0 );

		//when, then
		assertTrue(ListHelper.diffValues( test1 ));

		//given
		List<Double> test2 = Arrays.asList( 4.0, 5.0,2.0, 7.0, 5.0 );

		//when, then
		assertFalse(ListHelper.diffValues( test2 ));
	}

	@Test
	public void numberOfWords()
	{
		Map<String, Integer> result1 = ListHelper.numberOfWords(Arrays.asList(  ));
		assertEquals(0, result1.size());

		Map<String, Integer> result2 = ListHelper.numberOfWords(Arrays.asList("Asia", "Agnieszka", "Basia", "Agnieszka"  ));
		assertEquals(3, result2.size());
		assertEquals(new Integer(1), result2.get( "Asia" ));
		assertEquals(new Integer(2), result2.get( "Agnieszka" ));
		assertEquals(new Integer(1), result2.get( "Basia" ));
	}

	@Test
	public void numberOfWordsUsingStreams()
	{
		Map<String, Long> result1 = ListHelper.numberOfWordsUsingSteams(Arrays.asList(  ));
		assertEquals(0, result1.size());

		Map<String, Long> result2 = ListHelper.numberOfWordsUsingSteams(Arrays.asList("Asia", "Agnieszka", "Basia", "Agnieszka"  ));
		assertEquals(3, result2.size());
		assertEquals(new Long(1), result2.get( "Asia" ));
		assertEquals(new Long(2), result2.get( "Agnieszka" ));
		assertEquals(new Long(1), result2.get( "Basia" ));
	}
}
