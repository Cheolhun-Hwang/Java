package Big_paxing;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//////////////////////////
class Make_tabless{
	///////////////////////
	private String write_day;					//게시물 작성날짜
	
	/////////////////////////
	private int wordcount; 						//언급여부 wordcount 하는 변수
	private String datgl;						//댓글
	private String gongu;						//공유
	private String dda;							//좋아요
	
	
	Make_tabless(){
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
       String fileName = "/home/hch/paxing_dir/complete/facebook_paxing2.txt";	//텍스트 파일 저장할 위치
        
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
	public void save_String(String s){			
		String txt = s;			//저장형식 지정
       String fileName = "/home/hch/paxing_dir/complete/facebook/filter4.txt";	//텍스트 파일 저장할 위치
        
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
	public void petcount(Make_tabless mtt, String s, String find){
		
		Pattern pattern = Pattern.compile(find);			
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
			//mtt.setwordcount();
			this.wordcount++;
		}
	}
}
////////////////////////////

public class Facebook_paxing {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	
	public void sub(String source){
		File dfile = new File(source);
		File[] FileList=dfile.listFiles();
		Make_tabless mtt = new Make_tabless();
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
						String sub="";
						while((s = reader.readLine())!=null){
							if(s.indexOf("@@@")>-1){
								if((s.indexOf("from_id")>-1) && (s.indexOf("message")>-1)){
									sub+=s+"\n";
								}else if((s.indexOf("147088")>-1) && (s.indexOf("http")>-1) ){
									sub+=s+"\n";
								}else if((s.indexOf("147088")>-1) && !(s.indexOf("http")>-1)){
									sub+=s.replaceAll("\n", "");
								}else if(!(s.indexOf("147088")>-1) && (s.indexOf("http")>-1)){
									sub+=s+"\n";
								}else if(!(s.indexOf("147088")>-1) && !(s.indexOf("http")>-1)){
									sub+=s.replaceAll("\n", "");
								}
								System.out.println("done!");
							}else{
								
							}	
							
							}
							mtt.save_String(sub);
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
		Facebook_paxing a = new Facebook_paxing();
		a.sub("/home/hch/paxing_dir/facebook2/");
	}
}
