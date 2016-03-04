import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SortingCollectionTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int expecteds[] = {1,2,3,4,5};
		assertArrayEquals(expecteds,SortingCollection.sortArray(new int[]{5,4,3,2,1}));
		
		String stringarray[] = {"five","four","one","three","two"};
	
		assertArrayEquals(stringarray,SortingCollection.sortArray(new String[]{"one","two","three","four","five"}));
		
		
		
	}

}
