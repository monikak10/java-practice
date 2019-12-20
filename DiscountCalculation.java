import java.util.*;
class DiscountCal
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Price of item 1 : ");
		double item1=sc.nextDouble();
		System.out.println("Price of item 2 : ");
		double item2=sc.nextDouble();
		System.out.println("Discount in percentage :");
		int dis=sc.nextInt();
		
	    double total=item1+item2;
		System.out.printf("Total amount:$ %.2f\n",total);
		double saved=(total/dis);
		double disAmt=total-saved;
		System.out.printf("Discount amount:$ %.2f\n",disAmt);
		System.out.printf("Saved amount:$ %.2f\n",saved);
	}
}