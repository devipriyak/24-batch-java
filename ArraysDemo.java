import java.util.*;
class  ArraysDemo
{
public static void main(String args[])
{
int[] a={10,45,9,20,11,132,45};
int[] b={10,45,9,20,11,132,45};
   System.out.println("Is it equal:"+ Arrays.equals(a,b));
System.out.println("Before sorting");
for(int no:a)
	System.out.println(no);
Arrays.sort(a,3,7);//sort is static()start to end-1
System.out.println("After sorting");
for(int no:a)
	System.out.println(no);
	}
	}