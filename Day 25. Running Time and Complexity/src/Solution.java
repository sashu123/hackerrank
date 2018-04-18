import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i <= n - 1; i++) {
			ar[i] = s.nextInt();
		}

		for (int k : ar) {
			int count = 0;

			foo: for (int x = 1; x < k; x++) {

				while (k > 0) {
					if (k % x == 0) {
						count++;
						if (count > 2) {
							count = 0;
							System.out.println("Not Prime");
							break foo;
						}
					}
					if (count == 2) {
						System.out.println("Prime");
					}
				}
			}
		}
	}
}