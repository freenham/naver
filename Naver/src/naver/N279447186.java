package naver;

import java.util.Scanner;

public class N279447186 {
	public static void main(String[] args) {
		String[] member = { "철수", "영희", "짱구" };
		String[] members = new String[3];
		Scanner s = new Scanner(System.in);

		member[0] = "철수";
		member[1] = "영희";
		member[2] = "짱구";
		try {
			int i = s.nextInt();
			System.out.println(member[i - 1] + "가 상담을 받았습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
