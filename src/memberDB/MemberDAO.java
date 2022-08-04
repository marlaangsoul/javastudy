package memberDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import memberArrayList.MemberVO;

public class MemberDAO {

	
	//이 아래에서 public문에 List<MemberVO>는 리턴해주는 값이다.
	public List<MemberVO> getMemberList(){
		List<MemberVO> members = new ArrayList<MemberVO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		conn = JDBCUtil.getConnection();

		try {

			String sql = "select * from member";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();// executeUpdate();
			MemberVO member = null;
			while(rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				member = new MemberVO(id, pw, name, age);
				members.add(member);
			}			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		return members;
	}

	public int insertMember(MemberVO member){
		int rs = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;		

		conn = JDBCUtil.getConnection();

		try {
			String id = member.getId();
			String pw = member.getPw();
			String name = member.getName();
			int age = member.getAge();

			String sql = "insert into member(id,pw,name,age) values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);// ? 4
			pstmt.setString(1,id);
			pstmt.setString(2,pw);
			pstmt.setString(3,name);
			pstmt.setInt(4,age);
			rs = pstmt.executeUpdate();// 0 실패, 1 성공 	

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}
		return rs;
	}

	 public MemberVO getMemberId(String id){
	        MemberVO member = null;
	        
	    	Connection conn = null;
			PreparedStatement pstmt = null;	
			ResultSet rs = null;

			conn = JDBCUtil.getConnection();

	        try {
	            pstmt = conn.prepareStatement("select id,pw,name,age from member where id = ?");
	            pstmt.setString(1, id);
	            rs = pstmt.executeQuery();
	            if(rs.next()) {
	                String pw = rs.getString("pw");
	                String name = rs.getString("name");
	                int age = rs.getInt("age");
	                //System.out.printf("%s,%s,%s,%s%n",id,pw,name,age);
	                member = new MemberVO(id, pw, name, age);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            JDBCUtil.close(rs, pstmt, conn);
	        }       
	        return member;      
	    }
	 
	public int updateMember(MemberVO member){
		int rs = 0;
		Connection conn = null;
		conn = JDBCUtil.getConnection();
		PreparedStatement pstmt = null;	
		String sql =  "update member set pw=?,name=?,age=? where id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getPw());
			pstmt.setString(2, member.getName());
			pstmt.setInt(3, member.getAge());
			pstmt.setString(4, member.getId());
			rs = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}       
		return rs;      
	}

	public int deleteMember(String id){
		int rs = 0;
		Connection conn = null;
		conn = JDBCUtil.getConnection();
		String sql = "delete from member where id = zxzx";
		PreparedStatement pstmt = null;	
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}
		return rs;
	}  
	
//	myList.size()
	
	public List<MemberVO> countList(){
		List<MemberVO> members = new ArrayList<MemberVO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		conn = JDBCUtil.getConnection();

		try {
			String sql = "select * from member";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();// executeUpdate();
			MemberVO member = null;
			while(rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				member = new MemberVO(id, pw, name, age);
				members.add(member);
			}			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		return members;
	}
}

