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
int v=0,z=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[n];
int b[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
Arrays.sort(a);
for(int j=0;j<n;j++)
{
for(int k=j+1;k<n;k++)
{
if(a[j]==a[k])
{
v=1;
}
}
if(v==1){
	System.out.print(a[j]);
	break;
}
}

if(v==0)
{
System.out.println("Unique");
}
}
}
