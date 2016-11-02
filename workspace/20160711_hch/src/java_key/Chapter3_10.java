/* 작성일 : 20160711
 * 작성자 : 황철훈
 * 내용 : 책내용 예재
 */

package java_key;
import java.util.Scanner;
public class Chapter3_10 extends Chapter3_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("## 로그인(admin 혹은 임의 아이디) ##");
		System.out.print("# 로그인 아이디 : ");
		
		String user = scan.next();
		
		if(user.equals("admin")){
			System.out.println("관리자 로그인.");
		}else{
			System.out.println(user + "로그인.");
		}
		
		System.out.println("##메뉴를 선택 하세요.(1~2)##");
		System.out.print("# 메뉴 선택 : ");
		
		String sel = scan.next();
		
		if(sel.equals("1") && user.equals("admin")){
			System.out.println("관리자 1번 선택");
		}else if(sel.equals("2") && user.equals("admin")){
			System.out.println("관리자 2번 선택");
		}else if(sel.equals("1") && !user.equals("admin")){
			System.out.println( user+"1번 선택");
		}else if(sel.equals("2") && !user.equals("admin")){
			System.out.println( user+"2번 선택");
		}
	}

}
