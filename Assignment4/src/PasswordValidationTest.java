import static org.junit.Assert.*;
import org.junit.Test;

public class PasswordValidationTest 
{
	@Test
	public void testFailure() 
	{
		assertFalse(PasswordValidation.isPasswordValid("raj1234"));
		assertFalse(PasswordValidation.isPasswordValid("raj12356"));
		assertFalse(PasswordValidation.isPasswordValid("156."));
		assertFalse(PasswordValidation.isPasswordValid("...,/~`"));
	}
	@Test
	public void testSuccess()
	{
		assertTrue(PasswordValidation.isPasswordValid("r@345608"));
		assertTrue(PasswordValidation.isPasswordValid("@1234567"));
		assertTrue(PasswordValidation.isPasswordValid("raj$rajH"));
	}
}
