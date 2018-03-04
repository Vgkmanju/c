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
    int count=1;
    int k=s.nextInt();
   for(int i=0;i<=a;i++){
       if(i%2!=0){
            if(count==k){
               System.out.print(i);

           }
            count++;
       }

	}
}
}
