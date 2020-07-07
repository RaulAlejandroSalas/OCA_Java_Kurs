package hackerrank_excersices;

import java.util.Scanner;

public class FindSubstring {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s  = scanner.next();
		String substr = "";
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		System.out.println(s.substring(start,end));
		scanner.close();
		
	}
}
