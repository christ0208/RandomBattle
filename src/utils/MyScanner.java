package utils;

import java.util.Scanner;

public class MyScanner {
	private static Scanner scan = new Scanner(System.in);

	public static String getString() {
		return scan.nextLine();
	}
	
	public static int getInt() {
		int input = 0;
		try {
			input = scan.nextInt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			input = -1;
		}
		scan.nextLine();
		return input;
	}
}
