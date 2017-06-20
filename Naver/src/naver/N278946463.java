package naver;

import java.util.StringTokenizer;

public class N278946463 {
	public static void main(String[] args) {
		String str = "10*30*20*40*50";
		int sum = 0;
		String s;
		StringTokenizer st = new StringTokenizer(str, "*");
		while (st.countTokens() > 1) {
			s = st.nextToken();
			System.out.print(s + " + ");
			sum += Integer.valueOf(s);
		}
		s = st.nextToken();
		sum += Integer.valueOf(s);
		System.out.print(s + " = " + sum);
	}
}
