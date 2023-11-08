package day7;

public class Task14 {
	public static void main(String[]args)
	{
		String a="abcd";
		
		for(int i=0;i<a.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				
				System.out.print(a.charAt(i));
			}
			System.out.println();
		}
		
	}

}
