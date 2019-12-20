import java.util.*;
class Compare
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int i=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		if(a>b)
		{
			System.out.println(a+"is less than"+b);
		}
		else if(a<b)
		{
			System.out.println(b+"is greater than"+a);
		}
		else if(a==b)
		{
			
			System.out.println(a+"is equal to"+b);
		}
	}
}