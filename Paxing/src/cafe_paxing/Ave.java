package cafe_paxing;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//////////////////////////
class	Averface{
	///////////////////////
	//년도
	private int when2016;
	private int when2015;
	private int when2014;
	private int when2013;
	///////////////////////
	//언급횟수
	private int pet2016;
	private int else2016;
	private int pet2015;
	private int else2015;
	private int pet2014;
	private int else2014;
	private int pet2013;
	private int else2013;
	//////////////////////
	//조회수
	private int see2016;
	private int see2016bad;
	private int see2015;
	private int see2015bad;
	private int see2014;
	private int see2014bad;
	private int see2013;
	private int see2013bad;
	//////////////////////
	//공유
	private int show2016;
	private int show2016bad;
	private int show2015;
	private int show2015bad;
	private int show2014;
	private int show2014bad;
	private int show2013;
	private int show2013bad;
	/////////////////////
	//좋아요
	private int like2016;
	private int like2016bad;
	private int like2015;
	private int like2015bad;
	private int like2014;
	private int like2014bad;
	private int like2013;
	private int like2013bad;
	////////////////////
	public int sum;
	public static int count;
	
	Averface(){
		this.when2016=0;
		this.when2015=0;
		this.when2014=0;
		this.when2013=0;
		///////////////////////
		//언급횟수
		this.pet2016=0;
		this.pet2015=0;
		this.pet2014=0;
		this.pet2013=0;
		//////////////////////
		//조회수
		this.see2016=0;
		this.see2015=0;
		this.see2014=0;
		this.see2013=0;
		this.see2016bad=0;
		this.see2015bad=0;
		this.see2014bad=0;
		this.see2013bad=0;
		//////////////////////
		//공유
		this.show2016=0;
		this.show2015=0;
		this.show2014=0;
		this.show2013=0;
		this.show2016bad=0;
		this.show2015bad=0;
		this.show2014bad=0;
		this.show2013bad=0;
		/////////////////////
		//좋아요
		this.like2016=0;
		this.like2015=0;
		this.like2014=0;
		this.like2013=0;
		this.like2016bad=0;
		this.like2015bad=0;
		this.like2014bad=0;
		this.like2013bad=0;
		this.else2013=0;
		this.else2014=0;
		this.else2015=0;
		this.else2016=0;
		////////////////////
		this.count=1;
		
	};
	
