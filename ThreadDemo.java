//Create Thread-FIrstThread
class FirstThread extends Thread
{
	//thread logic
public void run()
{
	for(int i=1;i<=10;i++)
		System.out.println("First Thread:"+i);
}//run	
	}//class

	//SecondThread class
	class SecondThread extends Thread{
		public void run()
		{
			for(int i=0;i<=10;i++)
				System.out.println("Second Thread:"+i);
		}
	}
	
		//Main
		class ThreadDemo
				{
		public static void main(String args[])
		{
			//Create Object of FirstThread
			FirstThread f=new FirstThread();
			//Create Object of Second Thread
			SecondThread s=new SecondThread();
			//call run() first Thread
			f.start();//calls run()
		s.start();//calls run() of second thread}
		}
}
			
			
		
	