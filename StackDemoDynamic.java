import java.lang.*;
import java.util.*;

class StackDemoDynamic
{
	public static void main(String args[])
	{
			//create object for Scanner class
			Scanner scan=new Scanner(System.in);
			//create stack
		Stack<Integer> stack=new Stack<Integer>();
System.out.println("Enter how many elements you want?");
int elements=scan.nextInt();
System.out.println("enter "+ elements+" subject grades");
for(int i=1;i<=elements;i++)
{
	//read integer values
	int grade=scan.nextInt();
	//push grade into stack
	stack.push(grade);	
}
System.out.println("III-SEM-CSE-A students Grades");
//Desplay elements from stack using for()each
	for(Integer  i:stack)
		System.out.println(i);
	
	}//main
}//class

	
	
	
	
	