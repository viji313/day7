package day7;

public class Revision {
	public static void main(String[]args)
	{
		String name[]= {"language","sky","cloud","bright","sunlight"};	
		for(int i=0;i<name.length;i++)
		{
			if(name[i].length()%2==0) {
			System.out.println(name[i].substring(name[i].length()/2-1,name[i].length()/2+1));
			}
			else if(name[i].length()%2!=0)
			{
				System.out.println(name[i].charAt(name[i].length()/2));
			}
		}
			
	}
	}
