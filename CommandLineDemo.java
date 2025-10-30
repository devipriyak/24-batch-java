class CommandLineDemo
{
	public static void main(String args[])
	{
int add;
int no1,no2;
//converts possible strings into integer
no1=Integer.parseInt(args[0]);
no2=Integer.parseInt(args[1]);
add=no1+no2;
System.out.println("add"+add);
			}
}