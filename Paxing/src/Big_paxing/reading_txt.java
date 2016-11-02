package Big_paxing;

import java.io.*;

public class reading_txt {
	public void subDirList(String source) {
		// TODO Auto-generated method stub
		File dir=new File(source);
		File[] FileList=dir.listFiles();
		try{
			for(int i = 0; i<FileList.length;i++){
				File file = FileList[i];
				if(file.isFile()){
					//파일이 있으면
					try{
					System.out.println("\t파일이름 = "+file.getName());
					
					String file_url = source + file.getName();
					
					System.out.println(file_url);
					
					FileInputStream fin = new FileInputStream(file_url);
					InputStreamReader inreader = new InputStreamReader(fin, "euc-kr");
					BufferedReader breader = new BufferedReader(inreader);
					
					String s;
					while((s = breader.readLine())!=null){
						if(s.indexOf("postViewArea")>-1){
						
						}else if(s.indexOf(":")>-1){
							String txt[] = s.split(":");
							System.out.println("txt[3], txt[4]");
						}else{
							
						}
					}
					System.out.println("DONE!!");
					}catch(Exception e){
						System.out.println("입출력 오류.");
					}
					
				}else if(file.isDirectory()){
					System.out.println("디렉토리 이름 = "+file.getName());
					//서브디렉토리가 존재하면 재귀적 방법으로 다시 탐색
					//subDirList(file.getCanonicalPath().toString());
				}
			}
		}catch(/*IO*/Exception e){
			System.out.println("에러!!");
		}
	}
	
	public static void main(String args[]){
		reading_txt sdf = new reading_txt();
		String source = "/home/hch/paxing_dir/euc";
		sdf.subDirList(source);
	}
}
