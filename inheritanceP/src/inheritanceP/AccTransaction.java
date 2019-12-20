package inheritanceP;
import java.util.Scanner;

public class AccTransaction {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter account no");
		String acc=sc.nextLine();
		
		System.out.println("Enter balance");
		int bal=Integer.parseInt(sc.nextLine());
		
		Account a=new Account("10001",50000);
	
	System.out.println("Enter 1 to deposit an amount, 2 to withdraw an amount");
	int opt=Integer.parseInt(sc.nextLine());
	
	switch(opt) {
	case 1:
			if(opt==1) {
				System.out.println("Enter the amount to deposit  ");
				int amt=sc.nextInt();
				a.deposit(amt);
				break;
			}
	case 2:  if(opt==2) {
				System.out.println("Enter the amount to withdraw");
				int amt=sc.nextInt();
				a.withdraw(amt);
				break;
			}
	default:
			System.out.println("wrong number");
			break;
	}
	
	}
}