import java.lang.*;
class Box{
	//3 instance varaibles-object varaibles-object
	double  w,h,d;
	///Instance method
	 double  volume(double w,double  h ,double d)
	{
		this.w=w;//assing value to instance varaible w
		this.h=h;
		this.d=d;
		return (this.w*this.h*this.d);
	}
}
	
class BoxMain
{
//define main()
public static void main(String args[])
{
	//Create Object for Box
		Box b1=new Box();
	
	
	double result=b1.volume(10.1,3.1,2.1);//60.
  System.out.println("Box-b1 volume"+result);
  Box b2=new Box();
  
  
  result=b2.volume(9,3,4);
  System.out.println("Box b2 "+result);//504. 
	
	
}
}