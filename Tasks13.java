package day7;

public class Tasks13 {
	public static void main(String[]args)
	{
		int num[]= {2,3,4,1,5,6,7};
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num.length;j++)
			{
				if(num[i]+num[j]==5)
				{
					System.out.println(num[i]+" "+num[j]);
				}
			}
		}
	}

}
