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
		int rem=0,sum=0;
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.print(sum);
	}
}
