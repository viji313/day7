package day7;

public class Tasks6 {
	public static void main(String[]args)
	{
		String name="this is name this is home";
		String str[]=name.split(" ");
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.print(" "+str[i]);
		}
	}

}
