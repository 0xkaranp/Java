class Employee
{
    int id;
    String name;

}

public class Main
{
	public static void main(String[] args) 
	{
		Employee harry = new Employee();
		Employee john = new Employee();
		
		harry.id=12;
		harry.name="Harry bhau";
		
		john.id=17;
		john.name="john mane";
		
		System.out.println(harry.id);
		System.out.println(harry.name);
		System.out.println(john.id);
		System.out.println(john.name);
		
	}
}
