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
		String n=sc.next();
		char a[]=n.toCharArray();
		int l=n.length();
		if(l%2==0){
			a[(l/2)-1]='*';
			a[l/2]='*';
		}
		else
		{
			a[l/2]='*';
		}
	
		for(int i=0;i<l;i++)
		{
			System.out.print(a[i]);
		}
		
		
	}
}
	
