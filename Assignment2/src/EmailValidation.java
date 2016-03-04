import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	private static Pattern emailsRegularExpression =Pattern.compile("^[a-zA-Z]+[A-Za-z0-9+_.-]+@(.+)$");
	
	public static boolean isValidEmail(String givenEmail) 
	{
		Matcher match =emailsRegularExpression.matcher(givenEmail);
		boolean result = false;
		
		if(match.matches())
		{
			result = true;
		}
		return result;
	}

}
