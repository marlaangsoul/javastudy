package memberDB;

public class DeleteTest2 {
	public static void main(String[] args) {
		int rs = 0;
		String id = "zxz1";
		
		MemberDAO dao = new MemberDAO();
		rs = dao.deleteMember(id);
		System.out.println("rs = " + rs);
	}

}

