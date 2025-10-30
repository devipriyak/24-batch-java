final class Father
{//land() is inherited to child but cantt override
	final void land()
	{
		System.out.println("Land");
	}
	void car()
	{System.out.println("Father car");
	}
}
class Child extends Father{
	void car()
	{
		System.out.println("Child car");
	}
}
class FinalDemo
{
	public static void main(String args[])
	{
		Child c=new Child();
		c.land();
		c.car();
	}
}