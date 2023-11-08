package day7;

import java.util.Arrays;

public class Tasks10 {
	public static void main(String[]args)
	{
		int a[]= {4,3,9,8,1,2};
		int b[]= {8,2,1,4,3,9};
		
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[i])
			{
				System.out.println("equals");
				break;
				
			}
			else
			{
				System.out.println("Not equals");
			}
		}
	}

}
