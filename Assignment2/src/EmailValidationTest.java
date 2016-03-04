import static org.junit.Assert.*;
import org.junit.Test;
public class EmailValidationTest 
{
	@Test
	public void testFailure() 
	{
		assertFalse("InValid",EmailValidation.isValidEmail("rajgmial.com"));
		assertFalse("InValid",EmailValidation.isValidEmail("rajgmial."));
		assertFalse("InValid",EmailValidation.isValidEmail("12344@gmail.com"));
		assertFalse("InValid",EmailValidation.isValidEmail("1233raj"));
		assertTrue("Valid",EmailValidation.isValidEmail("a1234@.com"));
		assertTrue("Valid",EmailValidation.isValidEmail("raj123@gmail.com"));
		assertTrue("Valid",EmailValidation.isValidEmail("raj45raj@gmail.in"));
	}
}
