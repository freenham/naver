package naver;

public class N280040949 {
	public static void main(String[] args) {
		 for (int i = 0; i < 2; i++) {
			//여기 2번
			 Loop1 :for (int j = 0; j < 10; j++) {

				for (int k = 0; k < 10; k++) {
					//여기 1번
					System.out.println(k);
					if(k==3) {
						break Loop1;
					}
					for (int l = 0; l < 10; l++) {
					}
				}

			}

		}
	}

}
