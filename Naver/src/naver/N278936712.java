package naver;

import java.util.Scanner;

public class N278936712 {
	Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		String Ans = "";
		double[][] student = new double[4][4];
		double[] avg = new double[4];
		student[0][0] = 60;
		student[0][1] = 70;
		student[0][2] = 80;
		student[0][3] = 0;
		student[1][0] = 80;
		student[1][1] = 90;
		student[1][2] = 90;
		student[1][3] = 0;
		student[2][0] = 60;
		student[2][1] = 70;
		student[2][2] = 30;
		student[2][3] = 0;
		student[3][0] = 60;
		student[3][1] = 50;
		student[3][2] = 40;
		student[3][3] = 0;
		Ans += "이름\t과목1\t과목2\t과목3\t평균\t결과\n";

		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < student[0].length; j++) {
				if (j == 0)
					Ans += (char) (65 + i) + "\t";
				if (j < 3) {
					student[i][3] += student[i][j] / 3;
					Ans += ((int) student[i][j] + "\t");
				} else {
					Ans += String.format("%.1f", student[i][j]);
					if (student[i][j] >= 70) {
						Ans += "\t합격";
					} else
						Ans += "\t불합격";
				}
				avg[i] += student[j][i] / 4;
			}
			Ans += "\n";
		}
		Ans += "평균\t";
		for (int i = 0; i < 4; i++) {
			Ans += avg[i] + "\t";
		}
		Ans+="X";
		System.out.println(Ans);
	}
}
