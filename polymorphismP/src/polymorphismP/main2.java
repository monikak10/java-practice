package polymorphismP;

import java.util.Scanner;

public class main2 {
	public static void main(String s) {
		Scanner sc=new Scanner(System.in);
		Delivery d=new Delivery();
		 System.out.println("1.players details \r\n"+"\r\n"+"2.run details of the delivery");
		 int menu=Integer.parseInt(sc.nextLine());
		 
		 switch(menu) {
		 case 1: 
			 if(menu==1) {
				 System.out.println("enter the bowler name");
				 String bowl=sc.nextLine();
				 
				 System.out.println("enter the batmans name");
				 String bat=sc.nextLine();
				 
				 d.displayDeliveryDetails(bowl,bat);
				 break;
				 
			 }
		 case 2:
			 if(menu==2) {
				 System.out.println("enter the number of runs");
				 long run=Long.parseLong(sc.nextLine());
				 d.displayDeliveryDetails(run);
				 if(run==6) {
					 System.out.println("it is a sixer");
				 }else if(run==4) {
					 System.out.println("it is a boundary");
				 }
				 break;
			 }
			 default: System.out.println("invalid data");
			 break;
		 }
	}
}
