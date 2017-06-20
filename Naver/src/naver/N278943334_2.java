package naver;

public class N278943334_2 extends N278943334 {
	int mus, com;

	public N278943334_2(String name, int kor, int eng, int mat, int mus, int com) {
		super(name, kor, eng, mat); // 값이 부모클래스인 Score에 전달됨
		this.mus = mus;
		this.com = com;
	}

	@Override
	public int calc_tot() {
		tot = super.calc_tot() + mus + com;
		return tot;
	}

	@Override
	public double calc_avg() {
		avg = (double) tot / 5;
		return avg;
	}

	@Override
	public void output_result() {
		System.out.println("이름: " + name + ", 총점: " + calc_tot() + ", 평균: " + calc_avg());
	}
}