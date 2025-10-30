interface icar
{
void start();
void stop();
//if required override in classes
default void break1()
{System.out.println("Default break");
}
//cant override and common to all classes
static void sound()
{
	System.out.println("Common to all classes");
}
}

class A implements icar{
	public void start()
	{
		System.out.println("Car-A started");
	}
	public void stop()
	{
	System.out.println("Car A-stop");	
}}

class B implements icar{
	public void start()
	{
		System.out.println("Car-B started");
	}
	public void stop()
	{
	System.out.println("Car B-stop");	
}
public void break1()
{
}


}

class DefaultInterface
{
	public static void main(String args[])
	{
A o=new A();
o.start();
o.stop();
o.break1();
icar.sound();
//static method is called 
//using Interfacename
		
}
}
