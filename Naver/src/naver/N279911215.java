package naver;

import java.util.Random;

public class N279911215 extends Thread {
	private int id = -1;
	public N279911215(int id){
		this.id = id;
	}
	public void run(){
		System.out.println( id + "번 쓰레드 동작 중..." );
		Random r = new Random(System.currentTimeMillis());
		try {
			long s = r.nextInt(3000); // 3초내로 끝내자.
			Thread.sleep(s); // 쓰레드를 잠시 멈춤
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println( id + "번 쓰레드 동작 종료..." );
	}

	public static void main(String[] args) {

		System.out.println("Start main method.");

		for(int i = 0 ; i < 10 ; i++ ){
			N279911215 test = new N279911215(i);
			test.start(); // 이 메소드를 실행하면 Thread 내의 run()을 수행한다.
		}

		System.out.println("End main method.");
	}
}