	public void setwhen2016(){
		this.when2016++;
	}
	public int getwhen2016(){
		return this.when2016;
	}
	public void setwhen2015(){
		this.when2015++;
	}
	public int getwhen2015(){
		return this.when2015;
	}
	public void setwhen2014(){
		this.when2014++;
	}
	public int getwhen2014(){
		return this.when2014;
	}
	public void setwhen2013(){
		this.when2013++;
	}
	public int getwhen2013(){
		return this.when2013;
	}
	public void setsee2016bad(int a){
		this.see2016bad = a;
	}
	public int getsee2016bad(){
		return this.see2016bad;
	}
	public void setsee2015bad(int a){
		this.see2015bad = a;
	}
	public int getsee2015bad(){
		return this.see2015bad;
	}
	public void setsee2014bad(int a){
		this.see2014bad = a;
	}
	public int getsee2014bad(){
		return this.see2014bad;
	}
	public void setsee2013bad(int a){
		this.see2013bad = a;
	}
	public int getsee2013bad(){
		return this.see2013bad;
	}
	public void setsee2016(int a){
		this.see2016 = a;
	}
	public int getsee2016(){
		return this.see2016;
	}
	public void setsee2015(int a){
		this.see2015 = a;
	}
	public int getsee2015(){
		return this.see2015;
	}
	public void setsee2014(int a){
		this.see2014 = a;
	}
	public int getsee2014(){
		return this.see2014;
	}
	public void setsee2013(int a){
		this.see2013 = a;
	}
	public int getsee2013(){
		return this.see2013;
	}
	public void setshow2016(int a){
		this.show2016 = a;
	}
	public int getshow2016(){
		return this.show2016;
	}
	public void setshow2015(int a){
		this.show2015 = a;
	}
	public int getshow2015(){
		return this.show2015;
	}
	public void setshow2014(int a){
		this.show2014 = a;
	}
	public int getshow2014(){
		return this.show2014;
	}
	public void setshow2013(int a){
		this.show2013 = a;
	}
	public int getshow2013(){
		return this.show2013;
	}
	public void setshow2016bad(int a){
		this.show2016bad = a;
	}
	public int getshow2016bad(){
		return this.show2016bad;
	}
	public void setshow2015bad(int a){
		this.show2015bad = a;
	}
	public int getshow2015bad(){
		return this.show2015bad;
	}
	public void setshow2014bad(int a){
		this.show2014bad = a;
	}
	public int getshow2014bad(){
		return this.show2014bad;
	}
	public void setshow2013bad(int a){
		this.show2013bad = a;
	}
	public int getshow2013bad(){
		return this.show2013bad;
	}
	public void setlike2016(int a){
		this.like2016 = a;
	}
	public int getlike2016(){
		return this.like2016;
	}
	public void setlike2015(int a){
		this.like2015 = a;
	}
	public int getlike2015(){
		return this.like2015;
	}
	public void setlike2014(int a){
		this.like2014 = a;
	}
	public int getlike2014(){
		return this.like2014;
	}
	public void setlike2013(int a){
		this.like2013 = a;
	}
	public int getlike2013(){
		return this.like2013;
	}
	public void setlike2016bad(int a){
		this.like2016bad = a;
	}
	public int getlike2016bad(){
		return this.like2016bad;
	}
	public void setlike2015bad(int a){
		this.like2015bad = a;
	}
	public int getlike2015bad(){
		return this.like2015bad;
	}
	public void setlike2014bad(int a){
		this.like2014bad = a;
	}
	public int getlike2014bad(){
		return this.like2014bad;
	}
	public void setlike2013bad(int a){
		this.like2013bad = a;
	}
	public int getlike2013bad(){
		return this.like2013bad;
	}
	public void setpet2016(){
		this.pet2016++;
	}
	public int getpet2016(){
		return this.pet2016;
	}
	public void setpet2015(){
		this.pet2015++;
	}
	public int getpet2015(){
		return this.pet2015;
	}
	public void setpet2014(){
		this.pet2014++;
	}
	public int getpet2014(){
		return this.pet2014;
	}
	public void setpet2013(){
		this.pet2013++;
	}
	public int getpet2013(){
		return this.pet2013;
	}
	public void setelse2016(){
		this.else2016++;
	}
	public int getelse2016(){
		return this.else2016;
	}
	public void setelse2015(){
		this.else2015++;
	}
	public int getelse2015(){
		return this.else2015;
	}
	public void setelse2014(){
		this.else2014++;
	}
	public int getelse2014(){
		return this.else2014;
	}
	public void setelse2013(){
		this.else2013++;
	}
	public int getelse2013(){
		return this.else2013;
	}
	
