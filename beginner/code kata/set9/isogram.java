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
		int c=0;
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		char d[]=a.toCharArray();
		for(int i=0;i<a.length();i++)
		{
			for(int j=i+1;j<a.length();j++)
			{
				if(d[i]==d[j])
				{
					c=1;
					break;
				}
			}
		}
		if(c==1)
		System.out.println("no");
		else
		System.out.println("yes");
	}
}
