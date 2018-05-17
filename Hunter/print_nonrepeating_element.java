/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
public static void main (String[] args) throws java.lang.Exception
{
 int n,i,j,c=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[n];
for( i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
	for(j=i+1;j<n;j++){
		if(a[i]==a[j]){
			c=1;
		}
	}if(c==0){
		System.out.println(a[i]+" ");
	}
}
}
}
