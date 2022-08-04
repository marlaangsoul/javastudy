package chapter10;

import java.util.Scanner;

public class ExceptionEx8 {

	public static void main(String[] args) {
		String user_id = "zxz";
		String user_pw = "1234";

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("ID >>");
			String input_id = sc.nextLine();
			System.out.println("PW >>");
			String input_pw = sc.nextLine();
			if(!user_id.equlas(input_id)) {
				throw new LoginExceptions ("로그인 실패 : 아이디 틀림");
			}else if(!user_pw.equals(intput_pw)) {
				throw new LoginExceptions("로그인 실패 : 패스워드 틀림");
			}else {
				System.out.println("로그인 성공");
			}
			

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}



	}

}
