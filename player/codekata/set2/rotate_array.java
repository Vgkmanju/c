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
		int c=sc.nextInt();
		int d=sc.nextInt();
		int a[]=new int[c];
		ArrayList <Integer> b=new ArrayList <Integer>();
		for(int i=0;i<c;i++)
		{
			a[i]=sc.nextInt();
			b.add(a[i]);
		}
		Collections.rotate(b,d);
		for(int i:b){
			System.out.print(i+" ");
		}
		
	}
}
