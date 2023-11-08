package day7;

public class Tasks14 {
	public static void main(String[]args)
	{
		String a="onesoft";
		
		int rep=0;
		int nonrep=0;
		char ab[]=a.toCharArray();
		for(int i=0;i<ab.length;i++)
		{
		int c=0;
		for(int j=i+1;j<ab.length;j++)
		{
			if (ab[i]==ab[j])
			{
				c++;
				ab[j]='&';
				
			}
			
		}
		if(c>0 && ab[i]!='&')
		{
			rep++;
		}
		else if(c==0 && ab[i]!='&')
		{
			nonrep++;
		}
		
		}
		System.out.println("repeated"+" "+rep);
		System.out.println("non repeated"+" "+nonrep);
		}
		
	}


