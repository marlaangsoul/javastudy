package chapter18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest {

	public static void main(String[] args) {
		
		FileInputStream fi = null;
		InputStreamReader isr = null;
		BufferedReader bfr = null;
		
		try {
			fi = new FileInputStream("C:\\bigdata0214\\javaws\\test.txt");
			isr = new InputStreamReader(fi);
			bfr = new BufferedReader(isr);
			
			String str = null;
			while((str = bfr.readLine()) != null) {
				System.out.println(str);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fi.close();
				isr.close();
				bfr.close(); // 열었던 순서대로 클로즈
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}





