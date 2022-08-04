package charpter16;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) {

		FileReader fr = null;

		try {
			fr = new FileReader("sample.txt"); 
			int readChar = -1; // int 형이기 때문에 한글이 되는 것. 
			// char 형으로 받았다면, 한글이 안됬을것. 
			while((readChar=fr.read()) != -1);{
				System.out.println(readChar);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e2) {
				e.printStackTrace();
			}
		}
	}


}
