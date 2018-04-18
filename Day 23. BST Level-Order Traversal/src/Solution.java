import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
	int data;
	Node left, right;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

class Solution {
	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
	}

	static void levelOrder(Node root) {
		// Write your code here
		Queue<Node> myQ = new LinkedList();
		myQ.add(root);

		while (!myQ.isEmpty()) {
			Node current = myQ.remove();
			System.out.print(current.data + " ");
			if (current.left != null) {
				myQ.add(current.left);
			}
			if (current.right != null) {
				myQ.add(current.right);
			}
		}

	}
}