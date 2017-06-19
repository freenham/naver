package naver;

public class N278935015 {
	public static void main(String[] args) {
		double score[][] = {{10,20},{30,10},{20,30}};
		double sum =1;
		for(int year=0;year<score.length;year++) {//year<score.length는 행의 길이로 3입니다.
			for (int s=0;s<score[year].length;s++){//year.score[year].length는 열의 길이로 2입니다.
				sum *= score[year][s];//모든 원소들을 곱합니다. 36,000,000
			}
		}
		int row = score.length;//행 3
		int col = score[0].length;//열 2
		System.out.println(sum/(row*col*1000));//36,000,000/6,000=6,000
	}
}
