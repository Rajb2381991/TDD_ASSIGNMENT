import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserNameValidation 
{

	String ignoreSpecial = "_,.,-";
	private static Pattern usernameRegularExpression =Pattern.compile("^[a-zA-Z]{5,}[^<>'\"/;`%]*$");

	public static boolean isUsernameValid(String username) 
	{
		Matcher match =usernameRegularExpression.matcher(username);
		boolean result = false;
		
		if(match.matches())
		{
			result = true;
		}
		return result;
	}
}
