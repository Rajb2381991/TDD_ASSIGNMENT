import static org.junit.Assert.*;
import org.junit.Test;

public class PasswordValidationTest 
{
	@Test
	public void testFailure() 
	{
		assertFalse(PasswordValidation.isPasswordValid("raj123456"));
		assertFalse(PasswordValidation.isPasswordValid("156."));
		assertFalse(PasswordValidation.isPasswordValid("...,/~`"));
		
	}
	@Test
	public void testSuccess()
	{
		assertTrue(PasswordValidation.isPasswordValid("raj123456."));
		assertTrue(PasswordValidation.isPasswordValid("12345678."));
		assertTrue(PasswordValidation.isPasswordValid("rag5432q,||`~.,"));
	}
}
