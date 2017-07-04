package naver;

public class N279798184 {
	public static void main(String[] args) {
		swap obj = new swap();
		int a = 10;
		int[] b = {3,4};
		obj.swap(a, b);
		System.out.println(a+" "+b[0]+" "+b[1]);
	}
}
class swap{
	public void swap(int i,int[] j) {
		i=20;
		j[0]=30;
	}
}
