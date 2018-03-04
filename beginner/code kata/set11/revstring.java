/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s=new Scanner(System.in);
	    String a=s.next();
	    int b=s.nextInt();
	    StringBuilder d=new StringBuilder(a).reverse();
	    String x=d.toString();
	    char c[]=x.toCharArray();
	for(int i=0;i<b;i++){
		System.out.print(c[i]);}

	}
	
}
