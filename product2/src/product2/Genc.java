package product2;

import java.util.Scanner;

public class Genc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the number of GenCs");
		int n=Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<n;i++) {
			
			System.out.println("Enter Employee Id");
			int eid=Integer.parseInt(sc.nextLine());
			//t.setEid(eId);
			
			System.out.println("Enter Name");
			String ename=sc.nextLine();
			//t.setEname(eName);
		  
		}
		Trainiee t=new Trainiee(1001,"john");
		t.display();

	}

}
