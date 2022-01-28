package week1.day2;

public class Palindrome {

	public static void main(String[] args) {

		String value = "madam";

		String rev = "";

		int length = value.length();

		for (int i = length - 1; i >= 0; i--)
			rev = rev + value.charAt(i);

		if (value.equals(rev))
			System.out.println("Entered string is Palindrome");
		else
			System.out.println("Entered string is not a palindrome");

	}

}
