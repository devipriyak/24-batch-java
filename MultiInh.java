
class Father {
	Father(int x)
{
	
	System.out.println("Father construtor"+x);
}
	}
	
	class Child extends Father
	{
	Child()
	{
		super(21);
		System.out.println("I am child constructor");
	}
	}
	class MultiInh
	{
		public static void main(String args[])
		{

		Child c=new Child();
		
		}
	}