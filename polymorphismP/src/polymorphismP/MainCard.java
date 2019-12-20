package polymorphismP;
import java.util.Scanner;

public class MainCard {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		Card c1=new MembershipCard("abc","4545","20/11/2020",10);
		Card c2=new PaybankCard("john","12351","15/01/2022",5000,80000);
		System.out.println("select the card \r\n"+"1.payback card \r\n" +"\r\n" + "2.Membership Card");
		int menu=Integer.parseInt(sc.nextLine());
		
		switch(menu) {
		case 1:
			if(menu == 1) {
				System.out.println("enter the card details: ");
				String name=sc.nextLine();
				c2.setHolderName(name);
				String number=sc.nextLine();
				c2.setCardNumber(number);
				String d=sc.nextLine();
				c2.setExpiryDate(d);
				
				System.out.println("enter points in card");
				int point =Integer.parseInt(sc.nextLine());
				
				System.out.println("enter amount");
				double amt =Double.parseDouble(sc.nextLine());
				c2.display();
				break;
			}
		case 2:
			if(menu == 2) {
				System.out.println("enter the card details: ");
				String name1=sc.nextLine();
				c1.setHolderName(name1);
				String number1=sc.nextLine();
				c1.setCardNumber(number1);
				String d1=sc.nextLine();
				c1.setExpiryDate(d1);
				
				System.out.println("enter rating in card");
				long rate =Long.parseLong(sc.nextLine());
				c1.display();
				break;
				
			}
			
				
			}
		}
	
	
	
	
		
}
