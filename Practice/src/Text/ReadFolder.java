/**
 * 파일명 : ReadFolder.java
 * 작성일 : 2016. 7. 23.
 * 파일설명 :
 */
package Text;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class ReadFolder {
	public static void main(String args[]){
		//폴더명 세팅
		String folder="C://";
		//폴더명으로 파일 객체 생성
		File file=new File(folder);
		
		//폴더명의 폴더가 없으면 종료
		if(file.isDirectory()){
			System.out.println("해당디렉토리는 존재하지 않습니다.");
			System.exit(1);
		}
		
		//폴더라면 폴더가 가진 파일객체를 리스트로 받는다.
		File[] list=file.listFiles();
		
		//ModifiedDate클래스에 정의된 순서에 의해 정렬한다.
		Arrays.sort(list, new ModifiedData());
		//리스트에서 파일을 하나씩 꺼낸다.
		for(File f:list){
			//날짜 출력을 위한 Date 객체 생성 생성자로 마지막 수정날짜인 LastModified메소드의 long 리턴값을 넣는다. 
			Date d =new Date(f.lastModified());
			//파일명, 날짜 , 크기를 출력한다.
			System.out.println(f.getName());
		}
	}
}
