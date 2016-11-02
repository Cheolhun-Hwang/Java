/* 작성일 : 20160711
 * 작성자 : 황철훈
 * 내용 : 교재 예제
 */
package java_key;

public class Chapter3_16 extends Chapter3_13_extra {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] members = {{"101", "김지윤"}, {"102", "송재승"}, {"103", "김민재"}}; //배열의 선언은 클래스처럼 사용한다.
		for(int i = 0; i<members.length;i++){                                      //c와 다르니 꼭 생각하며 코딩하도록!
			System.out.println(members[i][0] + " : " + members[i][1]);
		}
	}

}
