import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("neter Age :: ");
		int age=sc.nextInt();
		
		try {
			if(age<18)
				 throw new AgeExection("not valid");
			else
				System.out.println("welcom to vote");
		}
		catch(AgeExection a) {
			System.out.println(a);
		}
	}

}
