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
		int n,k,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[k-1]);
	}
}
