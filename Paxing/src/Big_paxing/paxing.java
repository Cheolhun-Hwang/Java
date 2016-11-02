package Big_paxing;
/**
 * 파일명 : paxing.java
 * 작성일 : 2016. 8. 3.
 * 파일설명 :
 */

import java.io.*;

//////////////////////////저장 및 sql 삽입을 위한 클래스/////////////////
class Make_table{
	///////////////////////
	private String id;//작성자 아이디 : 스크롤링 타이틀부분
	private String sex;//작성자 성별 : 스크롤링 본문
	private String ages;//작성자 나이 : 스크롤링 본문
	private String when_write;//작성 날짜 : 스크롱링 타이틀부분
	//////////////////////
	private String tema1;//캠핑 테마 : 파일이름 34열
	private String tema2;
	private String tema3;
	private String who_with; //동반 : 스크롱링 본문 친구, 연인, 가족
	/////////////////////
	private String sleep;// : 스크롱링 본문
	private String transport;//교통 : 스크롱링 본문
	private String food;//음식 : 스크롱링 본문
	/////////////////////
	private String city;//시/구 : 파일이름12열
	private String sort; //크롱링 분류 네이버/페이스북 등 : 현재 네이버 디폴트
	private String person; //인원수 : 스크롤링
	private String stay_long; //여행기간;
	private String spot;
	///////////////////
	private String site;
	private String babeq;
	private String toilet;
	private String clean;
	private String man;

	
	Make_table(){
		this.id ="null"; 
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
		this.site="null";
		this.babeq="null";
		this.toilet="null";
		this.clean="null";
		this.man="null";
	};
	
