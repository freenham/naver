package naver;

public class N280291812_2 {
	public static void main(String[] args) {

		int line = 8;
		int star = 1;
		int blank = line;

		for (int i = 0; i < line + 1; i++) {
			for (int j = 0; j < blank; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < star; k++) {
				System.out.print(" *");
			}
			System.out.println();
			star += 1;
			blank -= 1;
		}
		System.out.println("\n");
		blank = 0;
		star = star - 1;

		for (int i = 0; i < line + 1; i++) {
			for (int j = 0; j < blank; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < star; k++) {
				System.out.print(" *");
			}
			System.out.println();
			star -= 1;
			blank += 1;
		}
	}
}