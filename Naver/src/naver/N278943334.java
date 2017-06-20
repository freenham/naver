package naver;

public class N278943334 {
	String name;
	int kor, eng, mat;
	int tot;
	double avg;

	public N278943334(String name, int kor, int eng, int mat) {
		/* 생성자를 완성하시오 */
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		tot=0;
		avg=0;
	}

	public int calc_tot() {
		/*
		 * 국어, 영어, 수학점수의 합계를 계산하여 반환하는 식을 포함시키시오
		 */
		return kor+eng+mat;
	}

	public double calc_avg() {
		/*
		 * 국어, 영어, 수학점수의 평균을 계산하여 반환하는 식을 포함시키시오
		 */
		return (kor+eng+mat)/3.0;
	}

	public void output_result() {
		System.out.println("이름: " + name + ", 총점: " + calc_tot() + ", 평균: " + calc_avg());
	}
}
