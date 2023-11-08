package day7;

public class Tasks1 {
	public static void main(String[] args) {
		String word = "banana";
		char finddup[] = word.toCharArray();

		int temp = 0;
		int nondup = 0;

		for (int i = 0; i < finddup.length; i++) {
			int count = 0;
			for (int j = i + 1; j < finddup.length; j++) {
				if (finddup[i] == finddup[j]) {
					finddup[j] = '$';
					count = count + 1;
				}

			}
			if (count >= 0 && finddup[i] != '$') {
				temp++;

				System.out.println(finddup[i] + " " + count + " " + "duplicate");

			}
			else if (count == 0&& finddup[i] != '$') {
				nondup++;
				System.out.println(finddup[i] + " " + count + " " + "non duplicate");
			}

		}
		System.out.println(temp);
		System.out.println(nondup);

	}

}
