package memberDB;

import java.util.ArrayList;
import java.util.List;

import memberArrayList.MemberVO;

public class ConnTest2 {

	public static void main(String[] args) {
		List<MemberVO> members = new ArrayList<MemberVO>();
		MemberDAO dao = new MemberDAO();
		int rs = 0;
		// insert
		MemberVO member = new MemberVO("hong4", "4444","홍4", 44);
		rs = dao.insertMember(member);
		System.out.println("rs="+rs);
		
		// list
		members = dao.getMemberList();
		for(MemberVO m :members) {
			System.out.println(m);
		}
		
		
	}

}
