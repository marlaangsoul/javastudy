package charpter16;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FileReadAddress2 {
	public static void main(String[] args) {

		FileInputStream fi =null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		StringTokenizer st = null;

		try {
			fi = new FileInputStream("address.txt");
			isr = new InputStreamReader(fi);
			br = new BufferedReader(isr);

			String str = null;
//			String[] strArr = null;
//
//			while((str = br.readLine()) != null) {
//				strArr = str.split(",");
//				for(String s:strArr) {
//					System.out.println(s+" ");
//				}
//			}
				while((str = br.readLine()) != null) {
				st = new StringTokenizer(str,",");
				System.out.print("name : "+st.nextToken()+" ");
				System.out.print("addr : "+st.nextToken()+" ");
				System.out.print("email : "+st.nextToken()+" ");
				System.out.print("tel : "+st.nextToken()+" ");
			}
						

		} catch (IOException e) {

		}

	}

}
