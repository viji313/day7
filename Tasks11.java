package day7;

public class Tasks11 {
	public static void main(String[]args)
	{
		String name="java is a programming language";
		String str[]=name.split(" ");
		int num= str.length;
		String val= str[num-1];
		String pali="";
		for(int i=val.length()-1;i>=0;i--)
		{
			pali=pali+val.charAt(i);
		
		if(str[i]==pali)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
		}
	}

}
