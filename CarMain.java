class Car

{
String company="BMW";
int year=2020;
void displayDetails()

{
	System.out.println(company+ " "+year);
	
}
void show()
{
	System.out.println("Hello I am show from Car class");
}

}//car 
class CarMain
{
	public static void main(String args[])
	{
		//to access Car class and methods
		//Create Object for Car class
		//classname objectref=new classname();
Car c=new Car();
//call methods-Objectref.methodName();
c.displayDetails();
c.show();

c.company="TATA";
c.year=2025;
c.displayDetails();
	}
	
}