import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int even=0;
		if(n%2==0)
		{
			even=n;
		}
		else
		{
			even=n-1;
		}
		System.out.print(even);
	}
}
