/**
 * 파일명 : sqlplusDB.java
 * 작성일 : 2016. 7. 17.
 * 파일설명 :
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author qewqs
 *
 */
public class sqlplusDB {

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
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String user = "HCH";
			String passwd = "hch";
			con = DriverManager.getConnection(url, user, passwd);
			System.out.println("DB 연결 성공");
		}catch(Exception e){
			System.out.println("유저 연결 에러");
		}
	}

}
