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
		String a[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		String c=sc.next();
		if(c.equals(a[5])||c.equals(a[6]))
		{
			System.out.println("yes");
		}
		else
		System.out.println("no");
	}
}
