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
	    int b=s.nextInt();
	    int c[]=new int[a];
	    int d=0;
	    for(int i=0;i<a;i++)
	    {
	    	 c[i]=s.nextInt();
	    }
	    for(int j=0;j<a;j++)
	    {
	    	if(c[j]==b)
	    	d++;
	    	
	    }
	    System.out.println(d);
	      
	}
}
