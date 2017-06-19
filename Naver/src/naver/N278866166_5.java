package naver;

public class N278866166_5 {
	private String name;
	private int times;
	private int hit;
	public N278866166_5() {
		super();
	}
	
	public N278866166_5(String name,int times,int hit) {
		this.name = name;
		this.times = times;
		this.hit = hit;
	}
	
	public double getBatting() {
		return (double)hit/times;
	}
	
	public void printDataAll() {
		System.out.println(String.format("%s의 타수는 %d석, 안타는 %d개, 타율은 %.3f 입니다.", name, times, hit, getBatting()));
	}
	
	public static void main(String[] args) {
		N278866166_5 n = new N278866166_5("박한이",100,38);
		N278866166_5 n2 = new N278866166_5("이승엽",100,30);
		N278866166_5 n3 = new N278866166_5("최형우",100,26);
		n.printDataAll();
		n2.printDataAll();
		n3.printDataAll();
		
		//타율은 그냥 안타/타수인데 왜 10을 곱하라고 했는지는 모르겠네요.
		//문제대로 라면 getBatting메소드에 10을 곱해주시면 됩니다.
		
		
	}
}
