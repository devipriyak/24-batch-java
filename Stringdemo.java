class Stringdemo
{
	public static void main(String args[])
	{
		//Create String object String(String s)
		String s1=new String("Hello");
		System.out.println("String s1 is"+s1);	
		//create String(char[] value)
		char[] value={'c','s','e','-','a'};
		String s2=new String(value);
		System.out.println("String s2  is "+s2);	
		byte[] b={65,66,88,89};
		String s3=new String(b);
		System.out.println(" s3 using byte[]"+s3);
	}
}
		