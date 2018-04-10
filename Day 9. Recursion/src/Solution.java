import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		System.out.print("Enter number to find its factorial : ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int result = factorial(n);
		System.out.println(result);
	}

	static int factorial(int n) {
		// Complete this function
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}
