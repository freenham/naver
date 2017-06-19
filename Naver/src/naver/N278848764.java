package naver;

import java.util.Scanner;

public class N278848764 {

	public int getPerfect(int a) {
		int cnt = 0;
		for (int i = 1; i <= a; i++) {
			int sum=0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0)
					sum += j;
			}
			if (sum == i)
				cnt++;
		}
		return cnt;
	}

	public static void main(String[] args) {
		N278848764 n = new N278848764();
		Scanner s = new Scanner(System.in);
		System.out.printf("정수 : ");
		int x = s.nextInt();
		System.out.printf("1~%d까지의 완전체의 개수 %d개",x,n.getPerfect(x));
	}

}
