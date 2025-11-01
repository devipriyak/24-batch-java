class PrintTable
{
	synchronized void display(int n)	{
		for(int i=1;i<=10;i++)
		{
		
		System.out.println(n+"*"+i+"="+(i*n));
		}
	}
}
		class MyThread extends Thread{
			PrintTable p;
			int n;
			//constructor
			MyThread(PrintTable p,int n)
			{
				this.p=p;
				this.n=n;
			}
			
			public void run()
			{
				
	//call display() of PrintTable class
	p.display(n);
			
			
			
		}}
		class ThreadSynchronization
		{
			public static void main(String args[])
			{
				PrintTable p=new PrintTable();
				MyThread m1=new MyThread(p,10);
				//second thread
				MyThread m2=new MyThread(p,2);
				//start threads
				m1.start();
				m2.start();
			}
		}