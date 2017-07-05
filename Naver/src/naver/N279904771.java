package naver;

public class N279904771 {
	public static void main(String[] args) {
		int[] a = new int[] {5,6,7,8,4,11,3,9,1};
		for(int i = 0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}
}
