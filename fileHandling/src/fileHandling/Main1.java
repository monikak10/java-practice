package fileHandling;
import java.io.FileInputStream;
import java.util.Scanner;

public class Main1 {
	public static void main(String args[])
	{
		try {
			System.out.println("Enter the file Name");
			Scanner sc=new Scanner(System.in);
			String s=sc.nextLine();
			FileInputStream f=new FileInputStream("C:\\practice2\\fileHandling\\src\\Player.txt");
			int i=0;
			while((i=f.read())!=-1)
			{
					System.out.print((char)i);
			}
			f.close();
		}catch(Exception e) {
			System.out.println(e);
			
		}
	}

}
