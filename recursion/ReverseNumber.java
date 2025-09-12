package recursion;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		String s = "12345";
		int length = s.length();
		reverse(s, length);

	}

	private static void reverse(String s, int length) {
		if (length == 0) {
			return;
		}
		System.out.println(s.charAt(length - 1));
		reverse(s, length - 1);


	}
}
