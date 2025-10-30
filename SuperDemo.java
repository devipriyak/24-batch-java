class EMP
{
int no_days=25;
int y=67;
void display()
{
System.out.println("Nof days Employee working:"+no_days);
}
}
class Faculty extends EMP
{
int no_days=20;
void show()
{
System.out.println("Nof days Faculty working:"+no_days);
System.out.println("Nof days Employee 	working:"+super.no_days);//25
super.display();
}
}
class SuperDemo
{
	public static void main(String args[])
	{
		//Create Object for child class only
		Faculty f=new Faculty();
		f.show();
		super.display();
	}
	void xx(){super.display();}
}