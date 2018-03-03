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
		int a[]=new int[10];
		int t,i=0;
		int n=sc.nextInt();
		while(n!=0)
		{
		t=n%10;
		a[i]=t;
		i++;
		n/=10;
		}
		for(int j=i-1;j>=0;j--)
		{
			if(a[j]%2!=0)
			{
				System.out.print(a[j]+" ");
			}
		}
		
		
	}
}
	
