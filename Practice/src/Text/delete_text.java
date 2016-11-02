/**
 * 파일명 : delete_text.java
 * 작성일 : 2016. 8. 2.
 * 파일설명 :
 */
package Text;

/**
 * @author qewqs
 *
 */
public class delete_text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exam = "Hello Wolrd <div id='name'> 안녕 여려분~! </div> 뿡뿡이";
		exam.replace("<*>", "");
		System.out.println(exam);
	}

}
