import java.lang.*;
import java.util.*;
public class StringBufferEx

{
	public static void main(String args[])
	{
		//Create StringBuffer Object-Which
		//Muttable-can can change /insert/delete character
	Scanner s=new Scanner(System.in);
	String name=s.next();
	StringBuffer sb=new StringBuffer(name);
	System.out.println("Orignal"+sb);
	sb.reverse();
	System.out.println("reverse:"+sb);
	//conver string buffer into string object
	String output=sb.toString();
	System.out.println("Out put of String object"+output);
		if(sb.equals(sb))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}

