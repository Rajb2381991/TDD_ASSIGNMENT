public class ArrayConcatenate 
{
	public static Object concatenate(String[] strings,String delimiter) 
	{
		String  result="";
	    for (int i = 0, il = strings.length; i < il; i++) {
	            result = result + strings[i] +  delimiter;
	    }
	    return result.toString();
	}
	public static void main(String args[])
	{
		System.out.print( ArrayConcatenate.concatenate(new String[]{"one"," two ","three"}," "));
	}
}
