
import static org.junit.Assert.*;
import org.junit.Test;

public class ArrayConcatenateTest 
{

	@Test
	public void test() 
	{
		assertEquals("one,two,three,", ArrayConcatenate.concatenate(new String[]{"one","two","three"},","));
		assertEquals("  two three ", ArrayConcatenate.concatenate(new String[]{" ","two","three"}," "));
		assertEquals("one   three ", ArrayConcatenate.concatenate(new String[]{"one"," ","three"}," "));
		assertEquals("one   three ", ArrayConcatenate.concatenate(new String[]{"one"," ","three"}," "));
		assertEquals("one  two  three ", ArrayConcatenate.concatenate(new String[]{"one"," two ","three"}," "));
	}

}
