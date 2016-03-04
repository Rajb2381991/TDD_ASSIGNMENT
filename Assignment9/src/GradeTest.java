import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() 
	{
		assertEquals("A",Grade.findGrade(71));
		assertEquals("B",Grade.findGrade(61));
		assertEquals("C",Grade.findGrade(51));
		assertEquals("D",Grade.findGrade(41));
		assertEquals("E",Grade.findGrade(31));
		assertEquals("F",Grade.findGrade(10));
		assertEquals("C",Grade.findGrade(56));
	}

}
