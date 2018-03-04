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
	    int c=0;
	    String a=s.nextLine();
	    int i=0;
		char first_char;
		String temp="";
		String[] array=a.split(" ");
		
		
		for(String ss:array)
		{
			c++;
			
					
		}
		for(int j=0;j<c;j++)
		{
			char fUpper = Character.toUpperCase(array[i].charAt(0));
			array[i]=array[i].substring(1,array[i].length());
            		temp=temp + fUpper+array[i]+" ";
			i++;
                    	}
		System.out.print(temp);
		
	}

}
