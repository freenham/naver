package naver;

import java.util.Scanner;

public class N279074295 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] ar = new int[10];
		for (int i = 0; i < 10; i++) {
			ar[i] = s.nextInt();
		}
		for(int i=0;i<10;i++) {
			if(ar[i]%2==0)
				System.out.print(ar[i]+" ");
		}
	}

}
