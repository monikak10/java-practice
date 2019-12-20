import java.lang.*;
import java.util.*;
class DOF2
{
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the day number");
		int x=Integer.parseInt(sc.nextLine());
		
		String[] day;
		day=new String["Sun"];
		day=new String["Mon"];
		day=new String["Tue"];
		day=new String["Wed"];
		day=new String["Thu"];
		day=new String["Fri"];
		day=new String["Sat"];
	
		int index=x%7;
		System.out.println("Day of the week is "+day[index]);
		
		
	}
}	
	