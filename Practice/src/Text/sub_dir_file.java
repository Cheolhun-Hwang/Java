/**
 * 파일명 : sub_dir_file.java
 * 작성일 : 2016. 7. 24.
 * 파일설명 :
 */
package Text;

import java.io.File;
import java.io.IOException;


public class sub_dir_file {
	public void subDirList(String source) {
		// TODO Auto-generated method stub
		File dir=new File(source);
		File[] FileList=dir.listFiles();
		try{
			for(int i = 0; i<FileList.length;i++){
				File file = FileList[i];
				if(file.isFile()){
					//파일이 있으면
					System.out.println("\t파일이름 = "+file.getName());
				}else if(file.isDirectory()){
					System.out.println("디렉토리 이름 = "+file.getName());
					//서브디렉토리가 존재하면 재귀적 방법으로 다시 탐색
					subDirList(file.getCanonicalPath().toString());
				}
			}
		}catch(/*IO*/Exception e){
			System.out.println("에러!!");
		}
	}
	
	public static void main(String args[]){
		sub_dir_file sdf = new sub_dir_file();
		String source = "C:\\Users\\qewqs\\Desktop\\crowling\\";
		sdf.subDirList(source);
	}
}
	
	

