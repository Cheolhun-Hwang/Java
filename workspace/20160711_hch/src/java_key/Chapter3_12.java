/* 작성일 : 20160711
 * 작성자 : 황철훈
 * 내용 : 책내용 예재
 */
package java_key;
import java.util.Scanner;
public class Chapter3_12 extends Chapter3_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("## 고객등급 ##");
		System.out.print("VIP, NEW, Young 중 선택하시오 ->");
		String memberlv = scan.next();
		String msg;
		/*switch(memberlv)
		{
			case "VIP"  :
				msg = "VIP 고객 혜택 적용";
				break;
			case "NEW" :
				msg = "신규 고객 혜택 적용";
				break;
			case "Young" :
				msg = "청소년 고객 혜택 적용";
				break;
			default :
				msg = "등급없음";
		}*/
		
		if(memberlv.equals("VIP")){
			msg = "VIP 고객 혜택 적용";
		}else if(memberlv.equals("NEW")){
			msg = "신규 고객 혜택 적용";
		}else if(memberlv.equals("Young")){
			msg = "청소년 고객 혜택 적용";
		}else{
			msg = "등급없음";
		}
		
		System.out.println(msg);
	}

}
