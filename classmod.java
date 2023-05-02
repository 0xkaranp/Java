class Employee
{
    int id;
    String name;
    public void printDetails()
    {
        System.out.println("The id is "+id);
        System.out.println("The name is "+name);
    }

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
		
	    harry.printDetails();
	    john.printDetails();
		
	}
}
