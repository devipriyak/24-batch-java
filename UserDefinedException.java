
//checked exception
class CSEBestException extends Exception

{
	
}
//create main class
class UserDefinedException
{
	public static void main(String args[])throws CSEBestException
	{
		int grade_count=70;
		if(grade_count==69)
			//raise user defined exception
		throw new CSEBestException();
	   System.out.println("Hi....");
	}
}
		
		
		
		
		
		
		