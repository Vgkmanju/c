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
		int n=sc.nextInt();
		int m=sc.nextInt();
		int p=n*m;
		int i,j,c=0;
		for(i=2;i<p;i++)
		{
			for(j=1;j<p;j++)
			{
			if(p==Math.pow(i,j))
			{
			c=1;
			break;
			}
			
			}
		}
		if(c==1)
		System.out.print("yes");
		else
		System.out.print("no");
	}
}
	