	//파일 저장을 위한 메소드
	public void show_table(Averface mtt){
		System.out.println("##총 누적 갯수");
		System.out.println("2016 | 펫언급 : " + mtt.getpet2016() + " 그의외 : " + mtt.getelse2016() + " 누적조회수 : "+mtt.getsee2016() + " 이외누적조회수 : "+mtt.getsee2016bad() + " 누적공유수 : " + mtt.getshow2016() + " 이외누적공유수 : " + mtt.getshow2016bad() + " 누적좋아요수 : " + mtt.getlike2016() + " 이외누적좋아요수 : " + mtt.getlike2016bad());
		System.out.println("2015 | 펫언급 : " + mtt.getpet2015() + " 그의외 : " + mtt.getelse2015() + " 누적조회수 : "+mtt.getsee2015() + " 이외누적조회수 : "+mtt.getsee2015bad() + " 누적공유수 : " + mtt.getshow2015() + " 이외누적공유수 : " + mtt.getshow2015bad() + " 누적좋아요수 : " + mtt.getlike2015() + " 이외누적좋아요수 : " + mtt.getlike2015bad());
		System.out.println("2014 | 펫언급 : " + mtt.getpet2014() + " 그의외 : " + mtt.getelse2014() + " 누적조회수 : "+mtt.getsee2014() + " 이외누적조회수 : "+mtt.getsee2014bad() + " 누적공유수 : " + mtt.getshow2014() + " 이외누적공유수 : " + mtt.getshow2014bad() + " 누적좋아요수 : " + mtt.getlike2014() + " 이외누적좋아요수 : " + mtt.getlike2014bad());
		System.out.println("2013 | 펫언급 : " + mtt.getpet2013() + " 그의외 : " + mtt.getelse2013() + " 누적조회수 : "+mtt.getsee2013() + " 이외누적조회수 : "+mtt.getsee2013bad() + " 누적공유수 : " + mtt.getshow2013() + " 이외누적공유수 : " + mtt.getshow2013bad() + " 누적좋아요수 : " + mtt.getlike2013() + " 이외누적좋아요수 : " + mtt.getlike2013bad());
		System.out.println("##총 누적 퍼센트");
		System.out.println("2016 | 펫언급 : " + mtt.getpet2016()/(mtt.getpet2016()+mtt.getelse2016()) + " 그의외 : " + mtt.getelse2016()/(mtt.getpet2016()+mtt.getelse2016()) + " 누적조회수 : "+mtt.getsee2016()/mtt.getpet2016() + " 이외누적조회수 : "+mtt.getsee2016bad()/mtt.getelse2016() + " 누적공유수 : " + mtt.getshow2016()/mtt.getpet2016() + " 이외누적공유수 : " + mtt.getshow2016bad()/mtt.getelse2016() + " 누적좋아요수 : " + mtt.getlike2016()/mtt.getpet2016() + " 이외누적좋아요수 : " + mtt.getlike2016bad()/mtt.getelse2016());
		System.out.println("2015 | 펫언급 : " + mtt.getpet2015()/(mtt.getpet2015()+mtt.getelse2015()) + " 그의외 : " + mtt.getelse2015()/(mtt.getpet2015()+mtt.getelse2015()) + " 누적조회수 : "+mtt.getsee2015()/mtt.getpet2015() + " 이외누적조회수 : "+mtt.getsee2015bad()/mtt.getelse2015() + " 누적공유수 : " + mtt.getshow2015()/mtt.getpet2015() + " 이외누적공유수 : " + mtt.getshow2015bad()/mtt.getelse2015() + " 누적좋아요수 : " + mtt.getlike2015()/mtt.getpet2015() + " 이외누적좋아요수 : " + mtt.getlike2015bad()/mtt.getelse2015());
		System.out.println("2014 | 펫언급 : " + mtt.getpet2014()/(mtt.getpet2014()+mtt.getelse2014()) + " 그의외 : " + mtt.getelse2014()/(mtt.getpet2014()+mtt.getelse2014()) + " 누적조회수 : "+mtt.getsee2014()/mtt.getpet2014() + " 이외누적조회수 : "+mtt.getsee2014bad()/mtt.getelse2014() + " 누적공유수 : " + mtt.getshow2014()/mtt.getpet2014() + " 이외누적공유수 : " + mtt.getshow2014bad()/mtt.getelse2014() + " 누적좋아요수 : " + mtt.getlike2014()/mtt.getpet2014() + " 이외누적좋아요수 : " + mtt.getlike2014bad()/mtt.getelse2014());
		System.out.println("2013 | 펫언급 : " + mtt.getpet2013()/(mtt.getpet2013()+mtt.getelse2013()) + " 그의외 : " + mtt.getelse2013()/(mtt.getpet2013()+mtt.getelse2013()) + " 누적조회수 : "+mtt.getsee2013()/mtt.getpet2013() + " 이외누적조회수 : "+mtt.getsee2013bad()/mtt.getelse2013() + " 누적공유수 : " + mtt.getshow2013()/mtt.getpet2013() + " 이외누적공유수 : " + mtt.getshow2013bad()/mtt.getelse2013() + " 누적좋아요수 : " + mtt.getlike2013()/mtt.getpet2013() + " 이외누적좋아요수 : " + mtt.getlike2013bad()/mtt.getelse2013());
	}
	
	public void save_text(){			
		String string1 = "";
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
		this.when2016=0;
		this.when2015=0;
		this.when2014=0;
		this.when2013=0;
		///////////////////////
		//언급횟수
		this.pet2016=0;
		this.pet2015=0;
		this.pet2014=0;
		this.pet2013=0;
		//////////////////////
		//조회수
		this.see2016=0;
		this.see2015=0;
		this.see2014=0;
		this.see2013=0;
		//////////////////////
		//공유
		this.show2016=0;
		this.show2015=0;
		this.show2014=0;
		this.show2013=0;
		/////////////////////
		//좋아요
		this.like2016=0;
		this.like2015=0;
		this.like2014=0;
		this.like2013=0;
		////////////////////
	}
	//관련 단어 언급수를 찾기 위한 메소드
	public void petcount(Averface mtt, String s, String find){
		
		Pattern pattern = Pattern.compile(find);			
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
			//mtt.setwordcount();
			this.sum++;
		}
	}
}
////////////////////////////

