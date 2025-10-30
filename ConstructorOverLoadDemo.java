class Box
{int width,h,d;
Box()
{
	width=10;
	h=9;
	d=6;
	System.out.println("Default-Constructor");
	System.out.println("Width,height and depth");
	System.out.println(width+ " "+h+ " "+d);
	}

//Define constructor-parameterized with3 integer parameres
Box(int w,int h,int d)
{
	System.out.println("Three Parameterized constructor");
	width=w;
	this.h=h;//assign vlaue to instance
	this.d=d;
	System.out.println(w + " "+h+ " "+d);//10 12 34
	}
	Box(int x)
	{
		width=x;
		h=x;
		d=x;
		System.out.println("single parameter");
		System.out.println(width + " "+h+ " "+d);
	}
	
	
void volume()
{
	System.out.println("volume "+ width*h*d);
}
}
class ConstructorOverLoadDemo
{
	public static void main(String ar[])
	{
		//Object
		Box b1=new Box();

   Box b2=new Box(23,2,6);
  Box b3=new Box(6);


b3.volume();
b2.volume();
b1.volume();
	}
}