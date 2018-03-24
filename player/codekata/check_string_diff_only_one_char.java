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
		String a=sc.next();
		String b=sc.next();
		int count=0;
		char a1[]=a.toCharArray();
		char b1[]=b.toCharArray();
		if(a1.length==b1.length)
		{
			for(int i=0;i<a1.length;i++)
			{
				if(a1[i]!=b1[i])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}
		}
		else
		{
			System.out.print("no");
		}
	}
}
