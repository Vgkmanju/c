/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0;
		int b[]=new int[a];
		for(int i=0;i<a;i++)
		{
		 b[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++)
		{
		 sum=sum+b[i];
		}
		System.out.println(sum);
	}
	
}
