import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation 
{

	String ignoreSpecial = "_,.,-";
	private static Pattern passwordRegularExpression =Pattern.compile("^[a-zA-Z0-9/,.~`|-]{8}+$");

	public static boolean isPasswordValid(String password) 
	{
		Matcher match =passwordRegularExpression.matcher(password);
		boolean result = false;
		
		if(match.matches())
		{
			result = true;
		}
		return result;
	}
}
