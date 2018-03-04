/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int a,b,c=1;
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    while(a!=0)
    {
    	b=a%10;
    	c=c*b;
    	
    	a=a/10;
    }
   System.out.println(c);

	}
	
}
