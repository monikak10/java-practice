package inheritanceP;

public class Rectangle extends shape {
	private int l1;
	private int b1;
	public Rectangle(int l1, int b1) {
		super();
		this.l1 = l1;
		this.b1 = b1;
	}
	public double calculateArea() {
		 return l1*b1;
	}
	

}
