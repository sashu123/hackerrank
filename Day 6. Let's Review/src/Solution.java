import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int space = s.nextInt();
		s.nextLine();

		for (int k = 0; k <= space; k++) {
			String str = s.nextLine();
			char[] carr = str.toCharArray();
			StringBuilder strE = new StringBuilder();
			StringBuilder strO = new StringBuilder();
			for (int i = 0; i < carr.length; i++) {
				if (i % 2 == 0) {
					strE.append(carr[i]);
				} else {
					strO.append(carr[i]);
				}
			}
			System.out.print(strE + " " + strO);
			System.out.println("");
		}

		s.close();
	}
}