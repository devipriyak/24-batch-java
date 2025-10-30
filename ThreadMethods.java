//Methods of Thread class
class MyThread extends Thread
{
	//thread logic
	public void run()
	{
		for(int i=1;i<=10;i++)
System.out.println(this.getName()+":"+i);
	
	}//run
}//class
class ThreadMethods
{
	public static void main(String a[])
	{
		//Create Object
		MyThread m1=new MyThread();
		System.out.println(m1.getName());
		//Cretae one more Object
		
	m1.setDaemon(true);
	
	MyThread m2=new MyThread();
		//change thread-1 to Java-thread
		 m1.start();
		 m2.start();
		 m2.setName("Java Thread");
		 System.out.println("New Name of M2"+m2.getName());
System.out.println("Thread priority of M1:"+m1.getPriority());
System.out.println("Thread priority of m2:"+m2.getPriority());
m1.setPriority(Thread.NORM_PRIORITY+2);
System.out.println("Thread priority of M1:"+
m1.getPriority());
System.out.println("Thread priority of m2:"+m2.getPriority());

		//isAlive
		System.out.println("M1 Thread is It ALive"+m1.isAlive());
		System.out.println("M1 Thread is It ALive"+m2.isAlive());
	//isDaemon
	System.out.println("M1 Is it Background"+m1.isDaemon());
	
	System.out.println("M2 Is it Background"+m2.isDaemon());
	//change m1 thread from user to daemon
	
	System.out.println("M1 Is it Background"+m1.isDaemon());
	
	System.out.println("M2 Is it Background"+m2.isDaemon());
	
	}
}