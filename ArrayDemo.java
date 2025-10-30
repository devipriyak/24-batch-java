class ArrayDemo
{
	//main
	public static void main(String args[])
	{
		//Declare an array
		String[] names=new String[3];
System.out.println("First element :"+names[0]);
System.out.println("Second element :"+names[1]);
System.out.println("Third element :"+names[2]);
	//assign values
	names[0]="priya";
	names[1]="Java";
	names[2]="cseA";
System.out.println("First element :"+names[0]);
System.out.println("Second element :"+names[1]);
System.out.println("Third element :"+names[2]);
for(String word:names)
{
	System.out.println(word);
}
	}
	}	
		
