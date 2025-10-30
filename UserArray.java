import java.util.*;
class UserArray
{
	//main
	public static void main(String args[])
	{
		//Object of Scanner Class
		Scanner scan=new Scanner(System.in);
		//Declare an array
		int size=5;
		int sum=0;
		int[] marks=new int[size];
		//read elements
		System.out.println("Enter "+size+"elements");
		for(int i=0;i<marks.length;i++)
		{	marks[i]=scan.nextInt();
		}
		System.out.println("Before sorting");
		for(int i=0;i<marks.length;i++)
		{
			
System.out.println(marks[i]);
			
		}
		Arrays.sort(marks);
	
	System.out.println("AFter sorting");
		for(int i=0;i<marks.length;i++)
		{
			
	System.out.println(marks[i]);
			
		}
		
	}
}