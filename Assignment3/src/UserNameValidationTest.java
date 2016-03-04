import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserNameValidationTest 
 {
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() 
	{
		assertFalse(UserNameValidation.isUsernameValid(";"));
		assertFalse(UserNameValidation.isUsernameValid("%"));
		assertFalse(UserNameValidation.isUsernameValid("raj"));
		assertFalse(UserNameValidation.isUsernameValid("rajeshe/"));
		assertFalse(UserNameValidation.isUsernameValid("rajesh\""));
	}

}
