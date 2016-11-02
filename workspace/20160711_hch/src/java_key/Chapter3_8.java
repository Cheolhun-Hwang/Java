/* 작성일 : 20160711
 * 작성자 : 황철훈
 * 내용 : 책내용 예재
 */
package java_key;

import java.util.Scanner; // 사용하고 싶으면 라이브러리를 적어야함 자동 라이브러리 완성 ctrl + shift + o; java.util.* 모든 라이브러리 가져오기.

public class Chapter3_8 extends Chapter3_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); //이거 scanf임. new 동적할당.
		System.out.println("## 메뉴 선택! ##");
		System.out.println("[1] 구매자  [2] 판매자");
		System.out.print("## 메뉴를 선택하시오-> ");
		String sel = scan.next();
		//자바에서는 입력받으면 문자로 인식한다!!
		if(sel.equals("1")){
			System.out.println("환영합니다! 구매자로 로그인하셨습니다.");
		}else if(sel.equals("2")){
			System.out.println("환영합니다! 판매자로 로그인하셨습니다.");
		}else{
			System.out.println("잘못된 입력입니다.\n다시 입력하십시오.");
		}
	}

}
