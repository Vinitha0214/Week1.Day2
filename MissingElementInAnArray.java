package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 7, 6, 8 };
		Arrays.sort(arr);
		for (int i = arr[0]; i <= arr.length; i++) {

			if (i != arr[i - 1]) {
				System.out.println("Missing number is " + i);
				break;
			} else {
				if (i == arr.length) {
					System.out.println("No missing numbers");
				}
			}

		}
	}

}
