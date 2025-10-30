import java.lang.*;

class ForEachDemo
{
	public static void main(String args[])
	{
		String arr[]={"JAVA","FUllstack","MEANSTACK"};
	System.out.println("Access array using traditional for loop");
		for(int i=0;i<=2;i++)
			System.out.println(arr[i]);
		
	System.out.println("Access array using  for-each loop");
	for(    String  i:arr)
		System.out.println(i);
		
	}//main
}//class

	
	
	
	
	