public class Ave {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	
	public void sub(String source){
		File dfile = new File(source);
		File[] FileList=dfile.listFiles();
		Averface mtt = new Averface();
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
							String sub[] = s.split(" ");
							/*System.out.println("순위 : "+mtt.count++);
							System.out.println(sub[0]);
							System.out.println(sub[1]);
							System.out.println(sub[2]);
							System.out.println(sub[3]);
							System.out.println(sub[4]);*/
							if(sub[0].indexOf("2016-")>-1){
								mtt.setwhen2016();
								if(sub[1].indexOf("0")>-1){
									mtt.setelse2016();
									int see = Integer.parseInt(sub[2]);
									int show = Integer.parseInt(sub[3]);
									int like = Integer.parseInt(sub[4]);
									
									mtt.setsee2016bad(see);
									mtt.setshow2016bad(show);
									mtt.setlike2016bad(like);
								}else {
									mtt.setpet2016();
									int see = Integer.parseInt(sub[2]);
									int show = Integer.parseInt(sub[3]);
									int like = Integer.parseInt(sub[4]);
									
									mtt.setsee2016(see);
									mtt.setshow2016(show);
									mtt.setlike2016(like);
								}
								
								
							}else if(sub[0].indexOf("2015-")>-1){
								mtt.setwhen2015();
								if(sub[1].indexOf("0")>-1){
									mtt.setelse2015();
									int see = Integer.parseInt(sub[2]);
									int show = Integer.parseInt(sub[3]);
									int like = Integer.parseInt(sub[4]);
									
									mtt.setsee2015bad(see);
									mtt.setshow2015bad(show);
									mtt.setlike2015bad(like);
								}else {
									mtt.setpet2015();
									int see = Integer.parseInt(sub[2]);
									int show = Integer.parseInt(sub[3]);
									int like = Integer.parseInt(sub[4]);
									
									mtt.setsee2015(see);
									mtt.setshow2015(show);
									mtt.setlike2015(like);
								}
								
							}else if(sub[0].indexOf("2014-")>-1){
								mtt.setwhen2014();
								if(sub[1].indexOf("0")>-1){
									mtt.setelse2014();
									int see = Integer.parseInt(sub[2]);
									int show = Integer.parseInt(sub[3]);
									int like = Integer.parseInt(sub[4]);
									
									mtt.setsee2014bad(see);
									mtt.setshow2014bad(show);
									mtt.setlike2014bad(like);
								}else {
									mtt.setpet2014();
									int see = Integer.parseInt(sub[2]);
									int show = Integer.parseInt(sub[3]);
									int like = Integer.parseInt(sub[4]);
									
									mtt.setsee2014(see);
									mtt.setshow2014(show);
									mtt.setlike2014(like);
								}
								
							}else if(sub[0].indexOf("2013-")>-1){
								mtt.setwhen2013();
								if(sub[1].indexOf("0")>-1){
									mtt.setelse2013();
									int see = Integer.parseInt(sub[2]);
									int show = Integer.parseInt(sub[3]);
									int like = Integer.parseInt(sub[4]);
									
									mtt.setsee2013bad(see);
									mtt.setshow2013bad(show);
									mtt.setlike2013bad(like);
								}else {
									mtt.setpet2013();
									int see = Integer.parseInt(sub[2]);
									int show = Integer.parseInt(sub[3]);
									int like = Integer.parseInt(sub[4]);
									
									mtt.setsee2013(see);
									mtt.setshow2013(show);
									mtt.setlike2013(like);
								}
								
							}
							
							///위의 내용은 지금까지 파일을 읽어서 각 값을 부여하기
							
							
							
							
							
							
						}
						}catch(Exception e){
							e.printStackTrace();
							}
						System.out.println("Done!!");		
				}else if(rfile.isDirectory()){
					System.out.println(rfile+"디렉토리입니다.");
				}
				
				
				mtt.show_table(mtt);
				
			}
		}catch(Exception e){
			System.out.println("리드에러!!");
		}
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Ave a = new Ave();
		a.sub("/home/hch/paxing_dir/complete/face_result/ave/");
	}
}
