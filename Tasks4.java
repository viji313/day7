package day7;

public class Tasks4 {
	public static void main(String[]args)
	{
		String name="2-1+3";
		String word[]= name.split("-");
		int num= Integer.parseInt(word[0]);
		String value[]=word[1].split("\\+");
		int num1= Integer.parseInt(value[0]);
		int num2= Integer.parseInt(value[1]);
		
		int sum = num-num1+num2;
		System.out.println(sum);
		
	}

}
