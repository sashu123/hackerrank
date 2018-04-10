import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}

class Difference {
	public int maximumDifference;
	private int[] elements;

	// Add your code here
	Difference(int[] arr) {
		elements = arr;
	}

	void computeDifference() {
		Arrays.sort(elements);
		maximumDifference = elements[elements.length - 1] - elements[0];
	}

} // End of Difference class