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
		int a=sc.nextInt();
		String b=sc.next();
		int c=sc.nextInt();
		if(b=="%")
		{
			int x=a%c;
			System.out.println(x);
		}
		else{
			int y=a/c;
			System.out.println(y);
		}
		
	}
}
