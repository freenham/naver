package naver;

public class N279022381 {
	public String Sname;
	public int ScoredWork;
	public int ScoreExam;
	
	public char getGrade() {
		double total = ScoredWork*0.4 + ScoreExam*0.6;
		if(total>=90)
			return 'A';
		else if(total>=80 && total<90)
			return 'B';
		else if(total>=70 && total<80)
			return 'C';
		else if(total>=60 && total<70)
			return 'D';
		else 
			return 'F';
	}
}

