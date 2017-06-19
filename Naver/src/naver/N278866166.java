package naver;

import java.util.Scanner;

public class N278866166 {
	Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		double[][] student = new double[3][6];
		student[0][0] = 1;
		student[0][1] = 90;
		student[0][2] = 80;
		student[0][3] = 50;
		student[1][0] = 2;
		student[1][1] = 80;
		student[1][2] = 70;
		student[1][3] = 50;
		student[2][0] = 3;
		student[2][1] = 78;
		student[2][2] = 65;
		student[2][3] = 74;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				if (j < 4 && j > 0)
					student[i][4] += student[i][j];
				student[i][5] = student[i][4] / 3.0;

				if (j < 5)
					System.out.print((int) student[i][j] + " ");
				else
					System.out.printf("%.1f", student[i][j]);
			}
			System.out.println();
		}
	}
}
