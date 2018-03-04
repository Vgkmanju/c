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
		String b="";
		String c="";
		char d[]=a.toCharArray();
		for(int i=0;i<a.length();i++)
		{
			if(i%2==0)
			{
				b+=d[i];
			}
			else
			c+=d[i];
		}
		System.out.println(b+" "+c);
	}
}
