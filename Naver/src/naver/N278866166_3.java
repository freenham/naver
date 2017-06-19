package naver;

public class N278866166_3 {
	private String name;
	private int id;
	private int age;
	private int year;
	private int salary;
	
	public N278866166_3() {
		super();
	}
	
	public N278866166_3(String name,int id,int age,int year,int salary) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.year =year;
		this.salary = salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getName(){
		return this.name;
	}
	public int getId(){
		return this.id;
	}
	public int getAge(){
		return this.age;
	}
	public int getYear(){
		return this.year;
	}
	public int getSalary(){
		return this.salary;
	}
	
	public void printDataAll() {
		System.out.println(String.format("%s의 직원번호는 %d, 나이는 %d, 근무연수는 %d, 연봉은 %d 입니다.",name,id,age,year,salary));
	}
	public static void main(String[] args) {
		N278866166_3 n = new N278866166_3("네이버",20170619,21,2,3000);
		n.printDataAll();
	}
}
