package memberArrayList;

import java.util.Scanner;

import memberDB.MemberDAO;

public class AddAction implements Action{

	@Override
	public void execute(Scanner sc) {
		// 회원 가입
		System.out.println("== 회원 정보 입력 ==");
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();
		System.out.print("NAME : ");
		String name = sc.next();
		System.out.print("AGE : ");
		int age = sc.nextInt();
		
		MemberVO member = new MemberVO(id, pw, name, age);
		MemberDAO dao = new MemberDAO();
		int rs = dao.insertMember(member);
		System.out.println(id + "의 정보를 입력 완료 하였습니다. ");
		
	}

}
