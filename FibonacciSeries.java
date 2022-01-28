package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {

		int range = 8;
		int firstNum = 0;
		int secNum = 1;
		System.out.println("FibonacciSeries numbers : ");
		for (int i = 0; i < range; i++) {
			System.out.println(firstNum + "");
			int sumTwoNum = firstNum + secNum;
			firstNum = secNum;
			secNum = sumTwoNum;

		}

	}

}
