
public class Person {

	int personId;
	String personName;
	String personCity;
	public Person(int personId,String personName,String personCity) 
	{
		this.personId = personId;
		this.personName = personName;
		this.personCity = personCity;
	}
	public Person(int personId, String personName) 
	{
		this.personId = personId;
		this.personName = personName;	
	}
	public Person(String personName, String personCity) 
	{
		this.personName = personName;
		this.personCity = personCity;
	}
	public String toString()
	{
		String result ="Person Id " + personId + " Person Name " + personName + " Person City " + personCity;
		return result;
	}
	public static void main(String args[])
	{
		System.out.println(new Person(21,"108 Renuka Nagar Vidi Gharkul","pune").toString());
	}
}
