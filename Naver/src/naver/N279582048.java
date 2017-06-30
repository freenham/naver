package naver;

import java.util.Scanner;

public class N279582048 {
	public static void main(String[] args) {
		/*
		 * STEP1.
		 * 
		 * 다른 클래스로 부모 이름,나이 // 자식 이름,나이 입력받는 클래스 만들고 main method에서 set으로 입력 부모 :
		 * 이름 나이
		 * 
		 * 자식 : 이름 나이
		 * 
		 * 1:N 부모한명당 자식은여러명일수있다.
		 * 
		 * 
		 * EX) 부모이름 : 자식수 부모이름 : 자식수 부모이름 : 자식수
		 * 
		 * STEP2. 부모이름을 입력하면 자식이 몇 명! 인지 출력되게 하시오! scanner이용 (list도 이용하면 좋고)
		 * 
		 */
		// 부모와 자식 이름 / 나이 담을 객체 creation
		int cnt=0;
		Person[] person = new Person[3];
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		person[0] = person1;
		person[1] = person2;
		person[2] = person3;
		
		Person[] child = new Person[4];
		Person child1 = new Person();
		Person child2 = new Person();
		Person child3 = new Person();
		Person child4 = new Person();
		child[0] = child1;
		child[1] = child2;
		child[2] = child3;
		child[3] = child4;
		// 부모이름나이 set
		person1.setName("부모1");
		person1.setAge("50");
		person2.setName("부모2");
		person2.setAge("30");
		person3.setName("부모3");
		person3.setAge("70");
		// 자식 이름나이 set
		child1.setName("아이1");
		child1.setAge("11");
		child1.setParentName("부모1");
		child2.setName("아이2");
		child2.setAge("20");
		child2.setParentName("부모1");
		child3.setName("아이3");
		child3.setAge("15");
		child3.setParentName("부모1");
		child4.setName("아이4");
		child4.setAge("13");
		child4.setParentName("부모2");
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("부모이름을 입력하시오");
		String sss = sc1.next();
		for(Person c : child) {
			if(c.getParentName().equals(sss))
				cnt++;
		}
		System.out.println(cnt+"명");
	}

}

class Person {
	String name;
	String age;
	String parentName;
	
	public void setParentName(String s) {
		this.parentName = s;
	}
	
	public String getParentName() {
		return this.parentName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
