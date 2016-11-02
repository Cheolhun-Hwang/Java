package cafe_paxing;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//////////////////////////
class Make_table{
	///////////////////////
	private String sex;							//작성자 성별 :  본문 스크랩핑을 통해 추출
	private String ages;							//작성자 나이 :  본문 스크랩핑을 통해 추출
	private String when_write;					//작성 날짜 	 : 스크랩핑 타이틀부분
	//////////////////////
	private String tema1;						//캠핑 테마  :  본문 스크랩핑을 통해 추출
	private String tema2;						//캠핑 테마2 :  본문 스크랩핑을 통해 추출, 중복추출
	private String tema3;						//캠핑 테마3 :  본문 스크랩핑을 통해 추출, 중복추출
	private String who_with; 					//동반      : 친구, 연인, 가족 :  본문 스크랩핑을 통해 추출
	/////////////////////
	private String sleep;						//텐트유형    :  본문 스크랩핑을 통해 추출
	private String transport;					//교통       :  본문 스크랩핑을 통해 추출
	private String food;							//음식       :  본문 스크랩핑을 통해 추출
	/////////////////////
	private String city;							//시/구		 :  1차 파일 이름에 따른 분류
	private String city2;						//시/구		 :  본문 스크랩핑을 통해 추출, 언급여부
	private String city3;						//시/구		 :  본문 스크랩핑을 통해 추출, 언급여부, 중복추출
	private String sort; 						//스크랩핑 사이트 분류 
	private String person; 						//인원수		:  본문 스크랩핑을 통해 추출
	private String stay_long; 					//여행기간	:  본문 스크랩핑을 통해 추출
	private String spot;							//세부지역 	:  본문 스크랩핑을 통해 추출
	private String spot2;						//세부지역 	:  본문 스크랩핑을 통해 추출, 중복추출
	//////////////////
	private String toilet;						//화장실및관련세부사항 :  본문 스크랩핑을 통해 추출
	private String clean;						//청결도		:  본문 스크랩핑을 통해 추출	
	private String man;							//만족도		:  본문 스크랩핑을 통해 추출
	/////////////////
	private String title;						//블로그 제목 유형분류(관련없는 블로그 제외용) :  본문 스크랩핑을 통해 추출
	private String mat;							//맛집언급여부 :  본문 스크랩핑을 통해 추출
	/////////////////////////
	private int wordcount; 						//언급여부 wordcount 하는 변수
	
	
	Make_table(){
		this.sex ="null"; 
		this.ages ="null"; 
		this.when_write ="null"; 
		//////////////////////
		this.tema1 ="null";
		this.tema2 ="null";
		this.tema3 ="null";
		this.who_with ="null";
		/////////////////////
		this.sleep ="null"; 
		this.transport ="null"; 
		this.food ="null"; 
		////////////////////
		this.city="null"; 
		this.sort="null"; 
		this.person="null";
		this.stay_long="null";
		this.spot="null";
		///////////////////
		this.toilet="null";
		this.clean="null";
		this.man="null";
		///////////////////
		this.title="null";
		this.mat="null";
		this.spot2="null";
		this.city2="null";
		this.wordcount=0;
		this.city3="null";
	};
	public void setcity3(String sll){
		this.city3=sll;
	}
	//각 변수의 값을 입력시키는 메소드 모음
	public void setsex(String ssex){
		this.sex = ssex;
	}
	public void setages(String sages){
		this.ages = sages;
	}
	public void setwhen_write(String swhen_write){
		this.when_write = swhen_write;
	}
	public void settema1(String stema){
		this.tema1 = stema;
	}
	public void settema2(String stema){
		this.tema2 = stema;
	}
	public void settema3(String stema){
		this.tema3 = stema;
	}
	public void gettema1(){
		System.out.println(this.tema1);
	}
	public void setwho_with(String sww){
		this.who_with = sww;
	}
	public void setsleep(String ssp){
		this.sleep = ssp;
	}
	public void settransport(String stp){
		this.transport = stp;
	}
	public void setfood(String sfood){
		this.food = sfood;
	}
	public void setcity(String sct){
		this.city = sct;
	} 
	public void setsort(String sst){
		this.sort = sst;
	}
	public void setperson(String pst){
		this.person = pst;
	}
	public void setstaylong(String ssl){
		this.stay_long = ssl;
	}
	public void setspot(String ssl){
		this.spot = ssl;
	}
	public void settoilet(String ssl){
		this.toilet = ssl;
	}
	public void setclean(String ssl){
		this.clean= ssl;
	}
	public void setman(String ssl){
		this.man= ssl;
	}
	public void settitle(String ssl){
		this.title=ssl;
	}
	public void setmat(String ssl){
		this.mat=ssl;
	}
	public void setspot2(String ssl){
		this.spot2=ssl;
	}
	public void setcity2(String ssl){
		this.city2=ssl;
	}
	public void setwordcount(){
		this.wordcount++;
	}
	public String getcity(){
		return this.city;
	}
	/*public void print_txt(){
		String string1 = this.title+" "+this.sex+" "+this.ages+" "+this.when_write+" ";
		String string2 = this.tema1+" "+this.tema2+" "+this.tema3+" "+this.who_with+" ";
		String string3 = this.sleep+" "+this.transport+" " +this.food+" "+this.mat+" "+this.spot+" "+this.spot2+" ";
		String string4 = this.city+" "+this.city2+" "+this.sort+" "+this.person+" "+this.stay_long+" ";
		String string5 = this.toilet+" "+this.clean+" "+this.man+" ";
		
		String txt = string1+string2+string3+string4+string5+"\n";
		System.out.println(txt);
	}*/
	//파일 저장을 위한 메소드
	public void save_text(){			
		String string1 = this.title+" "+this.sex+" "+this.ages+" "+this.when_write+" ";  				//각 분류하여 저장하기 위해 문자열 분류
		String string2 = this.tema1+" "+this.tema2+" "+this.tema3+" "+this.who_with+" ";					//각 분류하여 저장하기 위해 문자열 분류
		String string3 = this.sleep+" "+this.transport+" " +this.food+" "+this.mat+" "+this.spot+" "+this.spot2+" "; //각 분류하여 저장하기 위해 문자열 분류
		String string4 = this.city+" "+this.city2+" "+this.city3+" "+this.sort+" "+this.person+" "+this.stay_long+" "; //각 분류하여 저장하기 위해 문자열 분류
		String string5 = this.toilet+" "+this.clean+" "+this.man+" "+this.wordcount+" ";
		String txt = string1+string2+string3+string4+string5+"\n";			//저장형식 지정
       String fileName = "/home/hch/paxing_dir/complete/caferesult/paxing.txt";	//텍스트 파일 저장할 위치
        
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
		this.sex ="null"; 
		this.ages ="null"; 
		this.when_write ="null"; 
		//////////////////////	
		this.who_with ="null";
		/////////////////////
		this.sleep ="null"; 
		this.transport ="null"; 
		this.food ="null"; 
		////////////////////
		this.sort="null"; 
		this.person="null";
		this.stay_long="null";
		this.spot="null";
		/////////////////
		this.toilet="null";
		this.clean="null";
		this.man="null";
		/////////////////
		///////////////////
		this.title="null";
		this.mat="null";
		this.spot2="null";
		this.city2="null";
		this.city3="null";
		////////////////
		this.wordcount=0;
		
	}
	//관련 단어 언급수를 찾기 위한 메소드
	public void wordcount(Make_table mtt, String s){
		
		Pattern pattern = Pattern.compile("안전");			
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
			//mtt.setwordcount();
			this.wordcount++;
		}
		Pattern pattern2 = Pattern.compile("소방");			
		Matcher matcher2 = pattern2.matcher(s);
		while (matcher2.find()) {
			//mtt.setwordcount();
			this.wordcount++;
		}
		Pattern pattern3 = Pattern.compile("소화기");			
		Matcher matcher3 = pattern3.matcher(s);
		while (matcher3.find()) {
			//mtt.setwordcount();
			this.wordcount++;
		}
		Pattern pattern4 = Pattern.compile("소화시설");			
		Matcher matcher4 = pattern4.matcher(s);
		while (matcher4.find()) {
			//mtt.setwordcount();
			this.wordcount++;
		}
		Pattern pattern5 = Pattern.compile("재난");			
		Matcher matcher5 = pattern5.matcher(s);
		while (matcher5.find()) {
			//mtt.setwordcount();
			this.wordcount++;
		}
		Pattern pattern6 = Pattern.compile("화재");			
		Matcher matcher6 = pattern6.matcher(s);
		while (matcher6.find()) {
			//mtt.setwordcount();
			this.wordcount++;
		}
		Pattern pattern8 = Pattern.compile("안전사고");			
		Matcher matcher8 = pattern8.matcher(s);
		while (matcher8.find()) {
			//mtt.setwordcount();
			this.wordcount++;
		}
		Pattern pattern9 = Pattern.compile("화상");			
		Matcher matcher9 = pattern9.matcher(s);
		while (matcher9.find()) {
			//mtt.setwordcount();
			this.wordcount++;
		}
		Pattern pattern10 = Pattern.compile("가스사고");			
		Matcher matcher10 = pattern10.matcher(s);
		while (matcher10.find()) {
			//mtt.setwordcount();
			this.wordcount++;
		}
		Pattern pattern11 = Pattern.compile("구급");			
		Matcher matcher11 = pattern11.matcher(s);
		while (matcher11.find()) {
			//mtt.setwordcount();
			this.wordcount++;
		}
		Pattern pattern12 = Pattern.compile("의료품");			
		Matcher matcher12 = pattern12.matcher(s);
		while (matcher12.find()) {
			//mtt.setwordcount();
			this.wordcount++;
		}
		Pattern pattern13 = Pattern.compile("상처");			
		Matcher matcher13 = pattern13.matcher(s);
		while (matcher13.find()) {
			//mtt.setwordcount();
			this.wordcount++;
		}
		//안전, 소방, 소화기, 소화시설, 재난, 화재, 안전사고, 화상, 가스사고,구급, 의료품, 상처
	}
	}
