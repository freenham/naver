package naver;

import java.util.Scanner;

public class N278915803 {
	public static void main(String[] args) {
		double base=4.10;
		double total=0;
		System.out.print("근무시간 입력 : ");
		Scanner s = new Scanner(System.in);
		int time = s.nextInt();
		if(time>=40)
			base *= 1.5;
		total = time * base;
		System.out.printf("총 임금은 %.1f만원 입니다.",total);
		
		
	}
}
