interface i1
{
	void car();
}
class A implements i1{
	public void car()
	{
	
	System.out.println("Red acr by A");
	
	}
}
class B implements i1{

	public void car()
	{
	
	System.out.println("Black car by B");
	
	}
}
class Main
{
	public static void main(String args[])
	{
		A a=new A();
		B b=new B();
		a.car();
		b.car();
	}
}
