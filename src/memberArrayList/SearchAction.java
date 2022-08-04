package memberArrayList;

import java.util.Scanner;

import memberDB.MemberDAO;

public class SearchAction implements Action{

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("검색할 ID : ");
		String id = sc.next();
		
		MemberVO param = new MemberVO();
		param.setId(id);
		
		// 목록 보여주기
		MemberDAO dao = new MemberDAO();
		int count = dao.countList();
		MemberVO member = dao.countList(param);
		
		System.out.printf("=== Count : %s명 ===\n",count);
		if(member != null) {
			System.out.println(member);
			System.out.print("ID :" + member.getId()+",");
			System.out.print("PW :" + member.getPw()+",");
			System.out.print("NAME :" + member.getName()+",");
			System.out.print("AGE :" + member.getAge());
			System.out.println();
		}else {
			System.out.println("member not found!!");
		}
		
	}

}
