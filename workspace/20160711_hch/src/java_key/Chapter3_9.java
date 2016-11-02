/* 작성일 : 20160711
 * 작성자 : 황철훈
 * 내용 : 책내용 예재
 */
package java_key;
import java.util.Scanner;
public class Chapter3_9 extends Chapter3_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("## 메뉴 선택! ##");
		System.out.println("[1] 구매자  [2] 판매자");
		System.out.print("## 메뉴를 선택하시오-> ");
		String sel = scan.next();
		if(sel.equals("1")){
			System.out.println("환영합니다! 구매자로 로그인하셨습니다.");
		}else{
			System.out.println("환영합니다! 판매자로 로그인하셨습니다.");
		}
	}

}
