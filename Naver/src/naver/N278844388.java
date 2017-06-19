package naver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class N278844388 {
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {
		File file = new File("Student.txt");
		Scanner s = new Scanner(System.in);
		BufferedReader br = null;
		FileWriter fw = null;
		FileReader fr = null;
		int cnt = 0;
		
		try {
			fr = new FileReader(file);
			fw = new FileWriter(file);
			
			char[] str = new char[1024];
			while (s.hasNext()) {

				if (cnt != 0 && cnt % 6 == 0)
					fw.write(LINE_SEPARATOR);
				cnt++;
				String s1 = s.next();
				if (s1.equals("exit"))
					break;
				fw.write(s1 + "\t");
			}
			fw.flush();
			
			br = new BufferedReader(fr);
			System.out.println(br.read(str));

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fw != null)
				fw.close();
			if(br != null)
				br.close();
		}
		
		
	}
}
