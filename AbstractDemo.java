abstract class EMP
{
int no_days=25;
abstract void salary();
}
class PE extends EMP
{
void salary()
{
	int sal=no_days*5000;
	System.out.println("PE sal:"+sal);
}
}
class AbstractDemo
{
	public static void main(String args[])
	{
		//EMP e=new EMP();//wrong
		//Create Object for child class only
		PE p=new PE();
		p.salary();
		
	}
	
}