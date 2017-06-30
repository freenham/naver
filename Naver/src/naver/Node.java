package naver;

public class Node {
	public int key;
	public String value;
	public Node left, right;

	public Node(int k, String v) {
		key = k;
		value = v;
		left = null;
		right = null;
	}
}
