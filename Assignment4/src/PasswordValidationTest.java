import static org.junit.Assert.*;
import org.junit.Test;

public class PasswordValidationTest 
{
	@Test
	public void testFailure() 
	{
		assertFalse(PasswordValidation.isPasswordValid(""));
		assertFalse(PasswordValidation.isPasswordValid("raj123456"));
		assertFalse(PasswordValidation.isPasswordValid("156."));
		assertFalse(PasswordValidation.isPasswordValid("...,/~`"));
	}
	@Test
	public void testSuccess()
	{
		assertTrue(PasswordValidation.isPasswordValid("raj1234."));
		assertTrue(PasswordValidation.isPasswordValid("1234567."));
		assertTrue(PasswordValidation.isPasswordValid("ra5432~,"));
	}
}
