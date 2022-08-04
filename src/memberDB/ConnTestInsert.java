package memberDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ConnTestInsert {

    public static void main(String[] args) {
        // 1. driver loading
        String driver = "com.mysql.cj.jdbc.Driver";
        // 2. connection
        Connection conn = null;
        // 3. sql 쿼리창 
        PreparedStatement pstmt = null;
        // 4. 실행 - insert 
        int rs = 0;
        String id = "Kim";
        String pw = "1232";
        String name = "보929";
        int age = 7;
        String sql = "insert into member(id,pw,name,age) values(?,?,?,?)";

        try {
            Class.forName(driver);
            String url = "jdbc:mysql://localhost:3306/jspdb?ServerTimezone=UTC";
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
