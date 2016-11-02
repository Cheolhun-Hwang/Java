package Big_paxing;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//////////////////////////
class Make_tablesss{
	///////////////////////
	private String write_day;					//게시물 작성날짜
	
	/////////////////////////
	private int wordcount; 						//언급여부 wordcount 하는 변수
	private String datgl;						//댓글
	private String gongu;						//공유
	private String dda;							//좋아요
	
	Make_tablesss(){
		this.write_day="";
		this.wordcount=0;
		this.datgl="";
		this.gongu="";
		this.dda="";
		
	};
	public void setwordcount(){
		this.wordcount++;
	}
	public void setday(String date){
		System.out.println(date);
		this.write_day = date;
	}
	public void setdatgl(String st){
		this.datgl = st;
	}
	public void setgongu(String st){
		this.gongu = st;
	}
	public void setdda(String st){
		this.dda = st;
	}
	//파일 저장을 위한 메소드
	public void save_text(){			
		String string1 = this.write_day+" "+this.wordcount+" "+this.datgl+" "+this.gongu+" "+this.dda+" ";
		String txt = string1+"\n";			//저장형식 지정
       String fileName = "/home/hch/paxing_dir/complete/face_result/facebook_paxing4.txt";	//텍스트 파일 저장할 위치
        
        try{
        	 File wfile = new File(fileName);
            BufferedWriter fw = new BufferedWriter(new FileWriter(wfile, true));// BufferedWriter 와 FileWriter를 조합하여 사용 (속도 향상)
            fw.write(txt);// 파일안에 문자열 쓰기
            fw.flush();  
            fw.close(); // 객체 닫기  
        }catch(Exception e){
            e.printStackTrace();
        }
	}
	
	//초기화를 위한 메소드
	public void clear(){
		//tema, city는 초기화를 하지 않는다.
		this.write_day="";
		////////////////
		this.wordcount=0;
		this.datgl="";
		this.gongu="";
		this.dda="";
	}
	//관련 단어 언급수를 찾기 위한 메소드
	public void petcount(Make_tablesss mtt, String s, String find){
		
		Pattern pattern = Pattern.compile(find);			
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
			//mtt.setwordcount();
			this.wordcount++;
		}
	}
}
////////////////////////////

public class Face_Paxing {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	
	public void sub(String source){
		File dfile = new File(source);
		File[] FileList=dfile.listFiles();
		Make_tablesss mtt = new Make_tablesss();
		try{
			for(int i = 0;i<FileList.length;i++){
				File rfile = FileList[i];
				/////////////////////////////
				/////////////////////////////
				if(rfile.isFile()){
					try{
						FileInputStream fin = new FileInputStream(rfile);
						InputStreamReader isr = new InputStreamReader(fin, "utf-8");/////utf-8////euc-kr //저장형식에 따른 분류
						BufferedReader reader = new BufferedReader(isr);
					
						String s;
						while((s = reader.readLine())!=null){
							if((s.indexOf("from_id")>-1)&&(s.indexOf("message")>-1)){
								
							}else if(s.indexOf("도기도기")>-1){
								String txt[] = s.split("@@@");
								System.out.println(txt[8]);
								System.out.println(txt[9]);
								System.out.println(txt[10]);
								
								
										mtt.setdatgl(txt[8]);
										mtt.setgongu(txt[9]);
										mtt.setdda(txt[10]);
										
										String find = null;
										if(txt[3].indexOf("멍멍")>-1){
											find="멍멍";
											mtt.petcount(mtt, txt[3], find);
										}else if(txt[3].indexOf("개")>-1){
											find="개";
											mtt.petcount(mtt, txt[3], find);
										}else if(txt[3].indexOf("야옹")>-1){
											find="야옹";
											mtt.petcount(mtt, txt[3], find);
										}else if(txt[3].indexOf("고양이")>-1){
											find="고양이";
											mtt.petcount(mtt, txt[3], find);
										}else if(txt[3].indexOf("반려")>-1){
											find="반려";
											mtt.petcount(mtt, txt[3], find);
										}else if(txt[3].indexOf("애완")>-1){
											find="애완";
											mtt.petcount(mtt, txt[3], find);
										}else if(txt[3].indexOf("애견")>-1){
											find="애견";
											mtt.petcount(mtt, txt[3], find);
										}else if(txt[3].indexOf("동물")>-1){
											find="동물";
											mtt.petcount(mtt, txt[3], find);
										}else if(txt[3].indexOf("코기")>-1){
											find="코기";
											mtt.petcount(mtt, txt[3], find);
										}else if(txt[3].indexOf("허스키")>-1){
											find="허스키";
											mtt.petcount(mtt, txt[3], find);
										}else if(txt[3].indexOf("시바")>-1){
											find="시바";
											mtt.petcount(mtt, txt[3], find);
										}else if(txt[3].indexOf("리트리버")>-1){
											find="리트리버";
											mtt.petcount(mtt, txt[3], find);
										}else if(txt[3].indexOf("냥이")>-1){
											find="냥이";
											mtt.petcount(mtt, txt[3], find);
										}else if(txt[3].indexOf("닥스훈트")>-1){
											find="닥스훈트";
											mtt.petcount(mtt, txt[3], find);
										}else if(txt[3].indexOf("멍뭉")>-1){
											find="멍뭉";
											mtt.petcount(mtt, txt[3], find);
										}else if(txt[3].indexOf("강아지")>-1){
											find="강아지";
											mtt.petcount(mtt, txt[3], find);
										}else if(txt[3].indexOf("양이")>-1){
											find="양이";
											mtt.petcount(mtt, txt[3], find);
										}else if(txt[3].indexOf("도기")>-1){
											find="도기";
											mtt.petcount(mtt, txt[3], find);
										}
										
										System.out.println(txt[3]);
										
										mtt.setday(txt[4].substring(1, 11));
										mtt.save_text();
										mtt.clear();
							}
						}
					}catch(Exception e){
							e.printStackTrace();
							}
						System.out.println("Done!!");		
				}else if(rfile.isDirectory()){
					System.out.println(rfile+"디렉토리입니다.");
				}
			}
		}catch(Exception e){
			System.out.println("리드에러!!");
		}
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Face_Paxing a = new Face_Paxing();
		a.sub("/home/hch/paxing_dir/complete/facebook");
	}
}
