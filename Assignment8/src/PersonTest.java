import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() 
	{
		assertEquals("Person Id 21 Person Name kaka Person City pune",new Person(21,"kaka","pune").toString());
		assertEquals("Person Id 21 Person Name kaka Person City null",new Person(21,"kaka").toString());
		assertEquals("Person Id 0 Person Name kaka Person City pune",new Person("kaka","pune").toString());
		assertEquals("Person Id 21 Person Name 108 Renuka Nagar Vidi Gharkul Person City pune",new Person(21,"108 Renuka Nagar Vidi Gharkul","pune").toString());
	}

}
