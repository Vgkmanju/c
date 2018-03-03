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
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=0;
		for(int i=a;i<b;i++)
		{
		if(n==i)
		{
			c=1;
		}
		}
		if(c==1)
		{
	
			System.out.println("yes");
		}
		else
		System.out.println("no");
		
	}
}
	
