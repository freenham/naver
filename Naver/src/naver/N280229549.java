package naver;

import java.util.Scanner;

public class N280229549 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, sum = 0;
		Scanner scan = new Scanner(System.in);
		i = scan.nextInt();

		for (j = 0; j < 9; j++) {
			 System.out.println(i*(j+1));
			sum = sum + (i * (j + 1));
		}

		System.out.println("sum구구단(" + i + "):" + sum);
	}
}