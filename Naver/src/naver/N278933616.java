package naver;

import java.util.Scanner;

public class N278933616 {
	String id;

	void view() {
		Scanner sc = new Scanner(System.in);
		N278933616 view = new N278933616();
		view.id = sc.next();
		System.out.println(view.id);
	}
	public static void main(String[] args) {
		N278933616 view = new N278933616();
		view.view();
	}
}