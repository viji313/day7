package day7;

public class Tasks9 {
	public static void main(String[]args)
	{
		int num[]= {21,22,3,41,34,60};
		int max=0;
		int secmax=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>max)
			{
				secmax=max;
				max=num[i];
			}
		
			if(num[i]>secmax && num[i]!=max)
			{
				secmax=num[i];
			}
		}
		
		System.out.println(max);
		System.out.println(secmax);
	}

}
