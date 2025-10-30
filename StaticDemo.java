class A
{
	//instance varaibles
	int rollno;//Dependent on object
	int dob;//Dependent on object
	//class varaible
	static String branch;//common to all objects
	
}
class StaticDemo
{
	public static void main(String args[])
	{
		A a=new A();
		A b=new A();
		a.rollno=90;
		a.dob=26;
		//Access class varaible using ClassName
		A.branch="CSE";
		System.out.println("A -class a object");
System.out.println(a.rollno+ " "+a.dob+ ""+A.branch);
		System.out.println("A -class b object");
		System.out.println(b.rollno+ " "+b.dob+ ""+A.branch);
		System.out.println("Math class static varaibles");
		System.out.println("Math.E"+Math.E);
		System.out.println("Math.PI"+Math.PI);
	}
}
//Note:
//Math class have static varaibles and static methods.
