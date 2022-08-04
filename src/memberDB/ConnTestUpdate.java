package memberDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ConnTestUpdate {

    public static void main(String[] args) {
        // 1. driver loading
        String driver = "com.mysql.cj.jdbc.Driver";
        // 2. connection
        Connection conn = null;
        // 3. sql 쿼리창 
        PreparedStatement pstmt = null;
        // 4. 실행 - update 
        int rs = 0;
        
        String id = "hong7";
        String pw = "7979";
        String name = "홍79";
        int age = 79;
        String sql = "update member set pw=?,name=?,age=?";

        try {
            Class.forName(driver);
            String url = "jdbc:mysql://localhost:3306/jspdb?ServerTimezone=UTC";
            String user = "root";
            String password = "rootpass";
            conn = DriverManager.getConnection(url, user, password);
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, pw);
            pstmt.setString(2, name);
            pstmt.setInt(3, age);
            rs = pstmt.executeUpdate();
            System.out.println("rs="+rs);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(pstmt != null) pstmt.close();
                if(conn != null) conn.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}