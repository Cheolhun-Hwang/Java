/**
 * 파일명 : Dbset.java
 * 작성일 : 2016. 7. 15.
 * 파일설명 :
 */
package Chapter10;

import java.sql.*;
public class Dbset {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 연결 성공");
		}catch(Exception e){
			System.out.println("드라이버 연결 에러");
			System.exit(0);
		}
		try{
			Connection con = null;
			Statement stmt = null;
			ResultSet rs = null;
			
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String user = "HCH";
			String passwd = "hch";
			con = DriverManager.getConnection(url, user, passwd);
			
			stmt = con.createStatement();
			String sql = "select * from student2";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				String str_sno = rs.getString("SNO");
				String str_sname = rs.getString("SNAME");
				String str_years = rs.getString("SEX");
				String str_major = rs.getString("MAJOR");
				String str_avr = rs.getString("AVR");
				System.out.println("SNO : " + str_sno + "   이름 : " + str_sname + "   전공 : " + str_major + "   학점 : " + str_avr);;
			}
			con.close();
			stmt.close();
			rs.close();
			
			
			System.out.println("DB 연결 성공");
			
		}catch(Exception e){
			System.out.println("조회 에러");
		}
	}

}
