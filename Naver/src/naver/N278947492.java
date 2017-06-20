package naver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class N278947492 {

	public static void main(String[] args) throws FileNotFoundException {

		// 파일을 읽을 객체 생성
		File file1 = new File("c:/kk.txt");
		File file2 = new File("c:/ll.txt");
		Scanner fscan = new Scanner(file1);
		boolean flag = false;

		// file1, file2 데이터 저장하고 일치되는 데이터 match
		ArrayList<String> file1Data = new ArrayList<String>(), file2Data = new ArrayList<String>(),
				matchData = new ArrayList<String>();

		while (fscan.hasNext()) {
			file1Data.add(fscan.nextLine());
		}

		fscan.close();

		fscan = new Scanner(file2);

		while (fscan.hasNext()) {
			file2Data.add(fscan.nextLine());

		}
		// 일치여부 판단
		for (String str : file1Data) {
			// 일치
			for (String str2 : file2Data) {// 이렇게 고쳐야 합니다.
				if (str2.equals(str)) {// 완전히 같지 않고 포함한다는 경우를 원한다면
										// str2.contains(str)
					matchData.add(str);
					flag = true;
				}
			}
		}

		matchData.forEach(System.out::println);
		if (flag)
			System.out.println("일치합니다.");
		else
			System.out.println("일치하지 않습니다.");
		fscan.close();

	}
}