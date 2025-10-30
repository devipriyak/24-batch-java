class A
{
	static int x=10;
	static int show(int x)
	{
		return x+x;
	}
	
}
class SSS
{
	public static void main(String a[])
	{
		System.out.println("Static show-"+A.show(104));
	}
}