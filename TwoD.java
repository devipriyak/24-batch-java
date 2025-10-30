class TwoD
{
public static void main(String args[])
{//Declare String array-4*3
String s[][]=new String[4][3];
//INitilization
s[0][0]="Java";
s[0][1]="C";
s[0][2]="DM";
s[1][0]="Python";
s[1][1]="CO";
s[1][2]="soft skilss";
//print
System.out.println(s[1][2]);//soft
System.out.println(s[0][0]);//java
System.out.println(s[3][2]);//null
}
}