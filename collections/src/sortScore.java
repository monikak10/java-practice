

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sortScore {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer>list=new ArrayList<Integer>(n);
		for(int i=0;i<n;i++)
		{
			list.add(sc.nextInt());
		}
		       
		    Collections.sort(list);    
		   for(int x:list) {
			   System.out.println(x);
		   }

		}
		
	}

