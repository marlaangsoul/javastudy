package memberDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCUtil {
	public static Connection getConnection() {
		Connection conn = null;
		String driver = "com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(driver);

			String url = "jdbc:mysql://localhost:3306/jspdb?ServerTimezone=UTC";
			String user = "root";
			String password = "rootpass";
			conn = DriverManager.getConnection(url, user, password);
//			System.out.println("Conn OK!!");
		}catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}


    public static void close(PreparedStatement pstmt, Connection conn) {
        try {
            if(pstmt != null) pstmt.close();
            if(conn != null) conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void close(ResultSet rs, PreparedStatement pstmt, Connection conn) {
        try {
            if(rs != null) rs.close();
            if(pstmt != null) pstmt.close();
            if(conn != null) conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}


