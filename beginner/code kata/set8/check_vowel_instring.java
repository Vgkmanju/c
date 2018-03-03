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
		int c=0;
		char b[]=n.toCharArray();
		for(int i=0;i<n.length();i++)
		{
		if((b[i]=='a'||b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u')||(b[i]=='A'||b[i]=='E'||b[i]=='I'||b[i]=='O'||b[i]=='U'))
		{
			c=1;
			break;
		}
		}
		if(c==1)
		{
	
			System.out.println("yes");
		}
		else
		System.out.println("no");
		
	}
}
	
