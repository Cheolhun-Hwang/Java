/**
 * 파일명 : exam_data1.java
 * 작성일 : 2016. 7. 14.
 * 파일설명 :
 */

//이거 연결시켜서 sql update 시키는 고임!!!!!sql문을 바로 연결해서 그곳에서 쓰는거와 같은 효과를 지니게함!!
package database;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class exam_data1 {
	static java.sql.Statement stmt = null;
	
	public static void connectDB(){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 연결 성공");
		}catch(Exception e){
			System.out.println("드라이버 연결 에러");
			System.exit(0);
		}
		try{
			Connection con = null;
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String user = "HCH";
			String passwd = "hch";
			con = DriverManager.getConnection(url, user, passwd);
			stmt = con.createStatement();
			//String sql = "insert into student2 values(201605, '김지윤', '남', 3, '경영학과', 4.5)";
			//String sq2 = "UPDATE student2 SET SNAME = '김지윤' WHERE SNO = 2016002";
			String sq3 = "DELETE FROM student2 WHERE SNO = 201605";
			stmt.executeUpdate(sq3);
			//stmt.executeUpdate(sq2);
			System.out.println("DB 연결 성공");
		}catch(Exception e){
			System.out.println("유저 연결 에러");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		connectDB();
	
	}
	


}
