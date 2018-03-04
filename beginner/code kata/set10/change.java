/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int a;
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    int pl=1;
    int count=0;
   int b[]=new int[a];
   for(int i=0;i<a;i++){
       b[i]=s.nextInt();
   }
   for(int i=0;i<b.length;i++){
       if(b[i]!=pl){
           count++;

       }
       pl++;
   }
   System.out.println(count);

	}
	
}
