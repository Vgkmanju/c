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
		char temp;
		String s=sc.next();
		char a[]=s.toCharArray();
		for(int i=0;i<s.length();i+=2)
		{
		temp=a[i];
		a[i]=a[i+1];
		a[i+1]=temp;
		}
		for(int i=0;i<s.length();i++)
		{
			System.out.print(a[i]);
		}
	}
}
