import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int count=0;
		int count1=0;
		int count2=0;
		String c=sc.nextLine();
		for(int i=0;i<c.length();i++)
		{
			if(Character.isDigit(c.charAt(i)))
			{
				count++;
			}
			else if(Character.isAlphabetic(c.charAt(i)))
			{
				count1++;
			}
			else
			{
				count2++;
			}
		}
		if(count>0&&count1>0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
