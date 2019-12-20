import java.lang.*;
import java.util.*;
class DOF2
{
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the day number");
		int i=sc.nextInt();
		String[] day=new String[7];
		day[0]="Sun";
		day[1]="Mon";
		day[2]="Tue";
		day[3]="Wed";
		day[4]="Thu";
		day[5]="Fri";
		day[6]="Sat";
	
		System.out.println("Day of the week is "+day[i]);
		
		
		
	}
}	
	