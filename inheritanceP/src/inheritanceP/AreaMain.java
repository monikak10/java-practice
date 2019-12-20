package inheritanceP;

import java.util.Scanner;

public class AreaMain {
	public static void main(String args[]) {
		int l=0,b=0,r=0,s=0,=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Rectangle");
		System.out.println("2. Square");
		System.out.println("3. Circle");
		int opt=Integer.parseInt(sc.nextLine());
		shape s1=null;
		
		if(opt==1) {
				System.out.println("enter length and breath");
				int l = Integer.parseInt(sc.nextLine());
				int b = Integer.parseInt(sc.nextLine());
				s1=new Rectangle(l,b);
		}else if(opt==2) {
				System.out.println("enter side");
				int s = Integer.parseInt(sc.nextLine());
				s1=new square(s);
		}else if(opt==3) {
				System.out.println("enter Radius");
				int radius = Integer.parseInt(sc.nextLine());
				s1=new Circle(radius);
		}
		System.out.printf("Area of %s is %.2f",s1.getShapeName(),s1.calculateArea());
		
		}
}
