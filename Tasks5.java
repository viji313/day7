package day7;

public class Tasks5 {
	public static void main(String[]args)
	{
		String name="this is my name this is my home";
		String str[]=name.split(" ");
		int temp=0;
		for(int i=0;i<str.length;i++)
		{
			int count=0;
			for(int j=i+1; j<str.length;j++)
			{
				if(str[i].equals(str[j]))
						{
						str[j]="$";
						count=count+1;
						}
				
			}
		
			if(count>0 && str[i]!="$")
			{
				temp++;
				System.out.println(str[i]+" "+count);
			}
			
		}
		System.out.println(temp);
	}

}
