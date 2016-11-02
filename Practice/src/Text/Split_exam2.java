/**
 * 파일명 : Split_exam2.java
 * 작성일 : 2016. 7. 26.
 * 파일설명 :
 */
package Text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Split_exam2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("생성자로 초기화 : " + new Integer("2"));
		  System.out.println("Object를 기본 int type으로 변환 : " + Integer.parseInt("20"));
		  
		  //아래는 java.lang.NumberFormatException 발생 
		  //System.out.println(new Integer("a1")); 
		  
		  // 예문
		  String str = "학0교abc 1종2e이 땡f34땡g땡5!6! hi7어서 8모이9자!@ ";
		  String result = "";
		  
		  // ASCII 값 47~58은 숫자 0~10
		  int i = 0;
		  while(i<str.length()) {
		   if(str.charAt(i)>=47 &&  str.charAt(i)<=58) {
		    result += "\t" + str.charAt(i);
		   }
		   i++;
		  }
		  System.out.println("ASCII 로 찾은 숫자 : " + result);
		  
		  
		  // reference으로 확인
		  int j = 0;
		  result = "";
		  while(j<str.length()) {
		   if(Character.isDigit(str.charAt(j))) {
		    result += "\t" + str.charAt(j);
		   }
		   j++;
		  }
		  System.out.println("Character의 isDigit(ch)을 이용한 찾기 : " + result);
		  
		  
		  // Pattern을 이용한 숫자 찾기
		  result = "";
		  String patternStr = "[\\d]";
		  Pattern pattern = Pattern.compile(patternStr);
		  Matcher matcher = pattern.matcher(str);
		  while(matcher.find()) {
		   result += "\t" + matcher.group(0);
		  }
		  System.out.println("Pattern 을 이용한 숫자 찾기 : " + result);
		  
		  // Pattern을 이용한 a~z 찾기
		  result = "";
		  patternStr = "[a-z]";
		  pattern = Pattern.compile(patternStr);
		  matcher = pattern.matcher(str);
		  while(matcher.find()) {
		   result += "\t" + matcher.group(0);
		  }
		  System.out.println("Pattern 을 이용한 a~z 찾기 : " + result);
		  
	}

}
