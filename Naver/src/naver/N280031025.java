package naver;

public class N280031025 {

	public static int searchArray(int[] array, int a) {
		
		
		try {
			for (int i = 0; i < array.length; i++) {
				if (array[i] == a)
					return i;
			}
			throw new NotFoundExecption("배열에서 찾을 수 없습니다.");
			
		} catch (NotFoundExecption e) {
			e.printStackTrace();
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 5 };
		int b = searchArray(a, 11);
//		System.out.println(b);
	}
}
