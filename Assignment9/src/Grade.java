public class Grade 
{
	public static Object findGrade(int marks) 
	{
		Object result=null;
		if(marks > 70)
		{
			result="A";
		}
		else if(marks <=70 && marks > 60)
		{
			result = "B";
		}
		else if(marks <=60 && marks > 50)
		{
			result = "C";
		}
		else if(marks <=50 && marks > 40)
		{
			result = "D";
		}	
		else if(marks <=40 && marks > 30)
		{
			result = "E";
		}
		else if(marks <=30)
		{
			result = "F";
		}
		return result;
	}
	public static void main(String args[])
	{
		System.out.println(Grade.findGrade(20));
		System.out.println(Grade.findGrade(10));
	}
}
