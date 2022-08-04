package dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertTest {
	public static void main(String[] args) {
		
		String driver = "com.mysql.cj.jdbc.Driver";
		
		Connection conn = null;
		
		PreparedStatement pstmt = null;
		
		int rs = 0;
		String id = "zxz";
		String pw = "888";
		String name = "8889";
		int age = 99;
		String sql = "insert into member(id,pw,name,age) values(?,?,?,?)";
		
		try {
			Class.forName(driver);
			String url = "jdbc:mysql://localhost:3306/jspdb?serverTimezone=UTC";
            String user = "root";
            String password = "rootpass";
            conn = DriverManager.getConnection(url, user, password);
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.setString(2, pw);
            pstmt.setString(3, name);
            pstmt.setInt(4, age);
            rs = pstmt.executeUpdate();
            System.out.println("rs="+rs);

			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
		
		
		
		
	}

}
