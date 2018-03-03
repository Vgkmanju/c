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
		double n=sc.nextInt();
		double p,i;
		for(i=1;i<=n;i++)
		{
			p=Math.pow(2, i);
			if(p==n)
			{
				double x=Math.pow(2, i+1);
				System.out.println((int)x);
				break;
			}
		}
		
	}
}
