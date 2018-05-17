/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
public static void main (String[] args) throws java.lang.Exception
{
 int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
	if((i%2==0)&&(a[i]%2!=0)){
		System.out.print(a[i]+" ");
	}
	if((i%2!=0)&&(a[i]%2==0)){
		System.out.print(a[i]+" ");
	}
}
}
}
