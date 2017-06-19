package naver;

import java.util.Scanner;

public class N278866166_2 {
	int a;
	int b;

	public N278866166_2(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int add() {
		return a + b;
	}

	public int Sub() {
		return a - b;
	}

	public int Mul() {
		return a * b;
	}

	public double Div() {
		return (double) a / b;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		N278866166_2 n = new N278866166_2(s.nextInt(), s.nextInt());
		System.out.println(n.add());
		System.out.println(n.Sub());
		System.out.println(n.Mul());
		System.out.println(n.Div());
	}
}
