import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[9]);
	}
}
