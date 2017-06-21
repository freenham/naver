package naver;

public class N279022381_2 {
	public static void main(String[] args) {
		N279022381 n = new N279022381();
		n.Sname = "선녀";
		n.ScoredWork = 86;
		n.ScoreExam=70;
		
		System.out.println("이름 : " + n.Sname+"\n"
				+ "과제점수 : "+ n.ScoredWork+"\n"
						+ "시험점수 : "+n.ScoreExam+"\n"
								+ "학점 : "+n.getGrade());
	}
}
