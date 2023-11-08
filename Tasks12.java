package day7;

public class Tasks12 {
	public static void main(String[]args)
	{
		int nums[]= {1,2,3,4,5,6};
		int temp=0;
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]>nums[j])
				{
					temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		
		System.out.println(nums[i]);
		}
	}

}
