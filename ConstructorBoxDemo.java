class Box
{
int width,h,d;
//Define constructor
Box(int w,int h,int d)
{
	System.out.println("Parameterized constructor");
	width=w;
	this.h=h;
	this.d=d;
	System.out.println(w + " "+h+ " "+d);//10 12 34
	
}
void volume()
{
	System.out.println(width*h*d);
}
}
class ConstructorBoxDemo
{
	public static void main(String ar[])
	{
		
		//Object
Box b1=new Box(10,12,'A');
//call method 
b1.volume();



	}
}