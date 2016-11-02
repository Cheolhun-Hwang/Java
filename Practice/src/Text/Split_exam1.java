/**
 * 파일명 : Split_exam1.java
 * 작성일 : 2016. 7. 26.
 * 파일설명 :
 */
package Text;

public class Split_exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String email = "hwangchulhun@gmail.com", id, domain;
		int i = email.indexOf("@");
		//변수 email 이 포함하고 있는 @ 의 인덱스 값을 변수 i 에 대입.
		
		id = email.substring(0, i);
		// 변수 email 의 0번째 인덱스부터 i 번째 인덱스까지 추출하여 변수 id 에 대입
		domain = email.substring(i+1);
		// 변수 email 의 i+1 번째 인덱스부터 추출하여 변수 domain 에 대입
		
		
		System.out.println("아이디 : " + id + "  도메인 : "+domain);
		
	}

}
