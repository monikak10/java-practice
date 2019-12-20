import java.lang.*;
import java.util.*;
class Organization
{
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the content of the document");
		String str1=sc.nextLine();
		System.out.println("Enter the old name of the company");
		String str2=sc.nextLine();
		System.out.println("Enter the new name of the company");
		String str3=sc.nextLine();
		
		String str=str1.replace(str2,str3);
		System.out.println(str);
		
	}
}	
		
		
		
		