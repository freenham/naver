package naver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class N279159001 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader

		(new FileInputStream("calc.txt"), Charset.forName("UTF-32")));
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("result.txt"), Charset.forName("UTF-32")));

		
		

		String[] cmpStr = null;
//		cmpStr[0]=br.readLine();
		System.out.println(br.read());
		bw.write(br.readLine());
//		for (int i = 0; i < cmpStr.length; i++) {
//			double data = 0;
//			switch (cmpStr[0]) {
//			case "add":
//				data += Double.parseDouble(cmpStr[i]);
//				break;
//			case "substract":
//				data -= Double.parseDouble(cmpStr[i]);
//				break;
//			case "multiply":
//				data *= Double.parseDouble(cmpStr[i]);
//				break;
//			case "divide":
//				data /= Double.parseDouble(cmpStr[i]);
//				break;
//			default:bw.write("결과 : " + System.lineSeparator());
//			}
//		}
		bw.flush();
		bw.close();
		br.close();
	}
}
