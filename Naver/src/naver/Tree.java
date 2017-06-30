package naver;

public class Tree {
	private Node root;

	private Node insert(Node p, int key, String value) {
		if (p == null) // 비어있을 경우에
			p = new Node(key, value); // 새로운 노드 생성
		else if (key < p.key) // 입력된 키가 작을 경우
			p.left = insert(p.left, key, value); // 왼쪽으로 삽입
		else
			p.right = insert(p.right, key, value); // 그 이외는 오른쪽
		return p;
	}

	public void insert(int key, String value) { // 삽입 생성자
		root = insert(root, key, value);
	}

	private void print(Node p) {
		if (p != null) { // 비어 있지 않을 경우에
			print(p.left); // 왼쪽 먼저 출력
			System.out.println(p.value); // 값 출력
			print(p.right); // 나머지 오른쪽 (순서 바꾸면 거꾸로 출력됨)
		}
	}

	public void print() { // 출력
		print(root);
	}

	private String search(Node p, int key) {
		if (p == null) // 비어있으면 (찾는 값이 없으면)
			return null; // null 출력
		else if (key == p.key) // 키가 같다면
			return p.value; // 값 출력됨
		else if (key < p.key) // 입력된 키가 작으면
			return search(p.left, key); // 왼쪽으로
		else
			return search(p.right, key); // 그 이외는 오른쪽
	}

	public String search(int key) { // 그냥 생성자
		return search(root, key);
	}

	private Node delete(Node p, int key) { // 여기부터 어려워짐
		if (p == null) // 만약 비어있으면 (없으면)
			return null; // null 값 출력
		else if (key == p.key) // 만약 입력한 값을 발견했으면
			p = deleteNode(p); // 노드 삭제
		else if (key < p.key) // 입력된 키가 작으면
			p.left = delete(p.left, key); // 왼쪽 노드 삭제
		else
			p.right = delete(p.right, key); // 그 이외는 오른쪽
		return p;
	}

	public void delete(int key) {
		root = delete(root, key); // 그냥 생성자
	}

	private Node deleteNode(Node p) {
		if (p.left == null) // 왼쪽이 비어있을 경우
			if (p.right == null) // 오른쪽이 비어있을 경우
				return null; // null 출력
			else
				return p.right; // 그 이외는 오른쪽 출력
		else if (p.right == null) // 오른쪽이 비어있을 경우
			return p.left; // 왼쪽 출력
		else { // 이 이하부터 잘 이해가 안 갑니다.
			// 억지로라도 주석을 달기는 했습니다만 왜 이 부분에서 이 코드가 오는지 모르겠습니다.
			Node m = max(p.left); // 노드가 왼쪽의 최대치일 경우
			p.left = delete(p.left, m.key); // 왼쪽의 값 삭제
			p.key = m.key; // int 키 값 변경
			p.value = m.value; // String 값도 변경
			return p;
		}
	}

	private Node max(Node p) {
		if (p == null) // 비어있다면 (없으면)
			return null; // null 값 출력
		else if (p.right == null) // 오른쪽 값이 비어있으면
			return p; // 출력 (이진 트리에서 오른쪽이 큰 값이기 때문에 오른쪽 값이 비어있다는 건 그 값이 가장 크다는
						// 것)
		else
			return max(p.right); // 그 이외는 오른쪽 값 출력(?)
	}
}
