import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation 
{

	String ignoreSpecial = "_,.,-";
	//private static Pattern passwordRegularExpression =Pattern.compile("^[a-zA-Z0-9]*[.,/-90*&^%$#@!~`]+{8}+$");
	private static Pattern passwordRegularExpression =Pattern.compile("^([a-zA-Z0-9]*[!@#$%^&\\s]+[a-zA-Z0-9]*)+$");
	
	public static boolean isPasswordValid(String password) 
	{
		boolean result = false;
		if(password.length()==8)
		{
			Matcher match =passwordRegularExpression.matcher(password);
			if(match.matches())
			{
				result = true;
			}
		}
		else
		{
			result = false;
		}
		return result;
	}
}
