package naver;

import java.util.Scanner;

public class N279911215 extends Thread {
	private int id = -1;
	public N279911215(int id){
		this.id = id;
	}
	
	
	public void run(){
		int i=0;
		try {
			while(!new Scanner(System.in).equals("1")) {
			System.out.println(++i);
			Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		N279911215 test = new N279911215(1);
		test.run();
	}
}