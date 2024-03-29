/**
 * 파일명 : Comparing.java
 * 작성일 : 2016. 7. 26.
 * 파일설명 :
 */
package Text;
 
public class Comparing {
 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String txt1 = "가나다라";
		String txt2 = "해당 내용은 테스트 입니다.";
		String txt3 = "가격은 29,000원입니다.";
		
		//contains 를 이용한 방법(true, false 반환)
		/*if(txt1.contains("나다")){
			System.out.println("존재!");
		}else{
			System.out.println("존재하지 않음!");
		}*/
		
		//indexOf 를 이용한 방법
		int index;
		if((index=txt2.indexOf("테스트")) >-1 || (index = txt2.indexOf("내용")) >-1){
			/*String part = txt2.substring(index);
			int index_of = part.indexOf(" ");
			String detail_part = part.substring(0, index_of);
			System.out.println(detail_part);*/
			/*System.out.println(index);
			String sub_str[] = txt2.substring(0, index).split(" ");
			System.out.println(sub_str[sub_str.length-1]);*/
			String sub_str = txt2.substring(index);
			int sub_index = sub_str.indexOf(" ");
			String part_str = sub_str.substring(0, sub_index);
			
			String sub_str2[] = txt2.substring(0, index).split(" ");
			System.out.println(part_str+sub_str2[sub_str2.length-1]);
		}
		
		//matches 를 이용한 방법
		if(txt2.matches(".*테스트.*")){
			System.out.println("존재!");
		}else{
			System.out.println("존재하지 않음!");
		}
		
		
		//matches 를 이용하여 정규 표현식으로 문자열에 숫자가 있는지 확인
		if(txt3.matches(".*[0-9].*")){
			System.out.println("숫자 존재!");
		}else{
			System.out.println("숫자 존재하지 않음!");
		}
		
	}
 
}
