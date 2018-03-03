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
     
     int a=0;
     int b=0;
     Scanner sc=new Scanner(System.in);
     String s=sc.next();
     char c[]=s.toCharArray();
     for(int i=0;i<c.length;i++){
         if((c[i]>='A'&&c[i]<='Z')||(c[i]>='a'&&c[i]<='z')){
             a=1;
         }
    else if(c[i]>='0'&&c[i]<='9'){
        b=1;
 }
     }
     int sum=a+b;
     if(sum==2){
         System.out.println("yes");
     }
 else{
         System.out.print("no");
 }
}
}
