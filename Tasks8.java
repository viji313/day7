package day7;

import java.util.Arrays;

public class Tasks8 {
	public static void main(String[]args)
	{
		int a[]= {2,3,5,1,6,8};
		Arrays.sort(a);
		//for(int i=0; i<a.length;i++)
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}

}
