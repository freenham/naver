package naver;

public class N280035552 extends Thread{
	public void run() {
		int cnt=0;
		while(cnt<10){
			try {
				Thread.sleep(1000);
				System.out.println(++cnt);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		N280035552 n = new N280035552();
		n.start();
	}
}
