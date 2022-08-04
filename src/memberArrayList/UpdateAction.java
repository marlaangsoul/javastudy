package memberArrayList;

import java.util.Scanner;

import memberDB.MemberDAO;

public class UpdateAction implements Action{

	@Override
	public void execute(Scanner sc) {
		// 1. 수정할 ID
		
		MemberDAO dao = new MemberDAO();
		
		System.out.println("수정할 ID : ");
		String id = sc.next();
		//1. MemberVo
		//2. getMember(String id)
		MemberVO param = new MemberVO();
		param.setId(id);
				
		MemberVO member = dao.getMemberId(param);
		
		
		System.out.println(member); // 		
		// 2. 수정: PW, NAME, AGE
		if(member != null) {
			String dbPw = member.getPw();
			String dbName = member.getName();
			int dbAge = member.getAge();
			System.out.print("Old-PW : " + dbPw);
			System.out.print("New-PW : ");
			String pw = sc.next();
			System.out.print("Old-NAME : " + dbName);
			System.out.print("New-NAME : ");
			String name = sc.next();
			System.out.print("Old-AGE : " + dbAge);
			System.out.print("New-AGE : ");
			int age = sc.nextInt();
			
			// new set
			member.setPw(pw);
			member.setName(name);
			member.setAge(age);
			
			//member = new MemberVO(id, pw, name,age);
			int rs = dao.updateMember(member);
			
			
		}else {
			System.out.println("member not found!!!");
		}
	}

}
