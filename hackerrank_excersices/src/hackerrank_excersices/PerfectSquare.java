package hackerrank_excersices;

import java.util.Scanner;

public class PerfectSquare {
	
	public static int isPerfectSquare(int n) {
		return n%2==0 ? 1:0;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-->0) {
			int n = scanner.nextInt();
			System.out.println(isPerfectSquare(n));
		}
	}
}
