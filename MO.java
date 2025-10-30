class MathOverload
{
	int add()  //add() with No-parameters
	{
		return 5;
	}
	int  add(int x)//Defintion-add() with single integer
	{
		return x+x;
	}
	double add(double x,double y)//add() with 2 double
	{
		return x+y;
	}
	
}//class
class MO
{
	public static void main(String args[])
	{
		//create object
		MathOverload m=new MathOverload();
		//call add() twicw with different syntax
		int result=m.add();
		System.out.println("add-No parameters"+result);//5
		System.out.println("Add-Noargs"+m.add());//5
		int res1=m.add(123);//calling of sinale parameter add
		System.out.println("Single Paramer-add()"+res1);//246
		double res2=m.add(12.45,134.65);//add(double x,double y)
		System.out.println("Two arg's of double type"+res2);
		}//main close
		}//class close
		