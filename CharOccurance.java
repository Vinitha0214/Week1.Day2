package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		char chr = 'e';
		int count = 0;
		int length = str.length();

		for (int i = 0; i < length; i++) {

			if (str.charAt(i) == chr)

			{
				count++;
			}
		}
		System.out.println(count);

	}

}
