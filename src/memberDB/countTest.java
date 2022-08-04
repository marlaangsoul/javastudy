package memberDB;

import java.util.List;

import memberArrayList.MemberVO;

public class countTest {
	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		List<MemberVO> members = dao.countList();
//		for(MemberVO member:members) {
//			System.out.println(member);
//		}
//		MemberDAO dao = new MemberDAO();
		
		
		System.out.println("count = " + members.size());
	}

}