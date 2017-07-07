package naver;

public class N280035552_2 extends N280035552{
	public void run() {
		int cnt=0;
		while(cnt<10){
			try {
				Thread.sleep(1000);
				System.out.println(cnt+=2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		N280035552_2 n = new N280035552_2();
		n.start();
	}
}
