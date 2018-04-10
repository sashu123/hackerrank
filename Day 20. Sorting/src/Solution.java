import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		// Write Your Code Here
		int numSwaps = 0;
		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n - 1; i++) {
				if (a[i] > a[i + 1]) {
					// TODO check why swap not working..call by value is the case?
					// swap(a[i], a[i + 1]);
					a[i] = a[i] + a[i + 1];
					a[i + 1] = a[i] - a[i + 1];
					a[i] = a[i] - a[i + 1];
					numSwaps++;
				}
			}
			if (numSwaps == 0) {
				break;
			}
		}

		System.out.println("Array is sorted in " + numSwaps + " swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[n - 1]);
	}

	static void swap(int p/* 2 */, int q/* 3 */) {
		p = p + q; // 2+3 =5
		q = p - q;// 5-3 =2
		p = p - q;// 5-2 = 3
	}
}
