package memberDB;

import java.util.List;

import memberArrayList.MemberVO;

public class SelectAllTest2 {
	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		List<MemberVO> members = dao.getMemberList();
		for(MemberVO member:members) {
			System.out.println(member);
		}
	}

}
