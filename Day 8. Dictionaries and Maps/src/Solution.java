import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
	public static void main(String[] argh) {
		System.out.println("Enter:");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String, Integer> fonebook = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			// Write code here
			fonebook.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.next();
			// Write code here
			if (fonebook.get(s) != null) {
				System.out.println(s + "=" + fonebook.get(s));
			} else {
				System.out.println("Not found");
			}
		}
		in.close();
	}
}
