package memberDB;

import memberArrayList.MemberVO;

public class UpdateTest2 {
	public static void main(String[] args) {
		int rs = 0;
		String id = "zx";
		String pw = "ABC";
		String name = "zxzxz";
		int age = 32;

		MemberDAO dao = new MemberDAO();
		MemberVO member = new MemberVO(id, pw, name, age);
		rs = dao.updateMember(member);
		System.out.println("rs = "+ rs);


	}

}