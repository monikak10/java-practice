import java.util.*;
class RedCross2
{
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();

		int a[]=new int[n];
		int i=0,sum=0;
		while(i<n)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
			i++;
		}
		System.out.println(sum);
	}
}