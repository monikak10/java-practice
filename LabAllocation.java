import java.util.*;
class Lab
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter x");
		int i=sc.nextInt();
		System.out.println("Enter y");
		int y=sc.nextInt();
		System.out.println("Enter z");
		int z=sc.nextInt();
		if(x<y && x<z)
		{
			System.out.println(x+"L1 has the minimal seating capacity");
		}
		else if(y<x && y<z)
		{
			System.out.println(y+"L2 has the minimal seating capacity");
		}
		else
		{
			System.out.println("L3 has the minimal seating capacity");
		}
	}
}