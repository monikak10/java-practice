import java.util.*;
class ProfitLoss
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of Dozens of toys purchased");
		int x=sc.nextInt();
		System.out.println("Enter the price per dozen ");
		int y=sc.nextInt();
		System.out.println("Enter the selling price of 1 toy");
		int z=sc.nextInt();
		
		float cp=y/12f;
		double p=z-cp;
		double pp=(p/cp)*100;
			
		System.out.println("Sam's profit percentage is "+pp+"percent");
	}
}

