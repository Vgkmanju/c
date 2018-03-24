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
		String s=sc.next();
		char []a=s.toCharArray();
		char []b=new char[20];
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!='a'&&a[i]!='e'&&a[i]!='i'&&a[i]!='o'&&a[i]!='u'&&a[i]!='A'&&a[i]!='E'&&a[i]!='I'&&a[i]!='O'&&a[i]!='U')
			{
b[j]=a[i];
j++;
	}
		}
		for(int k=j-1;k>=0;k--)
		{
		System.out.print(b[k]);	
		}
			
		
		
	}
}
