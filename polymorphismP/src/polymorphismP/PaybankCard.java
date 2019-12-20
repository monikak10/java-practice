package polymorphismP;

public class PaybankCard extends Card{
	private int pointsEarned; 
	private double totalAmount;
	
	public PaybankCard(String holderName, String cardNumber, String expiryDate, int pointsEarned, double totalAmount) {
		super(holderName, cardNumber, expiryDate);
		this.pointsEarned = pointsEarned;
		this.totalAmount = totalAmount;
	}
	public int getPointsEarned() {
		return pointsEarned;
	}
	public void setPointsEarned(int pointsEarned) {
		this.pointsEarned = pointsEarned;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	} 
	public void display() {
		System.out.println(getHolderName()+"Payback Card Details");
		System.out.println("getHolderName"+getCardNumber());
		System.out.println("Point Earned"+getPointsEarned());
		System.out.println("total amount"+getTotalAmount());
		
	}
	

}
