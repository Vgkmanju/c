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
	    int a=s.nextInt();
	    int c=0;
	    int t;
	    while(a!=0)
	    {
	    	t=a%10;
	    	c++;
	    	a=a/10;
	    }
	    System.out.println(c);
	    
	}
}
