import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
				Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int count=1;
		int c=0;
		for(int i=a;i<=b;i++)
		{	
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
			c=0;break;
			}
			else
			{
			c=1;
			}
			
		}
		if(c==1)
		{count++;}
		}
		
		System.out.print(count);
	}
}
