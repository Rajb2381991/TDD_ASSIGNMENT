import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IFSCCodeTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFailure() 
	{
		assertFalse(IFSCCode.isValidIFSCCode("0123456HSBC"));
		assertFalse(IFSCCode.isValidIFSCCode("HCD0123456"));
		assertFalse(IFSCCode.isValidIFSCCode("HBCD1023456"));
	}
	@Test
	public void testSuccess() 
	{
		assertTrue(IFSCCode.isValidIFSCCode("HBCD0123456"));
		assertTrue(IFSCCode.isValidIFSCCode("HBCD0345346"));
		assertTrue(IFSCCode.isValidIFSCCode("dgdg0457547"));
	}

}
