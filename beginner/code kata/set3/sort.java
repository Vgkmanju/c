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
		int n,i;
		n=s.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		int y=n/2;
		for(i=0;i<n;i++){
			if(i==y)
			{
				System.out.println(a[i]);
			}
		}
		
		
		
	}
}
