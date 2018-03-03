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
		Scanner s=new Scanner(System.in);
		int count=0,i;
		String n=s.nextLine();
		int l=n.length();
		for(i=0;i<l;i++)
		{
			if(n.charAt(i)==' ')
			count++;
		}
				System.out.println(count);
				
		
	}
}
