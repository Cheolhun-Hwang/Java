/*
 * 날짜 : 20160712
 * 작성자 : 황철훈
 * 내용 : 교재 예
 */
package Chapter6;

public class Ex6_1 {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		// 생성자의 매개변수와의 데이터형이 맞지않아 에러가난다.
		//String str4 = new String(30);
		String str4 = String.valueOf(30); // 문자로 처리하기!
		String num1 = "20";
		
		if(str1 == str2){
			System.out.println("같은 문자열입니다.");
		}else{
			System.out.println("다른 문자열입니다.");
		}
		if(str1==str3){
			System.out.println("같은 문자열입니다.");
		}else{
			System.out.println("다른 문자열입니다.");
		}
		
		System.out.println("===================================");
		System.out.println("num1+30 = " + num1+30);
		System.out.println("str1의 길이 : " + str1.length());
		System.out.println("str1의 네번째 문자 : "+ str1.charAt(3));
		System.out.println("str1의 2~4위치에 있는 문자열 : "+ str1.substring(1,4));
		System.out.println("str1의 1을 k로 치환 : " + str1.replace('l', 'k'));
		
		String str5 = "반갑습니다. 여러분";
		System.out.println("===================================");
		for(int i = 0;i<str5.length();i++){
			System.out.println(str5.charAt(i));
		}
	}

}
