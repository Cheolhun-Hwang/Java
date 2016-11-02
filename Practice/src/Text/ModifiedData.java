/**
 * 파일명 : ModifiedData.java
 * 작성일 : 2016. 7. 24.
 * 파일설명 :
 */
package Text;

import java.io.File;
import java.util.Comparator;

public class ModifiedData implements Comparator<File> {
	public int compare(File f1, File f2){
		//수정날짜의 값이 더 크면 -1리턴, -1을 리턴하면 첫번째 것이 앞으로 간다.
		if(f1.lastModified()>f2.lastModified()){
			return -1;
		}else if(f1.lastModified()==f2.lastModified()){
			return 0;
		}else{
			return 1;
		}
	}
}
