package Big_paxing;

	import java.io.*;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;
	//////////////////////////
	class Make_table2{
		///////////////////////
		private int pet;//
		private int selca;
		private int movie;
		
		Make_table2(){
			this.pet = 0;
			this.selca = 0;
			this.movie = 0;
		};
		
		
		/*public void print_txt(){
			String string1 = this.title+" "+this.sex+" "+this.ages+" "+this.when_write+" ";
			String string2 = this.tema1+" "+this.tema2+" "+this.tema3+" "+this.who_with+" ";
			String string3 = this.sleep+" "+this.transport+" " +this.food+" "+this.mat+" "+this.spot+" "+this.spot2+" ";
			String string4 = this.city+" "+this.city2+" "+this.sort+" "+this.person+" "+this.stay_long+" ";
			String string5 = this.toilet+" "+this.clean+" "+this.man+" ";
			
			String txt = string1+string2+string3+string4+string5+"\n";
			System.out.println(txt);
		}*/
		
		public void save_text(){
			/*String string1 = this.title+" "+this.sex+" "+this.ages+" "+this.when_write+" ";
			String string2 = this.tema1+" "+this.tema2+" "+this.tema3+" "+this.who_with+" ";
			String string3 = this.sleep+" "+this.transport+" " +this.food+" "+this.mat+" "+this.spot+" "+this.spot2+" ";
			String string4 = this.city+" "+this.city2+" "+this.city3+" "+this.sort+" "+this.person+" "+this.stay_long+" ";
			String string5 = this.toilet+" "+this.clean+" "+this.man+" "+this.wordcount+" ";*/
			String string1 = this.pet+" "+this.selca+" "+this.movie+" ";
			
			//String txt = string1+string2+string3+string4+string5+"\n";			//저장형식 지정
	       String txt = string1+"\n";
			String fileName = "/home/hch/paxing_dir/complete/spcial_case3.txt";	//텍스트 파일 저장할 위치
	         
	        
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
		public void clear(){
			//tema, city는 초기화를 하지 않는다.
			this.pet = 0;
			this.selca = 0;
			this.movie = 0;
		}
		public void petcount(Make_table2 mtt, String s){
			//1. 애완동물(강아지, 개님, 고양이, 야옹이, 멍멍이, 반려동물, 똥개, 괭이,)
			//1. 애완동물(강아지, 뽀삐, 초코, 또또, 아리, 고양이, 야옹이, 멍멍이, 반려동물, 밍키, 눅스, 똥개, 토토, 코코, 연두, 고슴도치, 강쥐, 초롱이, 방울이, 우리두부, 우리 두부, 까미, 우리 나비, 우리나비, 우리포도, 우리 포도, 우리 쿠키, 우리쿠키, 우리홍차, 우리 홍차, 괭이, 우리치즈, 우리 치즈, 우리 호두, 우리호두, 우리별이, 우리 별이, 샤샤, )
			Pattern pattern16 = Pattern.compile("샤샤");			
			Matcher matcher16 = pattern16.matcher(s);
			while (matcher16.find()) {
				this.pet++;
			}
			Pattern pattern15 = Pattern.compile("코코");			
			Matcher matcher15 = pattern15.matcher(s);
			while (matcher15.find()) {
				this.pet++;
			}
			Pattern pattern14 = Pattern.compile("연두");			
			Matcher matcher14 = pattern14.matcher(s);
			while (matcher14.find()) {
				this.pet++;
			}
			Pattern pattern13 = Pattern.compile("아리");			
			Matcher matcher13 = pattern13.matcher(s);
			while (matcher13.find()) {
				this.pet++;
			}
			Pattern pattern12 = Pattern.compile("까미");			
			Matcher matcher12 = pattern12.matcher(s);
			while (matcher12.find()) {
				this.pet++;
			}
			Pattern pattern11 = Pattern.compile("또또");			
			Matcher matcher11 = pattern11.matcher(s);
			while (matcher11.find()) {
				this.pet++;
			}
			Pattern pattern10 = Pattern.compile("뽀삐");			
			Matcher matcher10 = pattern10.matcher(s);
			while (matcher10.find()) {
				this.pet++;
			}
			Pattern pattern = Pattern.compile("강아지");			
			Matcher matcher = pattern.matcher(s);
			while (matcher.find()) {
				this.pet++;
			}
			Pattern pattern2 = Pattern.compile("애완동물");			
			Matcher matcher2 = pattern2.matcher(s);
			while (matcher2.find()) {
				this.pet++;
			}
			Pattern pattern3 = Pattern.compile("개님");			
			Matcher matcher3 = pattern3.matcher(s);
			while (matcher3.find()) {
				this.pet++;
			}
			Pattern pattern4 = Pattern.compile("고양이");			
			Matcher matcher4 = pattern4.matcher(s);
			while (matcher4.find()) {
				this.pet++;
			}
			Pattern pattern5 = Pattern.compile("야옹이");			
			Matcher matcher5 = pattern5.matcher(s);
			while (matcher5.find()) {
				this.pet++;
			}
			Pattern pattern6 = Pattern.compile("멍멍이");			
			Matcher matcher6 = pattern6.matcher(s);
			while (matcher6.find()) {
				this.pet++;
			}
			Pattern pattern7 = Pattern.compile("반려동물");			
			Matcher matcher7 = pattern7.matcher(s);
			while (matcher7.find()) {
				this.pet++;
			}
			Pattern pattern8 = Pattern.compile("괭이");			
			Matcher matcher8 = pattern8.matcher(s);
			while (matcher8.find()) {
				this.pet++;
			}
			Pattern pattern9 = Pattern.compile("똥개");			
			Matcher matcher9 = pattern9.matcher(s);
			while (matcher9.find()) {
				this.pet++;
			}
			
		}
		public void selcacount(Make_table2 mtt, String s){
			Pattern pattern = Pattern.compile("셀카");			
			Matcher matcher = pattern.matcher(s);
			while (matcher.find()) {
				this.selca++;
			}
			Pattern pattern2 = Pattern.compile("셀카봉");			
			Matcher matcher2 = pattern2.matcher(s);
			while (matcher2.find()) {
				this.selca++;
			}
		}
		public void moviecount(Make_table2 mtt, String s){
			Pattern pattern = Pattern.compile("영화");			
			Matcher matcher = pattern.matcher(s);
			while (matcher.find()) {
				this.movie++;
			}
			Pattern pattern2 = Pattern.compile("빔프로젝트");			
			Matcher matcher2 = pattern2.matcher(s);
			while (matcher2.find()) {
				this.movie++;
			}
			Pattern pattern3 = Pattern.compile("빔 프로젝트");			
			Matcher matcher3 = pattern3.matcher(s);
			while (matcher3.find()) {
				this.movie++;
			}
		}
		
	}
	////////////////////////////

	public class Exam_colum {

		/**
		 * @param args
		 * @throws FileNotFoundException 
		 */
		
		public void sub(String source){
			File dfile = new File(source);
			File[] FileList=dfile.listFiles();
			Make_table2 mtt = new Make_table2();
			try{
				for(int i = 0;i<FileList.length;i++){
					File rfile = FileList[i];
					/////////////////////////////
					
					/////////////////////////////
					if(rfile.isFile()){
						try{
							FileInputStream fin = new FileInputStream(rfile);
							InputStreamReader isr = new InputStreamReader(fin, "utf-8");/////utf-8////euc-kr
							BufferedReader reader = new BufferedReader(isr);
						
							String s;
							while((s = reader.readLine())!=null){
								if(s.indexOf("postViewArea")>-1){
									//System.out.println("본문 : " + s);
									////////////////////
									//1. 애완동물(강아지, 뽀삐, 초코, 또또, 아리, 고양이, 야옹이, 멍멍이, 반려동물, 밍키, 눅스, 똥개, 토토, 코코, 연두, 고슴도치, 강쥐, 초롱이, 방울이, 우리두부, 우리 두부, 까미, 우리 나비, 우리나비, 우리포도, 우리 포도, 우리 쿠키, 우리쿠키, 우리홍차, 우리 홍차, 괭이, 우리치즈, 우리 치즈, 우리 호두, 우리호두, 우리별이, 우리 별이, 샤샤, ) 언급 2. 셀카봉(셀카) 언급
									//3. 영화(빔프로젝트, 빔 프로젝트)
									
									mtt.moviecount(mtt, s);
									mtt.petcount(mtt, s);
									mtt.selcacount(mtt, s);
									
									
									////////////////////
									mtt.save_text();
									//mtt.print_txt();
									mtt.clear();
									
									
									System.out.println("Done!!");	
									
								}else if(s.indexOf(" :")>-1){
									//System.out.println("제목 : " + s);
									
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
			Exam_colum a = new Exam_colum();
			a.sub("/home/hch/paxing_dir/utf2/"); //경로!!지정
		}
	}
