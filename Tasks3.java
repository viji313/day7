package day7;

public class Tasks3 {
	public static void main(String[] args) {
		int a[] = { 1, 2, 2, 3, 4, 4, 5 };
		int temp = 0;
		
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[j] = '$';
					count++;
				}
				
			}
			
			if (count >0 && a[i] != '$') {
				temp++;
             System.out.println(a[i]);
			}
		}
        System.out.println("count "+temp);
        
        
	}

}
