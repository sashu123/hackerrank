import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		StringBuffer numBin = new StringBuffer();
		while (n > 0) {
			int rem = n % 2;
			numBin.append(rem);
			n = n / 2;
		}

		String[] strArr = numBin.toString().split("0");
		int max = strArr[0].length();
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].length() > max) {
				max = strArr[i].length();
			}
		}
		System.out.println(max);

	}
}