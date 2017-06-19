package naver;

import java.util.Scanner;

public class N278884270 {
	public static void main(String[] args) {
		
		int number = 3;
		// 1. 10이상의 숫자를 입력하고 입력된 숫자의 합을 구하시오.
		if (number == 1) {
			Scanner s = new Scanner(System.in);
			int sum = 0;
			int num = s.nextInt();
			while (num >= 10) {
				sum += num;
				num = s.nextInt();
			}
			System.out.println(sum);
		}
		//
		// 2. 1~100 사이의 3의배수를 출력하시오.
		if (number == 2) {
			int cnt = 0;
			while (cnt <= 100) {
				if (++cnt % 3 == 0)
					System.out.print(cnt + " ");
			}
		}

		if (number == 3) {
			//
			// 3. 1~100 사이의 2의 배수를 총합을 구하시오.
			int sum = 0;
			int cnt = 0;
			while (cnt <= 100) {
				if (++cnt % 2 == 0) {
					sum += cnt;
				}
			}
			System.out.print(sum);
		}
	}
}
