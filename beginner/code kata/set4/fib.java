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
		int n,a=0,b=1,t;
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{if(i<=1){t=i;}
		else{
			t=a+b;
			a=b;
			b=t;}
			System.out.print(t+" " );
		}
				
				
		
	}
}
