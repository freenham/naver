package naver;

public class N278866166_4 {
	private int fuel;
	private int speed;
	private int passenger;
	private String model;
	
	public N278866166_4() {
		super();
	}
	
	public N278866166_4(int fuel,int speed,int passenger,String model) {
		this.fuel = fuel;
		this.speed = speed;
		this.passenger = passenger;
		this.model = model;
	}
	
	public void Start() {
		speed = 10;
		System.out.println("속력은 10 입니다.");
	}
	
	public void Stop() {
		speed = 0;
		System.out.println("속력은 0 입니다.");
	}
	
	public void SpeedUp(){
		speed+=10;
		System.out.println("속력이 10 증가하였습니다.");
	}
	public void SpeedDown() {
		speed-=10;
		System.out.println("속력이 10 감소하였습니다.");
	}
	public void GetIn() {
		passenger++;
		System.out.println("승객이 한명 증가하였습니다.");
	}
	public void GetFullFuel() {
		fuel =100;
		System.out.println("연료가 100이 되었습니다.");
	}
	public void printDataAll() {
		System.out.println(String.format("%s의 연료는 %d, 속력은 %d, 승객수는 %d 입니다.", model,fuel,speed,passenger));
	}
	
	public static void main(String[] args) {
		N278866166_4 n = new N278866166_4(50,0,1,"S");
		n.printDataAll();
		n.Stop();
		n.SpeedUp();
		n.SpeedDown();
		n.GetFullFuel();
		n.GetIn();
		n.printDataAll();
	}
	
	//캡슐화는 멤버변수를 private로 숨기고 메소드들은 public으로 공개하는것을 뜻합니다.
	
}
