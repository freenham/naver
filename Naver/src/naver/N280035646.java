package naver;

public class N280035646 {
	 public static void main(String[] args) {
	  System.out.println("2의 5승 : "+powerOfTwo(5));
	  System.out.println("2의 7승 : "+powerOfTwo(7));
	}
	 public static int powerOfTwo(int n){
	  if(n==0)
	   return 1;
	  
	  return 2*powerOfTwo(n-1);
	 }
	}
