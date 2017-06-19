package naver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class N278877650 {
	public static void main(String[] args) throws IOException {
		BufferedReader rd = new BufferedReader(new FileReader("C:/Temp/data.txt"));
		int max = 15;
		int cnt = 0;
		while (true) {
			String line = rd.readLine();
			if (line == null)
				break;
			if (cnt++ >= max - 10) {
				System.out.print(line + " ");
			}
		}
		rd.close();
	}
}