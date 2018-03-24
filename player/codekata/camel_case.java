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
		String s=sc.nextLine();
		s=s.toLowerCase();
		char []a=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(i==0)
			{
			a[i]=Character.toUpperCase(a[i]);
			System.out.print(a[i]);
			}
			else if(a[i]==' ')
			{
			a[i+1]=Character.toUpperCase(a[i+1]);
			System.out.print(a[i]);
			}
			else
			{
				System.out.print(a[i]);
			}
			
		}
	}
}
