import java.lang.*;
public class StringBufferDemo

{
	public static void main(String args[])
	{
		//Create StringBuffer Object-Which
		//Muttable-can can change /insert/delete character
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println("String Buffer:"+sb);
		//append
sb.append("...sleep");
System.out.println("After append"+sb);
sb.insert(5,"wakeup");
System.out.println("After INSERT AT INDEX 5: "+sb);
	sb.delete(5,11);
	System.out.println("After delete AT INDEX 5: "+sb);
	}
}

/*
Hello
Hello..sleep*/