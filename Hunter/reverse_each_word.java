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
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String s[]=a.split(" ");
		String str="";
		//System.out.println(s.length);
		for(int i=0; i<s.length; i++)
		{
			String s1=s[i];
			String b="";
			for(int j=s1.length()-1;j>=0;j--){
			b = b + s1.charAt(j);
			}
			str=str+b+" ";
		}
		 	System.out.println(str);
	}
}
