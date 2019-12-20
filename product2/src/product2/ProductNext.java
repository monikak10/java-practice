package product2;
import java.util.Scanner;

public class ProductNext {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the product id");
		long pid=Long.parseLong(sc.nextLine());
		
		System.out.println("Enter the product name");
		String pname=sc.nextLine();
		
		System.out.println("Enter supplier name");
		String sname=sc.nextLine();
		
		Product p=new Product(pid,pname,sname);
		p.display();
		
	}

}
