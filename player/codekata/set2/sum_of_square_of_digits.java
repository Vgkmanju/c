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
		int temp,rem,sum=0;
		while(c!=0)
		{
		rem=c%10;
		sum+=rem*rem;
		c=c/10;
		}
			System.out.print(sum);
		
		
	}
}
