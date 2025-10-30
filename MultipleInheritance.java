class Father
{
	void land()
	{
		System.out.println("Father Property -land");
		}
}	
interface IMother
{
	 int total=72;//define varibale in interface
	public abstract void car();
}
interface IBrother
{
	public abstract void jew();
}
class Daughter extends Father implements IMother,IBrother
{
	void bike()
	{ total=total+1;
		System.out.println("My bike"+total);
	}
	//Implement abstract methods of Imother,IBrother
	public void car()
	{
		System.out.println("car () of Mother-interface");
	}
	public void jew()
	{
		System.out.println("Brother jew");
	}
}
class MultipleInheritance
{
	public static void main(String args[])
	{
		//Object creation
		Daughter d=new Daughter();
		d.land();
		d.car();
		d.bike();
		d.jew();
	}
	
}