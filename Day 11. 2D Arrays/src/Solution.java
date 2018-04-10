import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		in.close();
		// any temp value < 0
		int maxSum = -50;
		int sum = 0;
		for (int k = 0; k < 4; k++) {
			for (int m = 0; m < 4; m++) {
				sum = hourGlassSum(arr, k, m);
				if (sum > maxSum) {
					maxSum = sum;
				}
			}

		}
		if (sum >= maxSum) {
			System.out.println(sum);
		} else {
			System.out.println(maxSum);
		}
	}

	private static int hourGlassSum(int[][] array, int row, int col) {
		int sum;
		sum = array[row][col] + array[row][col + 1] + array[row][col + 2] + array[row + 1][col + 1]
				+ array[row + 2][col] + array[row + 2][col + 1] + array[row + 2][col + 2];
		return sum;
	}
}
