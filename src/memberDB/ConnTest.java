package memberDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import memberArrayList.MemberVO;

public class ConnTest {

    public static void main(String[] args) {

        // 0.필요한 객체 및 변수 생성
        Connection conn = null; // db연결 객체 
        PreparedStatement pstmt = null; // sql query 창
        ResultSet rs = null; // select 결과 저장

        try {
            // 1. driver loading
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            // 2.connection 
            String url = "jdbc:mysql://localhost:3306/jspdb?serverTimezone=UTC";
            String user = "root";
            String password = "rootpass";
            conn = DriverManager.getConnection(url,user,password);
            System.out.println("Conn OK!!");

            // 3. PreparedStatement
            String sql = "select id,pw,name,age from member";
            pstmt = conn.prepareStatement(sql);

            // 4. ResultSet : select 결과 저장
            rs = pstmt.executeQuery();

            // 5.  ResultSet : getXXX(컬럼명)
            List<MemberVO> members = new ArrayList<MemberVO>();
            MemberVO member = null;
            while(rs.next()) {
                String id = rs.getString("id");
                String pw = rs.getString("pw");
                String name = rs.getString("name");
                int age= rs.getInt("age");
                member = new MemberVO(id, pw, name, age);
                members.add(member);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}