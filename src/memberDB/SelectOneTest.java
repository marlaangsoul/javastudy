package memberDB;

import memberArrayList.MemberVO;

public class SelectOneTest {
	 public static void main(String[] args) {
	        String id = "zxzx";
	        MemberVO member = null;

	        MemberDAO dao = new MemberDAO();
	        member = dao.getMemberId(id);

	        System.out.println(member.getId());

	}

}

