package inheritanceP;

public class square extends shape {
	private int s;
	
	public square(String shapeName, int s) {
		super();
		this.s = s;
	}

	public double calculateArea() {
		return s*s;
	}
}
