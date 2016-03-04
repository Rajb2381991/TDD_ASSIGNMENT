import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IFSCCode
{

	private static Pattern IFSCCodeRegularExpression =Pattern.compile("^[A-Z|a-z]{4}[0][0-9]{6}$");
	
	public static boolean isValidIFSCCode(String code) 
	{
		Matcher match =IFSCCodeRegularExpression.matcher(code);
		boolean result = false;
		if(match.matches())
		{
			result = true;
		}
		return result;
	}

}

