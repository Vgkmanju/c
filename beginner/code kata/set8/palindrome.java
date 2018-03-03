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
		int j,i,c=1;
		int l=n.length();
		for(i=0,j=l-1;i<l&&j>0;i++,j--)
		{
		if(n.charAt(i)==n.charAt(j))
		{
			c++;
		}
		}System.out.println(c);
		if(c==l)
		{
			System.out.println("yes");
		}
		else
		System.out.println("no");
		
	}
}
	
