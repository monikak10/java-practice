package polymorphismP;

public class Delivery {
	void displayDeliveryDetails(String bowler,String batsman) {
		System.out.println("player details");
		System.out.println("Bowler"+bowler);
		System.out.println("Batsman"+batsman);
	}
	void displayDeliveryDetails(long runs) {
		System.out.println("Number of scored in the delivery: "+runs);
	}
}