	public void setid(String sid){
		this.id = sid;
	}
	public void getid(){
		System.out.println(this.id);
	}
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
	public void getcity(){
		System.out.println(this.city);
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

	public void setsite(String ssl){
		this.site = ssl;
	}
	public void setbabeq(String ssl){
		this.babeq = ssl;
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

	
	public void save_text(){
		String string1 = this.id+" "+this.sex+" "+this.ages+" "+this.when_write+" ";
		String string2 = this.tema1+" "+this.tema2+" "+this.tema3+" "+this.who_with+" ";
		String string3 = this.sleep+" "+this.transport+" " +this.food+" "+this.spot+" ";
		String string4 = this.city+" "+this.sort+" "+this.person+" "+this.stay_long;
		String string5 = this.site+" "+this.babeq+" "+this.toilet+" "+this.clean+" "+this.man+" ";
		
		String txt = string1+string2+string3+string4+string5+"\n";			//저장형식 지정
       String fileName = "/home/hch/paxing_dir/complete";	//텍스트 파일 저장할 위치
         
        
        try{
            BufferedWriter fw = new BufferedWriter(new FileWriter(fileName, true));// BufferedWriter 와 FileWriter를 조합하여 사용 (속도 향상)
            fw.write(txt);// 파일안에 문자열 쓰기
            fw.flush();  
            fw.close(); // 객체 닫기  
        }catch(Exception e){
            e.printStackTrace();
        }
	}
	public void clear(){
		//tema, city는 초기화를 하지 않는다.
		this.id ="null"; 
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
		this.site="null";
		this.babeq="null";
		this.toilet="null";
		this.clean="null";
		this.man="null";
	}
}




public class paxing {

	public void subDirList(String source) {
		// TODO Auto-generated method stub
		File dir=new File(source);
		File[] FileList=dir.listFiles();
		Make_table mtt = new Make_table();
		try{
			for(int i = 0; i<FileList.length;i++){
				File file = FileList[i];
				System.out.println(file);////////////
				if(file.isFile()){
					//파일이 있으면
					System.out.println("\t파일이름 = "+file.getName());
					//추가적인 내용!!
					if(file.getName().substring(0, 2).equals("01")){
						System.out.println("고양시");
						mtt.setcity("고양시");
					}else if(file.getName().substring(0,2).equals("02")){
						System.out.println("과천시");
						mtt.setcity("과천시");
					}else if(file.getName().substring(0,2).equals("03")){
						System.out.println("광명시");
						mtt.setcity("광명시");
					}else if(file.getName().substring(0,2).equals("04")){
						System.out.println("광주시");
						mtt.setcity("광주시");
					}else if(file.getName().substring(0,2).equals("05")){
						System.out.println("구리시");
						mtt.setcity("구리시");
					}else if(file.getName().substring(0,2).equals("06")){
						System.out.println("군포시");
						mtt.setcity("군포시");
					}else if(file.getName().substring(0,2).equals("07")){
						System.out.println("김포시");
						mtt.setcity("김포시");
					}else if(file.getName().substring(0,2).equals("08")){
						System.out.println("남양주시");
						mtt.setcity("남양주시");
					}else if(file.getName().substring(0,2).equals("09")){
						System.out.println("동두천시");
						mtt.setcity("동두천시");
					}else if(file.getName().substring(0,2).equals("10")){
						System.out.println("부천시");
						mtt.setcity("부천시");
					}else if(file.getName().substring(0,2).equals("11")){
						System.out.println("성남시");
						mtt.setcity("성남시");
					}else if(file.getName().substring(0,2).equals("12")){
						System.out.println("수원시");
						mtt.setcity("수원시");
					}else if(file.getName().substring(0,2).equals("13")){
						System.out.println("시흥시");
						mtt.setcity("시흥시");
					}else if(file.getName().substring(0,2).equals("14")){
						System.out.println("안산시");
						mtt.setcity("안산시");
					}else if(file.getName().substring(0,2).equals("15")){
						System.out.println("안성시");
						mtt.setcity("안성시");
					}else if(file.getName().substring(0,2).equals("16")){
						System.out.println("안양시");
						mtt.setcity("안양시");
					}else if(file.getName().substring(0,2).equals("17")){
						System.out.println("양주시");
						mtt.setcity("양주시");
					}else if(file.getName().substring(0,2).equals("18")){
						System.out.println("여주시");
						mtt.setcity("여주시");
					}else if(file.getName().substring(0,2).equals("19")){
						System.out.println("오산시");
						mtt.setcity("오산시");
					}else if(file.getName().substring(0,2).equals("20")){
						System.out.println("용인시");
						mtt.setcity("용인시");
					}else if(file.getName().substring(0,2).equals("21")){
						System.out.println("의왕시");
						mtt.setcity("의왕시");
					}else if(file.getName().substring(0,2).equals("22")){
						System.out.println("의정부시");
						mtt.setcity("의정부시");
					}else if(file.getName().substring(0,2).equals("23")){
						System.out.println("이천시");
						mtt.setcity("이천시");
					}else if(file.getName().substring(0,2).equals("24")){
						System.out.println("파주시");
						mtt.setcity("파주시");
					}else if(file.getName().substring(0,2).equals("25")){
						System.out.println("평택시");
						mtt.setcity("평택시");
					}else if(file.getName().substring(0,2).equals("26")){
						System.out.println("포천시");
						mtt.setcity("포천시");
					}else if(file.getName().substring(0,2).equals("27")){
						System.out.println("하남시");
						mtt.setcity("하남시");
					}else if(file.getName().substring(0,2).equals("28")){
						System.out.println("화성시");
						mtt.setcity("화성시");
					}else if(file.getName().substring(0,2).equals("29")){
						System.out.println("가평군");
						mtt.setcity("가평군");
					}else if(file.getName().substring(0,2).equals("30")){
						System.out.println("양평군");
						mtt.setcity("양평군");
					}else if(file.getName().substring(0,2).equals("31")){
						System.out.println("연천군");
						mtt.setcity("연천군");
					}
					
					try{
						FileInputStream fin = new FileInputStream(file);
						InputStreamReader inreader = new InputStreamReader(fin, "euc-kr");
						BufferedReader breader = new BufferedReader(inreader);
						
						String s;
						while((s = breader.readLine())!=null){
							if(s.indexOf("postViewArea")>-1){
								//성별찾기
								if(s.indexOf("남자")> -1 || s.indexOf("남성")>-1||s.indexOf("아저씨")>-1 || s.indexOf("남정네")>-1||s.indexOf("아재")>-1){
									mtt.setsex("남자");
								}else if(s.indexOf("여자")>-1 ||s.indexOf("여성")>-1||s.indexOf("아가씨")>-1||s.indexOf("여인네")>-1){
									mtt.setsex("여성");
								}else{
									mtt.setsex("null");
								}
								
								//여행기간 찾기
								if(s.indexOf("당일")>-1||s.indexOf("1일")>-1){
									mtt.setstaylong("당일");
								}else if(s.indexOf("1박2일")>-1 || s.indexOf("1박 2일")>-1){
									mtt.setstaylong("1박2일");
								}else if(s.indexOf("2박3일")>-1 || s.indexOf("2박 3일")>-1){
									mtt.setstaylong("2박3일");
								}else if(s.indexOf("3박4일")>-1 || s.indexOf("3박 4일")>-1){
									mtt.setstaylong("3박4일");
								}else if(s.indexOf("4박5일")>-1 || s.indexOf("4박 5일")>-1){
									mtt.setstaylong("4박5일");
								}else if(s.indexOf("5박6일")>-1 || s.indexOf("5박 6일")>-1){
									mtt.setstaylong("5박6일");
								}else if(s.indexOf("6박7일")>-1 || s.indexOf("6박 7일")>-1||s.indexOf("일주일")>-1){
									mtt.setstaylong("일주일");
								}else{
									mtt.setstaylong("null");
								}
								
								//동반자 //인원
								if(s.indexOf("혼자")>-1||s.indexOf("혼여")>-1||s.indexOf("혼남")>-1||s.indexOf("나홀로")>-1){
									mtt.setwho_with("혼자");
									mtt.setperson("1인");
								}else if(s.indexOf("연인")>-1||s.indexOf("남자친구")>-1 || s.indexOf("남친")>-1||s.indexOf("여자인구")>-1||s.indexOf("여친")>-1||s.indexOf("애인")>-1||s.indexOf("부부")>-1||s.indexOf("남편")>-1||s.indexOf("서방")>-1||s.indexOf("부인")>-1||s.indexOf("와이프")>-1||s.indexOf("커플")>-1||s.indexOf("결혼")>-1||s.indexOf("둘이서")>-1){
									mtt.setwho_with("연인");
									mtt.setperson("2인");
								}else if(s.indexOf("가족")>-1||s.indexOf("부모님")>-1||s.indexOf("아버지")>-1||s.indexOf("아빠")>-1||s.indexOf("엄마")>-1||s.indexOf("어머니")>-1||s.indexOf("아이들")>-1||s.indexOf("아이")>-1||s.indexOf("아들")>-1||s.indexOf("딸")>-1||s.indexOf("자식")>-1||s.indexOf("아기")>-1){
									mtt.setwho_with("가족");
								}else if(s.indexOf("친구")>-1||s.indexOf("동창")>-1||s.indexOf("단짝")>-1||s.indexOf("칭구")>-1||s.indexOf("베프")>-1||s.indexOf("동성친구")>-1){
									mtt.setwho_with("친구");
								}else if(s.indexOf("회사")>-1||s.indexOf("야유회")>-1||s.indexOf("워크샵")>-1){
									mtt.setwho_with("회사");
								}else{
									mtt.setwho_with("null");
								}
								
								
								
								//교통수단
								if(s.indexOf("버스")>-1||s.indexOf("빠스")>-1){
									mtt.settransport("버스");
								}else if(s.indexOf("지하철")>-1||s.indexOf("자철")>-1||s.indexOf("전철")>-1||s.indexOf("경춘선")>-1||s.indexOf("호선")>-1){
									mtt.settransport("지하철");
								}else if(s.indexOf("기차")>-1||s.indexOf("ktx")>-1||s.indexOf("무궁화호")>-1||s.indexOf("itx")>-1||s.indexOf("KTX")>-1||s.indexOf("ITX")>-1||s.indexOf("새마을")>-1||s.indexOf("열차")>-1){
									mtt.settransport("기차");
								}else if(s.indexOf("택시")>-1){
									mtt.settransport("택시");
								}else if(s.indexOf("자가용")>-1||s.indexOf("자동차")>-1||s.indexOf("자차")>-1||s.indexOf("차끌고")>-1||s.indexOf("차 끌고")>-1||s.indexOf("차 타고")>-1||s.indexOf("차타고")>-1){
									mtt.settransport("자가용");
								}else if(s.indexOf("바이크")>-1||s.indexOf("자전거")>-1||s.indexOf("오토바이")>-1||s.indexOf("스쿠터")>-1){
									mtt.settransport("바이크");
								}else{
									mtt.settransport("null");
								}
								
								//동반
								if(s.indexOf("혼자")>-1||s.indexOf("혼여")>-1||s.indexOf("혼남")>-1||s.indexOf("나홀로")>-1){
									mtt.setperson("1인");
								}else if(s.indexOf("연인")>-1||s.indexOf("남자친구")>-1 || s.indexOf("남친")>-1||s.indexOf("여자인구")>-1||s.indexOf("여친")>-1||s.indexOf("애인")>-1||s.indexOf("부부")>-1||s.indexOf("남편")>-1||s.indexOf("서방")>-1||s.indexOf("부인")>-1||s.indexOf("와이프")>-1||s.indexOf("커플")>-1||s.indexOf("결혼")>-1||s.indexOf("둘이서")>-1){
									mtt.setperson("2인");
								}else if(s.indexOf("3인")>-1||s.indexOf("3명")>-1||s.indexOf("세명")>-1||s.indexOf("셋이서")>-1||s.indexOf("세 명")>-1||s.indexOf("4인")>-1||s.indexOf("4명")>-1||s.indexOf("네명")>-1||s.indexOf("네 명")>-1||s.indexOf("넷이서")>-1||s.indexOf("네 명")>-1){
									mtt.setperson("3~4인");
								}else if(s.indexOf("5인")>-1||s.indexOf("5명")>-1||s.indexOf("다섯명")>-1||s.indexOf("6인")>-1||s.indexOf("6명")>-1||s.indexOf("6인")>-1||s.indexOf("6명")>-1||s.indexOf("여섯이서")>-1||s.indexOf("단체")>-1||s.indexOf("다섯 명")>-1||s.indexOf("여섯 명")>-1){
									mtt.setperson("5인이상");
								}else{
									mtt.setperson("null");
								}
								
								if(s.indexOf("10대")>-1||s.indexOf("열살")>-1||s.indexOf("열한살")>-1||s.indexOf("열두살")>-1||s.indexOf("열세살")>-1||s.indexOf("열네살")>-1||s.indexOf("열다섯살")>-1||s.indexOf("열여섯살")>-1||s.indexOf("열일곱살")>-1||s.indexOf("열여덟살")>-1||s.indexOf("열아홉살")>-1||s.indexOf("10살")>-1||s.indexOf("11살")>-1||s.indexOf("12살")>-1||s.indexOf("13살")>-1||s.indexOf("14살")>-1||s.indexOf("15살")>-1||s.indexOf("16살")>-1||s.indexOf("17살")>-1||s.indexOf("18살")>-1||s.indexOf("19살")>-1||s.indexOf("열 살")>-1||s.indexOf("열한 살")>-1||s.indexOf("열두 살")>-1||s.indexOf("열세 살")>-1||s.indexOf("열네 살")>-1||s.indexOf("열다섯 살")>-1||s.indexOf("열여섯 살")>-1||s.indexOf("열일곱 살")>-1||s.indexOf("열여덟 살")>-1||s.indexOf("열아홉 살")>-1){
									mtt.setages("10대");
								}else if(s.indexOf("20대")>-1||s.indexOf("스무살")>-1||s.indexOf("스물한살")>-1||s.indexOf("스물두살")>-1||s.indexOf("스물세살")>-1||s.indexOf("스물네살")>-1||s.indexOf("스물다섯살")>-1||s.indexOf("스물여섯살")>-1||s.indexOf("스물일곱살")>-1||s.indexOf("스물여덟살")>-1||s.indexOf("스물아홉살")>-1||s.indexOf("20살")>-1||s.indexOf("21살")>-1||s.indexOf("22살")>-1||s.indexOf("23살")>-1||s.indexOf("24살")>-1||s.indexOf("25살")>-1||s.indexOf("26살")>-1||s.indexOf("27살")>-1||s.indexOf("28살")>-1||s.indexOf("29살")>-1||s.indexOf("스물살")>-1||s.indexOf("스물한 살")>-1||s.indexOf("스물두 살")>-1||s.indexOf("스물세 살")>-1||s.indexOf("스물네 살")>-1||s.indexOf("스물다섯 살")>-1||s.indexOf("스물여섯 살")>-1||s.indexOf("스물일곱 살")>-1||s.indexOf("스물여덟 살")>-1||s.indexOf("스물아홉 살")>-1){
									mtt.setages("20대");
								}else if(s.indexOf("30대")>-1||s.indexOf("서른살")>-1||s.indexOf("서른한살")>-1||s.indexOf("서른두살")>-1||s.indexOf("서른세살")>-1||s.indexOf("서른네살")>-1||s.indexOf("서른다섯살")>-1||s.indexOf("서른여섯살")>-1||s.indexOf("서른일곱살")>-1||s.indexOf("서른여덟살")>-1||s.indexOf("서른아홉살")>-1||s.indexOf("20살")>-1||s.indexOf("21살")>-1||s.indexOf("22살")>-1||s.indexOf("23살")>-1||s.indexOf("24살")>-1||s.indexOf("25살")>-1||s.indexOf("26살")>-1||s.indexOf("27살")>-1||s.indexOf("28살")>-1||s.indexOf("29살")>-1||s.indexOf("서른살")>-1||s.indexOf("서른한 살")>-1||s.indexOf("서른두 살")>-1||s.indexOf("서른세 살")>-1||s.indexOf("서른네 살")>-1||s.indexOf("서른다섯 살")>-1||s.indexOf("서른여섯 살")>-1||s.indexOf("서른일곱 살")>-1||s.indexOf("서른여덟 살")>-1||s.indexOf("서른아홉 살")>-1){
									mtt.setages("30대");
								}else if(s.indexOf("40대")>-1||s.indexOf("스무살")>-1||s.indexOf("마흔한살")>-1||s.indexOf("마흔두살")>-1||s.indexOf("마흔세살")>-1||s.indexOf("마흔네살")>-1||s.indexOf("마흔다섯살")>-1||s.indexOf("마흔여섯살")>-1||s.indexOf("마흔일곱살")>-1||s.indexOf("마흔여덟살")>-1||s.indexOf("마흔아홉살")>-1||s.indexOf("20살")>-1||s.indexOf("21살")>-1||s.indexOf("22살")>-1||s.indexOf("23살")>-1||s.indexOf("24살")>-1||s.indexOf("25살")>-1||s.indexOf("26살")>-1||s.indexOf("27살")>-1||s.indexOf("28살")>-1||s.indexOf("29살")>-1||s.indexOf("마흔살")>-1||s.indexOf("마흔한 살")>-1||s.indexOf("마흔두 살")>-1||s.indexOf("마흔세 살")>-1||s.indexOf("마흔네 살")>-1||s.indexOf("마흔다섯 살")>-1||s.indexOf("마흔여섯 살")>-1||s.indexOf("마흔일곱 살")>-1||s.indexOf("마흔여덟 살")>-1||s.indexOf("마흔아홉 살")>-1){
									mtt.setages("40대");
								}else if(s.indexOf("50대")>-1||s.indexOf("스무살")>-1||s.indexOf("쉰한살")>-1||s.indexOf("쉰두살")>-1||s.indexOf("쉰세살")>-1||s.indexOf("쉰네살")>-1||s.indexOf("쉰다섯살")>-1||s.indexOf("쉰여섯살")>-1||s.indexOf("쉰일곱살")>-1||s.indexOf("쉰여덟살")>-1||s.indexOf("쉰아홉살")>-1||s.indexOf("20살")>-1||s.indexOf("21살")>-1||s.indexOf("22살")>-1||s.indexOf("23살")>-1||s.indexOf("24살")>-1||s.indexOf("25살")>-1||s.indexOf("26살")>-1||s.indexOf("27살")>-1||s.indexOf("28살")>-1||s.indexOf("29살")>-1||s.indexOf("쉰살")>-1||s.indexOf("쉰한 살")>-1||s.indexOf("쉰두 살")>-1||s.indexOf("쉰세 살")>-1||s.indexOf("쉰네 살")>-1||s.indexOf("쉰다섯 살")>-1||s.indexOf("쉰여섯 살")>-1||s.indexOf("쉰일곱 살")>-1||s.indexOf("쉰여덟 살")>-1||s.indexOf("쉰아홉 살")>-1){
									mtt.setages("50대 이상");
								}else{
									mtt.setages("null");
								}
								
								int index;
								if((index = s.indexOf("백숙"))>-1||(index =s.indexOf("찌개"))>-1||(index =s.indexOf("찌게"))>-1||(index =s.indexOf("생선구이"))>-1||
										(index =s.indexOf("갈치 구이"))>-1||	(index =s.indexOf("조림"))>-1||(index =s.indexOf("게장"))>-1||(index =s.indexOf("편육"))>-1||
										(index =s.indexOf("국수"))>-1||(index =s.indexOf("게장"))>-1||(index =s.indexOf("곰탕"))>-1||(index =s.indexOf("무국"))>-1||
										(index =s.indexOf("국수"))>-1||(index =s.indexOf("국밥"))>-1||(index =s.indexOf("곱창"))>-1||(index =s.indexOf("떡국"))>-1||
										(index =s.indexOf("덮밥"))>-1||(index =s.indexOf("김치"))>-1||(index =s.indexOf("굴비"))>-1||(index =s.indexOf("젓갈"))>-1||
										(index =s.indexOf("식혜"))>-1||(index =s.indexOf("식해"))>-1||(index =s.indexOf("절편"))>-1||(index =s.indexOf("족발"))>-1||
										(index =s.indexOf("쫄명"))>-1||(index =s.indexOf("잡채"))>-1||(index =s.indexOf("무침"))>-1||(index =s.indexOf("숭늉"))>-1||
										(index =s.indexOf("찜닭"))>-1||(index =s.indexOf("파전"))>-1) {
									mtt.setfood("한식");

								}else if((index =s.indexOf("고등어 구이"))>-1||(index =s.indexOf("고등어구이"))>-1||(index =s.indexOf("감자탕"))>-1||(index =s.indexOf("감자전"))>-1
										||(index =s.indexOf("갈비탕"))>-1||(index =s.indexOf("갈비찜"))>-1||(index =s.indexOf("해물찜"))>-1||(index =s.indexOf("호박죽"))>-1
										||(index =s.indexOf("계란찜"))>-1||(index =s.indexOf("추어창"))>-1||(index =s.indexOf("호박전"))>-1||(index =s.indexOf("청국장"))>-1
										||(index =s.indexOf("감자전"))>-1||(index =s.indexOf("짱아치"))>-1||(index =s.indexOf("인절미"))>-1||(index =s.indexOf("전복죽"))>-1
										||(index =s.indexOf("육개장"))>-1||(index =s.indexOf("닭갈비"))>-1||(index =s.indexOf("장조림"))>-1||(index =s.indexOf("새우장"))>-1
										||(index =s.indexOf("삼계탕"))>-1||(index =s.indexOf("아구찜"))>-1||(index =s.indexOf("아귀찜"))>-1||(index =s.indexOf("빈대떡"))>-1
										||(index =s.indexOf("설렁탕"))>-1||(index =s.indexOf("순두부"))>-1||(index =s.indexOf("낙지젓"))>-1||(index =s.indexOf("창란젓"))>-1
										||(index =s.indexOf("수제비"))>-1||(index =s.indexOf("수제비"))>-1||(index =s.indexOf("미역국"))>-1||(index =s.indexOf("매운탕"))>-1
										||(index =s.indexOf("메밀묵"))>-1||(index =s.indexOf("순댓국"))>-1||(index =s.indexOf("비빔밥"))>-1||(index =s.indexOf("순대국"))>-1
										||(index =s.indexOf("보신탕"))>-1||(index =s.indexOf("명란젓"))>-1||(index =s.indexOf("닭갈비"))>-1||(index =s.indexOf("빈대떡"))>-1
										||(index =s.indexOf("볶음밥"))>-1||(index =s.indexOf("보리밥"))>-1||(index =s.indexOf("현미밥"))>-1||(index =s.indexOf("과메기"))>-1
										||(index =s.indexOf("겉절이"))>-1){
											mtt.setfood("한식");
																		
								}else if((index =s.indexOf("한국 음식"))>-1||(index =s.indexOf("한국요리"))>-1||(index =s.indexOf("도토리묵"))>-1||(index =s.indexOf("어리굴젓"))>-1
										||(index =s.indexOf("떡만두국"))>-1||(index =s.indexOf("시래기국"))>-1||(index =s.indexOf("생선 구이"))>-1||(index =s.indexOf("가락국수"))>-1
										||(index =s.indexOf("떡만둣국"))>-1||(index =s.indexOf("곤드레밥"))>-1||(index =s.indexOf("소고기국"))>-1||(index =s.indexOf("두루치기"))>-1
										||(index =s.indexOf("오징어젓"))>-1){
									mtt.setfood("한식");
									
								}else if((index =s.indexOf("떡"))>-1){
									mtt.setfood("한식");
									
								}
								else if((index =s.indexOf("꽃빵"))>-1||(index =s.indexOf("중식"))>-1||(index =s.indexOf("중국"))>-1||(index =s.indexOf("짜장"))>-1||
										(index =s.indexOf("짬뽕"))>-1||(index =s.indexOf("짱깨"))>-1||(index =s.indexOf("춘장"))>-1||(index =s.indexOf("딤섬"))>-1) {
									mtt.setfood("중식");
									
								}else if((index =s.indexOf("라조기"))>-1||(index =s.indexOf("취두부"))>-1||(index =s.indexOf("딴딴면"))>-1||(index =s.indexOf("탕수육"))>-1||
										(index =s.indexOf("양꼬치"))>-1||(index =s.indexOf("유린기"))>-1||(index =s.indexOf("자장명"))>-1||(index =s.indexOf("불도장"))>-1||
										(index =s.indexOf("이금기"))>-1||(index =s.indexOf("짜장면"))>-1||(index =s.indexOf("동파육"))>-1||(index =s.indexOf("깐풍기"))>-1||
										(index =s.indexOf("군만두"))>-1||(index =s.indexOf("양장피"))>-1){
									mtt.setfood("중식");
									
								}else if((index =s.indexOf("난자완스"))>-1||(index =s.indexOf("북경오리"))>-1||(index =s.indexOf("마파두부"))>-1||(index =s.indexOf("꿔바로우"))>-1||
										(index =s.indexOf("북경 오리"))>-1||(index =s.indexOf("고추잡채"))>-1||(index =s.indexOf("깐쇼새우"))>-1||(index =s.indexOf("중국음식"))>-1){
									mtt.setfood("중식");
									
								}
								else if((index =s.indexOf("양식"))>-1||(index =s.indexOf("펜네"))>-1||(index =s.indexOf("파스타"))>-1||(index =s.indexOf("피자"))>-1||
										(index =s.indexOf("나초"))>-1||(index =s.indexOf("스프"))>-1||(index =s.indexOf("라자냐"))>-1||(index =s.indexOf("케밥"))>-1||
										(index =s.indexOf("나쵸"))>-1||(index =s.indexOf("수푸"))>-1||(index =s.indexOf("타코"))>-1||(index =s.indexOf("팬네"))>-1	){
										mtt.setfood("양식");
										
								}else if((index =s.indexOf("멕시코요리"))>-1||(index =s.indexOf("프랑스 요리"))>-1||(index =s.indexOf("이태리요리"))>-1||(index =s.indexOf("프랑스요리"))>-1||
										(index =s.indexOf("이태리 요리"))>-1||(index =s.indexOf("리조또"))>-1||(index =s.indexOf("미트볼"))>-1||(index =s.indexOf("샐러드"))>-1||
										(index =s.indexOf("부리또"))>-1||(index =s.indexOf("소시지"))>-1||(index =s.indexOf("알리오 올리오"))>-1||(index =s.indexOf("알리오올리오"))>-1||
										(index =s.indexOf("파르페"))>-1||(index =s.indexOf("치폴레"))>-1||(index =s.indexOf("셀러드"))>-1||(index =s.indexOf("수플리"))>-1||
										(index =s.indexOf("케이준"))>-1||(index =s.indexOf("소세지"))>-1||(index =s.indexOf("멕시코 요리"))>-1){
									mtt.setfood("양식");
									
								}else if((index =s.indexOf("이탈리아 요리"))>-1||(index =s.indexOf("이탈리아요리"))>-1||(index =s.indexOf("이탈리아 요리"))>-1||(index =s.indexOf("치아바타"))>-1||
										(index =s.indexOf("마카로니"))>-1||(index =s.indexOf("라비올리"))>-1||(index =s.indexOf("카프레제"))>-1||(index =s.indexOf("스파게티"))>-1){
									mtt.setfood("양식");
									
								}else if((index =s.indexOf("까르보나라"))>-1||(index =s.indexOf("까르보나라"))>-1){
									mtt.setfood("양식");
									
								}
								else if((index =s.indexOf("일식"))>-1||(index =s.indexOf("라멘"))>-1||(index =s.indexOf("초밥"))>-1||(index =s.indexOf("우동"))>-1||
										(index =s.indexOf("낫토"))>-1||(index =s.indexOf("모밀"))>-1||(index =s.indexOf("메밀"))>-1||
										(index =s.indexOf("오뎅"))>-1||(index =s.indexOf("규동"))>-1){
									mtt.setfood("일식");
									
									}
								else if((index =s.indexOf("고로케"))>-1||(index =s.indexOf("가츠동"))>-1||(index =s.indexOf("사시미"))>-1||(index =s.indexOf("돈부리"))>-1||
										(index =s.indexOf("덴뿌라"))>-1){
									mtt.setfood("일식");
									
								}else if((index =s.indexOf("고추냉이"))>-1||(index =s.indexOf("타코야끼"))>-1||(index =s.indexOf("야키소바"))>-1||(index =s.indexOf("타코야기"))>-1||
										(index =s.indexOf("스키야키"))>-1||(index =s.indexOf("오차즈케"))>-1||(index =s.indexOf("타코야키"))>-1||(index =s.indexOf("부타나베"))>-1||
										(index =s.indexOf("나가사키"))>-1||(index =s.indexOf("우메보시"))>-1||(index =s.indexOf("후리가케"))>-1){
									mtt.setfood("일식");
								
								}else if((index =s.indexOf("하이라이스"))>-1||(index =s.indexOf("가쓰오부시"))>-1||(index =s.indexOf("오므라이스"))>-1){
									mtt.setfood("일식");
									
								}
								else if((index =s.indexOf("오코노미야키"))>-1||(index =s.indexOf("오코노미야끼"))>-1){
									mtt.setfood("일식");
									
								}
								else if((index =s.indexOf("뷔페"))>-1||(index =s.indexOf("부페"))>-1){
									mtt.setfood("뷔페");
									
								}
								else if((index =s.indexOf("치킨"))>-1||(index =s.indexOf("쉑쉑"))>-1||(index =s.indexOf("피자"))>-1){
									mtt.setfood("패스트푸드");
									
								}else if((index =s.indexOf("페스트푸드"))>-1||(index =s.indexOf("패스트푸드"))>-1||(index =s.indexOf("페스트 푸드"))>-1||(index =s.indexOf("패스트 푸드"))>-1){
									mtt.setfood("패스트푸드");
								
								}else if((index =s.indexOf("햄버거"))>-1||(index =s.indexOf("닭강정"))>-1){
									mtt.setfood("패스트푸드");
									
								}
								else if((index =s.indexOf("분식"))>-1||(index =s.indexOf("김밥"))>-1||(index =s.indexOf("순대"))>-1||
										(index =s.indexOf("튀김"))>-1||(index =s.indexOf("만두"))>-1||(index =s.indexOf("라면"))>-1){
									mtt.setfood("분식");
									
								}else if((index =s.indexOf("떡볶이"))>-1||(index =s.indexOf("떡튀순"))>-1){
									mtt.setfood("분식");
									
								}
								else if((index =s.indexOf("주점"))>-1||(index =s.indexOf("소주"))>-1||(index =s.indexOf("양주"))>-1||(index =s.indexOf("꼬냑"))>-1||
										(index =s.indexOf("술집"))>-1||(index =s.indexOf("맥주"))>-1||(index =s.indexOf("탁주"))>-1||
										(index =s.indexOf("청주"))>-1||(index =s.indexOf("와인"))>-1||(index =s.indexOf("약주"))>-1){
									mtt.setfood("주류");
									
								}else if((index =s.indexOf("막걸리"))>-1||(index =s.indexOf("막거리"))>-1||(index =s.indexOf("브랜디"))>-1||(index =s.indexOf("고량주"))>-1||
										(index =s.indexOf("위스키"))>-1||(index =s.indexOf("데낄라"))>-1||(index =s.indexOf("포도주"))>-1||(index =s.indexOf("보드카"))>-1||
										(index =s.indexOf("데킬라"))>-1||(index =s.indexOf("바카디"))>-1||(index =s.indexOf("담금주"))>-1||(index =s.indexOf("전통주"))>-1||
										(index =s.indexOf("칵테일"))>-1||(index =s.indexOf("중국술"))>-1||(index =s.indexOf("샴페인"))>-1){
									mtt.setfood("주류");
									
								}else if((index =s.indexOf("이과두주"))>-1){
									mtt.setfood("주류");
									
								}
								else if((index =s.indexOf("카페"))>-1||(index =s.indexOf("커피"))>-1||(index =s.indexOf("와플"))>-1||(index =s.indexOf("라떼"))>-1||
										(index =s.indexOf("전병"))>-1||(index =s.indexOf("도넛"))>-1||(index =s.indexOf("케잌"))>-1||(index =s.indexOf("케익"))>-1||
										(index =s.indexOf("월병"))>-1||(index =s.indexOf("쿠키"))>-1||(index =s.indexOf("파이"))>-1){
									mtt.setfood("디저트");
									
								}else if((index =s.indexOf("마카롱"))>-1||(index =s.indexOf("타르트"))>-1||(index =s.indexOf("프레첼"))>-1||(index =s.indexOf("프레즐"))>-1||
										(index =s.indexOf("도너츠"))>-1||(index =s.indexOf("단팥빵"))>-1||(index =s.indexOf("오믈렛"))>-1||(index =s.indexOf("카나페"))>-1||
										(index =s.indexOf("또띠야"))>-1||(index =s.indexOf("베이글"))>-1||(index =s.indexOf("바게트"))>-1||(index =s.indexOf("소보로"))>-1||
										(index =s.indexOf("마들렌"))>-1||(index =s.indexOf("비엔나"))>-1||(index =s.indexOf("또띠아"))>-1){
									mtt.setfood("디저트");
									
								}else if((index =s.indexOf("베이커리"))>-1||(index =s.indexOf("마끼아또"))>-1||(index =s.indexOf("델리만주"))>-1||(index =s.indexOf("카스텔라"))>-1||
										(index =s.indexOf("카스테라"))>-1||(index =s.indexOf("델리만쥬"))>-1||(index =s.indexOf("호두과자"))>-1||(index =s.indexOf("토르티야"))>-1||
										(index =s.indexOf("샌드위치"))>-1||(index =s.indexOf("크루아상"))>-1){
									mtt.setfood("디저트");
									
								}else if((index =s.indexOf("아메리카노"))>-1||(index =s.indexOf("마스카포네"))>-1){
									mtt.setfood("디저트");
									
								}else if((index =s.indexOf("빵"))>-1){
									mtt.setfood("디저트");
									
								}
								else if((index =s.indexOf("태국음식"))>-1||(index =s.indexOf("태국 음식"))>-1||(index =s.indexOf("강황"))>-1||(index =s.indexOf("카레"))>-1||
										(index =s.indexOf("똥양"))>-1||(index =s.indexOf("똠얌"))>-1||(index =s.indexOf("인도요리"))>-1||(index =s.indexOf("태국 요리"))>-1||
										(index =s.indexOf("태국요리"))>-1||(index =s.indexOf("커리"))>-1||(index =s.indexOf("인도 요리"))>-1){
									mtt.setfood("아시안푸드");
								}else if((index =s.indexOf("아시안푸드"))>-1||(index =s.indexOf("베트남 음식"))>-1||(index =s.indexOf("얌운쎈"))>-1||(index =s.indexOf("팟타이"))>-1||
										(index =s.indexOf("탄두리"))>-1||(index =s.indexOf("쌀국수"))>-1||(index =s.indexOf("베트남요리"))>-1||(index =s.indexOf("월남쌈"))>-1||
										(index =s.indexOf("베트남음식"))>-1||(index =s.indexOf("팟씨유"))>-1||(index =s.indexOf("베트남 요리"))>-1){
									mtt.setfood("아시안푸드");
									
								}else if((index =s.indexOf("인도네시아 요리"))>-1||(index =s.indexOf("인도네시아요리"))>-1){
									mtt.setfood("아시안푸드");
									
								}else if((index =s.indexOf("나시고랭"))>-1){
									mtt.setfood("아시안푸드");
									
								}
								else if((index =s.indexOf("치마살"))>-1||(index =s.indexOf("안창살"))>-1||(index =s.indexOf("꼬들살"))>-1||(index =s.indexOf("살치살"))>-1||
										(index =s.indexOf("삼겹살"))>-1||(index =s.indexOf("꽃등심"))>-1||(index =s.indexOf("소고기"))>-1||(index =s.indexOf("채끝살"))>-1||
										(index =s.indexOf("토시살"))>-1||(index =s.indexOf("항정살"))>-1||(index =s.indexOf("부채살"))>-1||(index =s.indexOf("낙엽살"))>-1||
										(index =s.indexOf("치마살"))>-1){
									mtt.setfood("바베큐/고기");
									
								}else if((index =s.indexOf("등심"))>-1||(index =s.indexOf("안심"))>-1||(index =s.indexOf("목살"))>-1||(index =s.indexOf("갈비"))>-1||
										(index =s.indexOf("사태"))>-1||(index =s.indexOf("꽃살"))>-1||(index =s.indexOf("고기"))>-1){
									mtt.setfood("바베큐/고기");
									
								}else if((index =s.indexOf("차돌박이"))>-1||(index =s.indexOf("토시 살"))>-1||(index =s.indexOf("안창 살"))>-1||(index =s.indexOf("돼지고기"))>-1||
										(index =s.indexOf("뒷다리살"))>-1||(index =s.indexOf("제비추리"))>-1||(index =s.indexOf("차돌박이"))>-1||(index =s.indexOf("갈매기살"))>-1||
										(index =s.indexOf("앞다리살"))>-1||(index =s.indexOf("채끝 살"))>-1||(index =s.indexOf("부채 살"))>-1||(index =s.indexOf("치마 살"))>-1){
									mtt.setfood("바베큐/고기");
									
								}else if((index =s.indexOf("가브리 살"))>-1||(index =s.indexOf("앞다리 살"))>-1||(index =s.indexOf("뒷다리 살"))>-1||(index =s.indexOf("돼지 고기"))>-1||
										(index =s.indexOf("가브리 살"))>-1){
									mtt.setfood("바베큐/고기");
									
								}
								else {
									mtt.setfood("null");
									
								}
			/////////////////////두번째 파트는 어디인지 찾기!!
											if((index =s.indexOf("등산"))>-1||(index =s.indexOf("산행"))>-1||(index =s.indexOf("산악"))>-1){
												mtt.setspot("산");
											}
											else if((index =s.indexOf("온천"))>-1||(index =s.indexOf("스파"))>-1){
												mtt.setspot("온천");
											}
											else if((index =s.indexOf("해수욕장"))>-1||(index =s.indexOf("모래사장"))>-1){
												mtt.setspot("해수욕장");
												
											}else if((index =s.indexOf("백사장"))>-1||(index =s.indexOf("바다"))>-1){
												mtt.setspot("해수욕장");
												
											}
											else if((index =s.indexOf("수영장"))>-1||(index =s.indexOf("수영"))>-1){
												mtt.setspot("수영장");
												
											}
											else if((index =s.indexOf("계곡"))>-1){
												mtt.setspot("계곡");
												
											}else if((index =s.indexOf("물놀이"))>-1){
												mtt.setspot("계곡");
												
											}
											else if((index =s.indexOf("골프"))>-1){
												mtt.setspot("골프장");
												
											}
											else if((index =s.indexOf("스키장"))>-1||(index =s.indexOf("스키"))>-1||(index =s.indexOf("보드"))>-1){
												mtt.setspot("스키장");
												
											}
											else if((index =s.indexOf("유적지"))>-1||(index =s.indexOf("유적"))>-1||(index =s.indexOf("왕릉"))>-1||(index =s.indexOf("동굴"))>-1){
												mtt.setspot("유적지");
												
											}
											else if((index =s.indexOf("유원지"))>-1){
												mtt.setspot("유원지");
												
											}
											else if((index =s.indexOf("전시회"))>-1||(index =s.indexOf("박람회"))>-1||(index =s.indexOf("박물관"))>-1||(index =s.indexOf("미술관"))>-1||(index =s.indexOf("체험관"))>-1){
												mtt.setspot("전시회");
												
											}
											else if((index =s.indexOf("한옥마을"))>-1){
												mtt.setspot("한옥마을");
												
											}
											else if((index =s.indexOf("놀이공원"))>-1||(index =s.indexOf("에버랜드"))>-1||(index =s.indexOf("테마파크"))>-1){
												mtt.setspot("테마파크");
												
											}else if((index =s.indexOf("아쿠아리움"))>-1){
												mtt.setspot("테마파크");
												
											}
											else if((index =s.indexOf("공원"))>-1||(index =s.indexOf("파크"))>-1){
												mtt.setspot("공원");
												
											}else if((index =s.indexOf("수목원"))>-1){
												mtt.setspot("공원");
												
											}
											else if((index =s.indexOf("전통시장"))>-1){
												mtt.setspot("전통시장");
												
											}else if((index =s.indexOf("시장"))>-1){
												mtt.setspot("전통시장");
												
											}
											else if((index =s.indexOf("음식점"))>-1||(index =s.indexOf("먹거리"))>-1){
												mtt.setspot("음식점/카페");
												
											}else if((index =s.indexOf("식당"))>-1||(index =s.indexOf("맛집"))>-1||(index =s.indexOf("카페"))>-1){
												mtt.setspot("음식점/카페");
												
											}
											else if((index =s.indexOf("민박"))>-1||(index =s.indexOf("팬션"))>-1||(index =s.indexOf("모텔"))>-1||(index =s.indexOf("호텔"))>-1||
													(index =s.indexOf("콘도"))>-1||(index =s.indexOf("여관"))>-1||(index =s.indexOf("펜션"))>-1||(index =s.indexOf("모탤"))>-1||
													(index =s.indexOf("찜방"))>-1||(index =s.indexOf("호탤"))>-1||(index =s.indexOf("게하"))>-1){
												mtt.setspot("숙박시설");
												
											}else if((index =s.indexOf("리조트"))>-1||(index =s.indexOf("찜질방"))>-1||(index =s.indexOf("게스트하우스"))>-1){
												mtt.setspot("숙박시설");
												
											}
											else if((index =s.indexOf("아울렛"))>-1||(index =s.indexOf("백화점"))>-1){
												mtt.setspot("아울렛/쇼핑");
												
											}else if((index =s.indexOf("쇼핑"))>-1){
												mtt.setspot("아울렛/쇼핑");
												
											}else if((index =s.indexOf("농촌"))>-1||(index =s.indexOf("농장"))>-1){
												mtt.setspot("농촌");
											}
											else {
												mtt.setspot("null");	
											}
											
											///////////////////////////////////////////////////////
											if((index = s.indexOf("글래핑"))>-1){
												mtt.settema1("글램핑");
												if((index = s.indexOf("오토캠핑"))>-1){
													mtt.settema2("오토캠핑");
													if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("로코"))>-1){
													mtt.settema2("로코");
													if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("야영장"))>-1){
													mtt.settema2("야영장");
													if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("휴양림"))>-1){
													mtt.settema2("휴양림");
													if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
														(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
													mtt.settema2("캠핑카");
													if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("트레일러"))>-1){
													mtt.settema2("트레일러");
													if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("공원"))>-1){
													mtt.settema2("공원");
													if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("방갈로"))>-1){
													mtt.settema2("방갈로");
													if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
													mtt.settema2("백패킹");
													if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else {
														mtt.settema3("null");
													}
												}else {
													mtt.settema2("null");
													mtt.settema3("null");
												}
											}else if((index = s.indexOf("오토캠핑"))>-1){
												mtt.settema1("오토캠핑");
												if((index = s.indexOf("글래핑"))>-1){
													mtt.settema2("글래핑");
													if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("로코"))>-1){
													mtt.settema2("로코");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("야영장"))>-1){
													mtt.settema2("야영장");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("휴양림"))>-1){
													mtt.settema2("휴양림");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
														(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
													mtt.settema2("캠핑카");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("트레일러"))>-1){
													mtt.settema2("트레일러");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("공원"))>-1){
													mtt.settema2("공원");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("방갈로"))>-1){
													mtt.settema2("방갈로");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
													mtt.settema2("백패킹");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else {
														mtt.settema3("null");
													}
												}else {
													mtt.settema2("null");
													mtt.settema3("null");
												}
											}else if((index = s.indexOf("로코"))>-1){
												mtt.settema1("로코");
												if((index = s.indexOf("오토캠핑"))>-1){
													mtt.settema2("오토캠핑");
													if((index = s.indexOf("글램핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("오토캠핑"))>-1){
													mtt.settema2("오토캠핑");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("야영장"))>-1){
													mtt.settema2("야영장");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("휴양림"))>-1){
													mtt.settema2("휴양림");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
														(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
													mtt.settema2("캠핑카");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("트레일러"))>-1){
													mtt.settema2("트레일러");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("공원"))>-1){
													mtt.settema2("공원");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("방갈로"))>-1){
													mtt.settema2("방갈로");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
													mtt.settema2("백패킹");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else {
														mtt.settema3("null");
													}
												}else {
													mtt.settema2("null");
													mtt.settema3("null");
												}
											}else if((index = s.indexOf("야영장"))>-1){
												mtt.settema1("야영장");
												if((index = s.indexOf("오토캠핑"))>-1){
													mtt.settema2("오토캠핑");
													if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("글램핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("로코"))>-1){
													mtt.settema2("로코");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("오토캠핑"))>-1){
													mtt.settema2("오토캠핑");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("휴양림"))>-1){
													mtt.settema2("휴양림");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
														(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
													mtt.settema2("캠핑카");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("트레일러"))>-1){
													mtt.settema2("트레일러");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("공원"))>-1){
													mtt.settema2("공원");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("방갈로"))>-1){
													mtt.settema2("방갈로");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
													mtt.settema2("백패킹");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else {
														mtt.settema3("null");
													}
												}else {
													mtt.settema2("null");
													mtt.settema3("null");
												}
											}else if((index = s.indexOf("휴양림"))>-1){
												mtt.settema1("휴양림");
												if((index = s.indexOf("오토캠핑"))>-1){
													mtt.settema2("오토캠핑");
													if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("글램핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("로코"))>-1){
													mtt.settema2("로코");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("야영장"))>-1){
													mtt.settema2("야영장");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("글래핑"))>-1){
													mtt.settema2("글래핑");
													if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
														(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
													mtt.settema2("캠핑카");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("트레일러"))>-1){
													mtt.settema2("트레일러");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("공원"))>-1){
													mtt.settema2("공원");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("방갈로"))>-1){
													mtt.settema2("방갈로");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
													mtt.settema2("백패킹");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else {
														mtt.settema3("null");
													}
												}else {
													mtt.settema2("null");
													mtt.settema3("null");
												}
											}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
													(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
												mtt.settema1("캠핑카");
												if((index = s.indexOf("오토캠핑"))>-1){
													mtt.settema2("오토캠핑");
													if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("글램핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("로코"))>-1){
													mtt.settema2("로코");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("야영장"))>-1){
													mtt.settema2("야영장");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("휴양림"))>-1){
													mtt.settema2("휴양림");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("글래핑"))>-1){
													mtt.settema3("글램핑");
													if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("트레일러"))>-1){
													mtt.settema2("트레일러");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("공원"))>-1){
													mtt.settema2("공원");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("방갈로"))>-1){
													mtt.settema2("방갈로");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
													mtt.settema2("백패킹");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else {
														mtt.settema3("null");
													}
												}else {
													mtt.settema2("null");
													mtt.settema3("null");
												}
											}else if((index = s.indexOf("트레일러"))>-1){
												mtt.settema1("트레일러");
												if((index = s.indexOf("오토캠핑"))>-1){
													mtt.settema2("오토캠핑");
													if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글래핑");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("로코"))>-1){
													mtt.settema2("로코");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("야영장"))>-1){
													mtt.settema2("야영장");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("휴양림"))>-1){
													mtt.settema2("휴양림");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
														(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
													mtt.settema2("캠핑카");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("글래핑"))>-1){
													mtt.settema2("글래");
													if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("공원"))>-1){
													mtt.settema2("공원");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("방갈로"))>-1){
													mtt.settema2("방갈로");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
													mtt.settema2("백패킹");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else {
														mtt.settema3("null");
													}
												}else {
													mtt.settema2("null");
													mtt.settema3("null");
												}
											}else if((index = s.indexOf("방갈로"))>-1){
												mtt.settema1("방갈로");
												if((index = s.indexOf("오토캠핑"))>-1){
													mtt.settema2("오토캠핑");
													if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글래핑");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("로코"))>-1){
													mtt.settema2("로코");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("야영장"))>-1){
													mtt.settema2("야영장");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("휴양림"))>-1){
													mtt.settema2("휴양림");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
														(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
													mtt.settema2("캠핑카");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("트레일러"))>-1){
													mtt.settema2("트레일러");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("공원"))>-1){
													mtt.settema2("공원");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("글래핑"))>-1){
													mtt.settema2("글래핑");
													if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
													mtt.settema2("백패킹");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else {
														mtt.settema3("null");
													}
												}else {
													mtt.settema2("null");
													mtt.settema3("null");
												}
											}else if((index = s.indexOf("공원"))>-1){
												mtt.settema1("공원");
												if((index = s.indexOf("오토캠핑"))>-1){
													mtt.settema2("오토캠핑");
													if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글래핑");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("로코"))>-1){
													mtt.settema2("로코");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("야영장"))>-1){
													mtt.settema2("야영장");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("휴양림"))>-1){
													mtt.settema2("휴양림");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
														(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
													mtt.settema2("캠핑카");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("트레일러"))>-1){
													mtt.settema2("트레일러");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("글래핑"))>-1){
													mtt.settema2("글래핑");
													if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("방갈로"))>-1){
													mtt.settema2("방갈로");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
														mtt.settema3("백패킹");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
													mtt.settema2("백패킹");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else {
														mtt.settema3("null");
													}
												}else {
													mtt.settema2("null");
													mtt.settema3("null");
												}
											}else if((index = s.indexOf("뺵패킹"))>-1||(index = s.indexOf("백패킹"))>-1){
												mtt.settema1("백패킹");
												if((index = s.indexOf("오토캠핑"))>-1){
													mtt.settema2("오토캠핑");
													if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글래핑");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("로코"))>-1){
													mtt.settema2("로코");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("야영장"))>-1){
													mtt.settema2("야영장");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("휴양림"))>-1){
													mtt.settema2("휴양림");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
														(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
													mtt.settema2("캠핑카");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("트레일러"))>-1){
													mtt.settema2("트레일러");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("공원"))>-1){
													mtt.settema2("공원");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("방갈로"))>-1){
													mtt.settema2("방갈로");
													if((index = s.indexOf("글래핑"))>-1){
														mtt.settema3("글램핑");
													}else if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else {
														mtt.settema3("null");
													}
												}else if((index = s.indexOf("글래핑"))>-1){
													mtt.settema2("글래핑");
													if((index = s.indexOf("오토캠핑"))>-1){
														mtt.settema3("오토캠핑");
													}else if((index = s.indexOf("로코"))>-1){
														mtt.settema3("로코");
													}else if((index = s.indexOf("야영장"))>-1){
														mtt.settema3("야영장");
													}else if((index = s.indexOf("휴양림"))>-1){
														mtt.settema3("휴양림");
													}else if((index = s.indexOf("캠핑카"))>-1||(index = s.indexOf("카라반"))>-1||(index = s.indexOf("캐러반"))>-1||
															(index = s.indexOf("캐러밴"))>-1||(index = s.indexOf("카라밴"))>-1){
														mtt.settema3("캠핑카");
													}else if((index = s.indexOf("트레일러"))>-1){
														mtt.settema3("트레일러");
													}else if((index = s.indexOf("공원"))>-1){
														mtt.settema3("공원");
													}else if((index = s.indexOf("방갈로"))>-1){
														mtt.settema3("방갈로");
													}else {
														mtt.settema3("null");
													}
												}else {
													mtt.settema2("null");
													mtt.settema3("null");
												}
											}else {
												mtt.settema1("null");
												mtt.settema2("null");
												mtt.settema3("null");
											}
											
											if((index = s.indexOf("돔형"))>-1){
												mtt.setsleep("돔형");
											}else if((index = s.indexOf("리빙쉘"))>-1){
												mtt.setsleep("리빙쉘");
											}else if((index = s.indexOf("팝업"))>-1){
												mtt.setsleep("팝업");
											}else if((index = s.indexOf("알파인"))>-1){
												mtt.setsleep("알파인");
											}else if((index = s.indexOf("티피"))>-1){
												mtt.setsleep("티피");
											}else if((index = s.indexOf("카텐트"))>-1){
												mtt.setsleep("카텐트");
											}else if((index = s.indexOf("거실텐트"))>-1){
												mtt.setsleep("거실텐트");
											}else if((index = s.indexOf("이너테트"))>-1){
												mtt.setsleep("이너텐트");
											}else if((index = s.indexOf("쉘터"))>-1){
												mtt.setsleep("쉘터");
											}else if((index = s.indexOf("루프탑"))>-1){
												mtt.setsleep("루프탑");
											}else if((index = s.indexOf("루프"))>-1){
												mtt.setsleep("루프");
											}else if((index = s.indexOf("거실형"))>-1){
												mtt.setsleep("거실형");
											}else{
												mtt.setsleep("null");
											}
											
											if((index = s.indexOf("싸이트"))>-1||(index = s.indexOf("사이트"))>-1){
												mtt.setsite("사이트");
											}else{
												mtt.setsite("null");
											}
											if((index = s.indexOf("수세식"))>-1){
												mtt.settoilet("수세식");
											}else if((index = s.indexOf("수세식"))>-1){
												mtt.settoilet("재래식");
											}else{
												mtt.settoilet("null");
											}
											
											if((index = s.indexOf("깨끗"))>-1||(index = s.indexOf("청결"))>-1||(index = s.indexOf("깔끔"))>-1||
													(index = s.indexOf("위생적"))>-1){
												mtt.setclean("위생긍정");
											}else if((index = s.indexOf("더러움"))>-1||(index = s.indexOf("더러웠"))>-1||(index = s.indexOf("더럽다"))>-1||(index = s.indexOf("지저분"))>-1||
													(index = s.indexOf("불결"))>-1||(index = s.indexOf("비위생적"))>-1){
												mtt.setclean("위생부정");
											}else{
												mtt.setclean("null");
											}
											
											if((index = s.indexOf("즐거움"))>-1||(index = s.indexOf("즐거운"))>-1||(index = s.indexOf("즐거웠"))>-1||(index = s.indexOf("즐겁"))>-1||
													(index = s.indexOf("재밌"))>-1||(index = s.indexOf("재미있"))>-1||(index = s.indexOf("재미 있"))>-1||(index = s.indexOf("좋았음"))>-1||
													(index = s.indexOf("좋았"))>-1||(index = s.indexOf("최고"))>-1||(index = s.indexOf("좋다"))>-1||(index = s.indexOf("즐기다"))>-1||
													(index = s.indexOf("신나"))>-1||(index = s.indexOf("신남"))>-1){
												mtt.setman("만족도긍정");
											}else if((index = s.indexOf("재미없"))>-1||(index = s.indexOf("재미 없"))>-1||(index = s.indexOf("불편"))>-1||(index = s.indexOf("지루"))>-1||
													(index = s.indexOf("귀찮"))>-1||(index = s.indexOf("춥다"))>-1||(index = s.indexOf("고난"))>-1||(index = s.indexOf("고생"))>-1||
													(index = s.indexOf("힘들었"))>-1||(index = s.indexOf("힘들"))>-1){
												mtt.setman("만족도부정");
											}else{
												mtt.setman("null");
											}
											
											
											mtt.save_text();
											mtt.clear();
							}else{
								String title_txt[] = s.split(":");
								mtt.setid(title_txt[3].replace("\"", ""));
								mtt.setwhen_write(title_txt[4].replace("\"", ""));
							}
							
							
						}
						
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						System.out.println("파일 리딩 에러");
					} catch(IOException e){
						e.printStackTrace();
					}
					
					
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		paxing sdf = new paxing();
		String source = "/home/hch/paxing_dir/euc";
		sdf.subDirList(source);
	}

}