////////////////////////////

public class txt_read {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	
	public void sub(String source){
		File dfile = new File(source);
		File[] FileList=dfile.listFiles();
		Make_table mtt = new Make_table();
		try{
			for(int i = 0;i<FileList.length;i++){
				File rfile = FileList[i];
				if(rfile.isFile()){
					try{
						FileInputStream fin = new FileInputStream(rfile);
						InputStreamReader isr = new InputStreamReader(fin, "euc-kr");/////utf-8////euc-kr //저장형식에 따른 분류
						BufferedReader reader = new BufferedReader(isr);
					
						String s;
						while((s = reader.readLine())!=null){
							String sub[] = s.split("@@");
							
							mtt.setwhen_write(sub[3].replaceAll(" ", ""));
							System.out.println("날짜 : " + sub[3]);
							System.out.println("내용 : " + sub[4]);
							//태그를 통한 본문과 타이틀 분류
								////////////////////
								if(sub[4].indexOf("남자")> -1 || sub[4].indexOf("남성")>-1||sub[4].indexOf("아저씨")>-1 || sub[4].indexOf("남정네")>-1||sub[4].indexOf("아재")>-1){
									mtt.setsex("남자");
								}else if(sub[4].indexOf("여자")>-1 ||sub[4].indexOf("여성")>-1||sub[4].indexOf("아가씨")>-1||sub[4].indexOf("여인네")>-1){
									mtt.setsex("여성");
								}else{
									mtt.setsex("null");
								}
								
								//여행기간 찾기
								if(sub[4].indexOf("당일")>-1||sub[4].indexOf("1일")>-1){
									mtt.setstaylong("당일");
								}else if(sub[4].indexOf("1박2일")>-1 || sub[4].indexOf("1박 2일")>-1){
									mtt.setstaylong("1박2일");
								}else if(sub[4].indexOf("2박3일")>-1 || sub[4].indexOf("2박 3일")>-1){
									mtt.setstaylong("2박3일");
								}else if(sub[4].indexOf("3박4일")>-1 || sub[4].indexOf("3박 4일")>-1){
									mtt.setstaylong("3박4일");
								}else if(sub[4].indexOf("4박5일")>-1 || sub[4].indexOf("4박 5일")>-1){
									mtt.setstaylong("4박5일");
								}else if(sub[4].indexOf("5박6일")>-1 || sub[4].indexOf("5박 6일")>-1){
									mtt.setstaylong("5박6일");
								}else if(sub[4].indexOf("6박7일")>-1 || sub[4].indexOf("6박 7일")>-1||sub[4].indexOf("일주일")>-1){
									mtt.setstaylong("일주일");
								}else{
									mtt.setstaylong("null");
								}
								
								//동반자 //인원
								if(sub[4].indexOf("혼자")>-1||sub[4].indexOf("혼여")>-1||sub[4].indexOf("혼남")>-1||sub[4].indexOf("나홀로")>-1){
									mtt.setwho_with("혼자");
									mtt.setperson("1인");
								}else if(sub[4].indexOf("연인")>-1||sub[4].indexOf("남자친구")>-1 || sub[4].indexOf("남친")>-1||sub[4].indexOf("여자인구")>-1||sub[4].indexOf("여친")>-1||sub[4].indexOf("애인")>-1||sub[4].indexOf("부부")>-1||sub[4].indexOf("남편")>-1||sub[4].indexOf("서방")>-1||sub[4].indexOf("부인")>-1||sub[4].indexOf("와이프")>-1||sub[4].indexOf("커플")>-1||sub[4].indexOf("결혼")>-1||sub[4].indexOf("둘이서")>-1){
									mtt.setwho_with("연인");
									mtt.setperson("2인");
								}else if(sub[4].indexOf("가족")>-1||sub[4].indexOf("부모님")>-1||sub[4].indexOf("아버지")>-1||sub[4].indexOf("아빠")>-1||sub[4].indexOf("엄마")>-1||sub[4].indexOf("어머니")>-1||sub[4].indexOf("아이들")>-1||sub[4].indexOf("아이")>-1||sub[4].indexOf("아들")>-1||sub[4].indexOf("딸")>-1||sub[4].indexOf("자식")>-1||sub[4].indexOf("아기")>-1){
									mtt.setwho_with("가족");
								}else if(sub[4].indexOf("친구")>-1||sub[4].indexOf("동창")>-1||sub[4].indexOf("단짝")>-1||sub[4].indexOf("칭구")>-1||sub[4].indexOf("베프")>-1||sub[4].indexOf("동성친구")>-1){
									mtt.setwho_with("친구");
								}else if(sub[4].indexOf("회사")>-1||sub[4].indexOf("야유회")>-1||sub[4].indexOf("워크샵")>-1){
									mtt.setwho_with("회사");
								}else{
									mtt.setwho_with("null");
								}
								
								
								
								//교통수단
								if(sub[4].indexOf("버스")>-1||sub[4].indexOf("빠스")>-1){
									mtt.settransport("버스");
								}else if(sub[4].indexOf("지하철")>-1||sub[4].indexOf("자철")>-1||sub[4].indexOf("전철")>-1||sub[4].indexOf("경춘선")>-1||sub[4].indexOf("호선")>-1){
									mtt.settransport("지하철");
								}else if(sub[4].indexOf("기차")>-1||sub[4].indexOf("ktx")>-1||sub[4].indexOf("무궁화호")>-1||sub[4].indexOf("itx")>-1||sub[4].indexOf("KTX")>-1||sub[4].indexOf("ITX")>-1||sub[4].indexOf("새마을")>-1||sub[4].indexOf("열차")>-1){
									mtt.settransport("기차");
								}else if(sub[4].indexOf("택시")>-1){
									mtt.settransport("택시");
								}else if(sub[4].indexOf("자가용")>-1||sub[4].indexOf("자동차")>-1||sub[4].indexOf("자차")>-1||sub[4].indexOf("차끌고")>-1||sub[4].indexOf("차 끌고")>-1||sub[4].indexOf("차 타고")>-1||sub[4].indexOf("차타고")>-1){
									mtt.settransport("자가용");
								}else if(sub[4].indexOf("바이크")>-1||sub[4].indexOf("자전거")>-1||sub[4].indexOf("오토바이")>-1||sub[4].indexOf("스쿠터")>-1){
									mtt.settransport("바이크");
								}else{
									mtt.settransport("null");
								}
								
								//동반
								if(sub[4].indexOf("혼자")>-1||sub[4].indexOf("혼여")>-1||sub[4].indexOf("혼남")>-1||sub[4].indexOf("나홀로")>-1){
									mtt.setperson("1인");
								}else if(sub[4].indexOf("연인")>-1||sub[4].indexOf("남자친구")>-1 || sub[4].indexOf("남친")>-1||sub[4].indexOf("여자인구")>-1||sub[4].indexOf("여친")>-1||sub[4].indexOf("애인")>-1||sub[4].indexOf("부부")>-1||sub[4].indexOf("남편")>-1||sub[4].indexOf("서방")>-1||sub[4].indexOf("부인")>-1||sub[4].indexOf("와이프")>-1||sub[4].indexOf("커플")>-1||sub[4].indexOf("결혼")>-1||sub[4].indexOf("둘이서")>-1){
									mtt.setperson("2인");
								}else if(sub[4].indexOf("3인")>-1||sub[4].indexOf("3명")>-1||sub[4].indexOf("세명")>-1||sub[4].indexOf("셋이서")>-1||sub[4].indexOf("세 명")>-1||sub[4].indexOf("4인")>-1||sub[4].indexOf("4명")>-1||sub[4].indexOf("네명")>-1||sub[4].indexOf("네 명")>-1||sub[4].indexOf("넷이서")>-1||sub[4].indexOf("네 명")>-1){
									mtt.setperson("3~4인");
								}else if(sub[4].indexOf("5인")>-1||sub[4].indexOf("5명")>-1||sub[4].indexOf("다섯명")>-1||sub[4].indexOf("6인")>-1||sub[4].indexOf("6명")>-1||sub[4].indexOf("6인")>-1||sub[4].indexOf("6명")>-1||sub[4].indexOf("여섯이서")>-1||sub[4].indexOf("단체")>-1||sub[4].indexOf("다섯 명")>-1||sub[4].indexOf("여섯 명")>-1){
									mtt.setperson("5인이상");
								}else{
									mtt.setperson("null");
								}
								
								if(sub[4].indexOf("10대")>-1||sub[4].indexOf("열살")>-1||sub[4].indexOf("열한살")>-1||sub[4].indexOf("열두살")>-1||sub[4].indexOf("열세살")>-1||sub[4].indexOf("열네살")>-1||sub[4].indexOf("열다섯살")>-1||sub[4].indexOf("열여섯살")>-1||sub[4].indexOf("열일곱살")>-1||sub[4].indexOf("열여덟살")>-1||sub[4].indexOf("열아홉살")>-1||sub[4].indexOf("10살")>-1||sub[4].indexOf("11살")>-1||sub[4].indexOf("12살")>-1||sub[4].indexOf("13살")>-1||sub[4].indexOf("14살")>-1||sub[4].indexOf("15살")>-1||sub[4].indexOf("16살")>-1||sub[4].indexOf("17살")>-1||sub[4].indexOf("18살")>-1||sub[4].indexOf("19살")>-1||sub[4].indexOf("열 살")>-1||sub[4].indexOf("열한 살")>-1||sub[4].indexOf("열두 살")>-1||sub[4].indexOf("열세 살")>-1||sub[4].indexOf("열네 살")>-1||sub[4].indexOf("열다섯 살")>-1||sub[4].indexOf("열여섯 살")>-1||sub[4].indexOf("열일곱 살")>-1||sub[4].indexOf("열여덟 살")>-1||sub[4].indexOf("열아홉 살")>-1){
									mtt.setages("10대");
								}else if(sub[4].indexOf("20대")>-1||sub[4].indexOf("스무살")>-1||sub[4].indexOf("스물한살")>-1||sub[4].indexOf("스물두살")>-1||sub[4].indexOf("스물세살")>-1||sub[4].indexOf("스물네살")>-1||sub[4].indexOf("스물다섯살")>-1||sub[4].indexOf("스물여섯살")>-1||sub[4].indexOf("스물일곱살")>-1||sub[4].indexOf("스물여덟살")>-1||sub[4].indexOf("스물아홉살")>-1||sub[4].indexOf("20살")>-1||sub[4].indexOf("21살")>-1||sub[4].indexOf("22살")>-1||sub[4].indexOf("23살")>-1||sub[4].indexOf("24살")>-1||sub[4].indexOf("25살")>-1||sub[4].indexOf("26살")>-1||sub[4].indexOf("27살")>-1||sub[4].indexOf("28살")>-1||sub[4].indexOf("29살")>-1||sub[4].indexOf("스물살")>-1||sub[4].indexOf("스물한 살")>-1||sub[4].indexOf("스물두 살")>-1||sub[4].indexOf("스물세 살")>-1||sub[4].indexOf("스물네 살")>-1||sub[4].indexOf("스물다섯 살")>-1||sub[4].indexOf("스물여섯 살")>-1||sub[4].indexOf("스물일곱 살")>-1||sub[4].indexOf("스물여덟 살")>-1||sub[4].indexOf("스물아홉 살")>-1){
									mtt.setages("20대");
								}else if(sub[4].indexOf("30대")>-1||sub[4].indexOf("서른살")>-1||sub[4].indexOf("서른한살")>-1||sub[4].indexOf("서른두살")>-1||sub[4].indexOf("서른세살")>-1||sub[4].indexOf("서른네살")>-1||sub[4].indexOf("서른다섯살")>-1||sub[4].indexOf("서른여섯살")>-1||sub[4].indexOf("서른일곱살")>-1||sub[4].indexOf("서른여덟살")>-1||sub[4].indexOf("서른아홉살")>-1||sub[4].indexOf("20살")>-1||sub[4].indexOf("21살")>-1||sub[4].indexOf("22살")>-1||sub[4].indexOf("23살")>-1||sub[4].indexOf("24살")>-1||sub[4].indexOf("25살")>-1||sub[4].indexOf("26살")>-1||sub[4].indexOf("27살")>-1||sub[4].indexOf("28살")>-1||sub[4].indexOf("29살")>-1||sub[4].indexOf("서른살")>-1||sub[4].indexOf("서른한 살")>-1||sub[4].indexOf("서른두 살")>-1||sub[4].indexOf("서른세 살")>-1||sub[4].indexOf("서른네 살")>-1||sub[4].indexOf("서른다섯 살")>-1||sub[4].indexOf("서른여섯 살")>-1||sub[4].indexOf("서른일곱 살")>-1||sub[4].indexOf("서른여덟 살")>-1||sub[4].indexOf("서른아홉 살")>-1){
									mtt.setages("30대");
								}else if(sub[4].indexOf("40대")>-1||sub[4].indexOf("스무살")>-1||sub[4].indexOf("마흔한살")>-1||sub[4].indexOf("마흔두살")>-1||sub[4].indexOf("마흔세살")>-1||sub[4].indexOf("마흔네살")>-1||sub[4].indexOf("마흔다섯살")>-1||sub[4].indexOf("마흔여섯살")>-1||sub[4].indexOf("마흔일곱살")>-1||sub[4].indexOf("마흔여덟살")>-1||sub[4].indexOf("마흔아홉살")>-1||sub[4].indexOf("20살")>-1||sub[4].indexOf("21살")>-1||sub[4].indexOf("22살")>-1||sub[4].indexOf("23살")>-1||sub[4].indexOf("24살")>-1||sub[4].indexOf("25살")>-1||sub[4].indexOf("26살")>-1||sub[4].indexOf("27살")>-1||sub[4].indexOf("28살")>-1||sub[4].indexOf("29살")>-1||sub[4].indexOf("마흔살")>-1||sub[4].indexOf("마흔한 살")>-1||sub[4].indexOf("마흔두 살")>-1||sub[4].indexOf("마흔세 살")>-1||sub[4].indexOf("마흔네 살")>-1||sub[4].indexOf("마흔다섯 살")>-1||sub[4].indexOf("마흔여섯 살")>-1||sub[4].indexOf("마흔일곱 살")>-1||sub[4].indexOf("마흔여덟 살")>-1||sub[4].indexOf("마흔아홉 살")>-1){
									mtt.setages("40대");
								}else if(sub[4].indexOf("50대")>-1||sub[4].indexOf("스무살")>-1||sub[4].indexOf("쉰한살")>-1||sub[4].indexOf("쉰두살")>-1||sub[4].indexOf("쉰세살")>-1||sub[4].indexOf("쉰네살")>-1||sub[4].indexOf("쉰다섯살")>-1||sub[4].indexOf("쉰여섯살")>-1||sub[4].indexOf("쉰일곱살")>-1||sub[4].indexOf("쉰여덟살")>-1||sub[4].indexOf("쉰아홉살")>-1||sub[4].indexOf("20살")>-1||sub[4].indexOf("21살")>-1||sub[4].indexOf("22살")>-1||sub[4].indexOf("23살")>-1||sub[4].indexOf("24살")>-1||sub[4].indexOf("25살")>-1||sub[4].indexOf("26살")>-1||sub[4].indexOf("27살")>-1||sub[4].indexOf("28살")>-1||sub[4].indexOf("29살")>-1||sub[4].indexOf("쉰살")>-1||sub[4].indexOf("쉰한 살")>-1||sub[4].indexOf("쉰두 살")>-1||sub[4].indexOf("쉰세 살")>-1||sub[4].indexOf("쉰네 살")>-1||sub[4].indexOf("쉰다섯 살")>-1||sub[4].indexOf("쉰여섯 살")>-1||sub[4].indexOf("쉰일곱 살")>-1||sub[4].indexOf("쉰여덟 살")>-1||sub[4].indexOf("쉰아홉 살")>-1){
									mtt.setages("50대이상");
								}else{
									mtt.setages("null");
								}
											int index=0;
											if((index = sub[4].indexOf("돔형"))>-1||(index = sub[4].indexOf("돔 텐트"))>-1||(index = sub[4].indexOf("돔텐트"))>-1||(index = sub[4].indexOf("쉐이드돔"))>-1||(index = sub[4].indexOf("쉐이드 돔"))>-1){
												mtt.setsleep("돔형");
											}else if((index = sub[4].indexOf("리빙쉘"))>-1){
												mtt.setsleep("리빙쉘");
											}else if((index = sub[4].indexOf("팝업"))>-1){
												mtt.setsleep("팝업");
											}else if((index = sub[4].indexOf("알파인"))>-1){
												mtt.setsleep("알파인");
											}else if((index = sub[4].indexOf("티피"))>-1){
												mtt.setsleep("티피");
											}else if((index = sub[4].indexOf("카텐트"))>-1){
												mtt.setsleep("카텐트");
											}else if((index = sub[4].indexOf("거실텐트"))>-1){
												mtt.setsleep("거실텐트");
											}else if((index = sub[4].indexOf("이너테트"))>-1){
												mtt.setsleep("이너텐트");
											}else if((index = sub[4].indexOf("쉘터"))>-1){
												mtt.setsleep("쉘터");
											}else if((index = sub[4].indexOf("루프탑"))>-1){
												mtt.setsleep("루프탑");
											}else if((index = sub[4].indexOf("루프"))>-1){
												mtt.setsleep("루프");
											}else if((index = sub[4].indexOf("거실형"))>-1){
												mtt.setsleep("거실형");
											}else{
												mtt.setsleep("null");
											}
											
											
											if((index = sub[4].indexOf("수세식"))>-1){
												mtt.settoilet("수세식");
											}else if((index = sub[4].indexOf("수세식"))>-1){
												mtt.settoilet("재래식");
											}else{
												mtt.settoilet("null");
											}
											
											if((index = sub[4].indexOf("깨끗"))>-1||(index = sub[4].indexOf("청결"))>-1||(index = sub[4].indexOf("깔끔"))>-1||
													(index = sub[4].indexOf("위생적"))>-1){
												mtt.setclean("위생긍정");
											}else if((index = sub[4].indexOf("더러움"))>-1||(index = sub[4].indexOf("더러웠"))>-1||(index = sub[4].indexOf("더럽다"))>-1||(index = sub[4].indexOf("지저분"))>-1||
													(index = sub[4].indexOf("불결"))>-1||(index = sub[4].indexOf("비위생적"))>-1){
												mtt.setclean("위생부정");
											}else{
												mtt.setclean("null");
											}
											
											if((index = sub[4].indexOf("즐거움"))>-1||(index = sub[4].indexOf("즐거운"))>-1||(index = sub[4].indexOf("즐거웠"))>-1||(index = sub[4].indexOf("즐겁"))>-1||
													(index = sub[4].indexOf("재밌"))>-1||(index = sub[4].indexOf("재미있"))>-1||(index = sub[4].indexOf("재미 있"))>-1||(index = sub[4].indexOf("좋았음"))>-1||
													(index = sub[4].indexOf("좋았"))>-1||(index = sub[4].indexOf("최고"))>-1||(index = sub[4].indexOf("좋다"))>-1||(index = sub[4].indexOf("즐기다"))>-1||
													(index = sub[4].indexOf("신나"))>-1||(index = sub[4].indexOf("신남"))>-1){
												mtt.setman("만족도긍정");
											}else if((index = sub[4].indexOf("재미없"))>-1||(index = sub[4].indexOf("재미 없"))>-1||(index = sub[4].indexOf("불편"))>-1||(index = sub[4].indexOf("지루"))>-1||
													(index = sub[4].indexOf("귀찮"))>-1||(index = sub[4].indexOf("춥다"))>-1||(index = sub[4].indexOf("고난"))>-1||(index = sub[4].indexOf("고생"))>-1||
													(index = sub[4].indexOf("힘들었"))>-1||(index = sub[4].indexOf("힘들"))>-1){
												mtt.setman("만족도부정");
											}else{
												mtt.setman("null");
											}
											
											if((index=sub[4].indexOf("맛집"))>-1||(index=sub[4].indexOf("음식점"))>-1||(index=sub[4].indexOf("식당"))>-1){
												mtt.setmat("맛집/음식점/식당");
											}else{
												mtt.setmat("null");
											}
											mtt.wordcount(mtt, sub[4]);
											
											
								
								////////////////////
								mtt.save_text();
								
								mtt.clear();
								
								
								System.out.println("Done!!");	
								
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
		txt_read a = new txt_read();
		a.sub("/home/hch/paxing_dir/cafe/");
	}
}
