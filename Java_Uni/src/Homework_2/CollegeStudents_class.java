package Homework_2;

public class CollegeStudents_class extends Students_class{

	private String college_name; 		//학교명 변수
	private String major;				//전공 변수
	private int c_year;					//학년 변수
	private String s_id;				//학번 변수
	
	public CollegeStudents_class(String[] a){								//생성자 오버로드	매개변수를 String 배열로 받는다.
		super(a[0], a[1], a[2], Integer.parseInt(a[3]), a[4]);			//상속받은 부모 클래스의 생성자 호출하여 다음 매개변수를 전달한다.
		this.college_name = a[5];									
		this.major = a[6];
		this.c_year = Integer.parseInt(a[7]);								//String 값을 int 형으로 바꾸어 저장한다.
		this.s_id = a[8];
	}
	
	public CollegeStudents_class(){											//생성자 오버로드	매개변수를 받지 않는다.
		super();																	//상속받은 부모클래스도 매개변수를 주지 않아 아무것도 없는상태로 만든다.
		this.college_name = "";
		this.major = "";
		this.c_year = 0;
		this.s_id = "";
	}
	
	public void monify_college_name(String a){								//학교가 바뀔경우 사용하는 메소드 또는 매개변수를 받지 않을때 추가한다.
		this.college_name = a;
	}
	public void monify_major(String a){										//전공이 바뀌거나 매개변수를 받지 않을때 수정한다.
		this.major = a;
	}
	public void monify_c_year(int a){											//학년이 바뀌거나 매개변수를 받지 않을때 수정한다.
		this.c_year = a;
	}
	public void monify_s_id(String a){           							//학번이 수정되거나 매개변수를 받지 않을때 수정한다.
		this.s_id = a;
	}
	
	
	public String toString(){													//객체 호출시 String 값으로 반환하게 하는 메소드 오버라이딩
		return (print_personal() + "\n학교명 : "+this.college_name+" 전공 : " +this.major +" 학년 : " + this.c_year + " 학번 : " + this.s_id);
	}
	
	public static void print_ans(){											//메소드 오버라이딩 부모의 정적변수를 수정하여 사용한다.
		System.out.println("학생 개인정보 출력이 완료되었습니다.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] student1 = {"930222", "애자일", "남", "24", "경기도 성남시 수정구", "가천대학교", "컴퓨터공학과", "2", "201333752"};		//초기화를 위한 배열
		String[] student2 = {"920222", "스프린", "남", "25", "경기도 성남시 수정구", "가천대학교", "소프트웨어학과", "3", "201233225"};	//초기화를 위한 배열
		
		CollegeStudents_class cc1 = new CollegeStudents_class(student1);														//객체 생성
		CollegeStudents_class cc2 = new CollegeStudents_class(student2);														//객체생성
		CollegeStudents_class cc3 = new CollegeStudents_class();																	//매개변수 없는 빈 객체 생성
		Students_class sc1 = new Students_class(student1[0], student1[1], student1[2], Integer.parseInt(student1[3]), student1[4]);	//부모클래스 객체생성
		Students_class sc2 = new CollegeStudents_class(student2);																//업캐스팅방법으로 생성
		
		cc3.monify_p_name("코코모");																										//부모메소드 이용 수정
		cc3.monify_p_id("930101");																										//부모메소드 이용 수정
		cc3.monify_p_adress("경기도 성남시 수정구");																						//부모메소드 이용 수정
		cc3.monify_p_sex("여");																											//부모메소드 이용 수정
		cc3.monify_p_age(24);																											//부모메소드 이용 수정
		cc3.monify_s_id("201333225");
		cc3.monify_college_name("가천대학교");
		cc3.monify_c_year(2);
		cc3.monify_major("컴퓨터공학과");
		
		System.out.println("--------------------------------------------");													//자식클래스+부모클래스 내용 출력
		System.out.println(cc1);																										
		System.out.println(cc2);
		System.out.println(cc3);
		print_ans();																														//자식클래스 정적 메소드 오버라이딩 출력
		System.out.println("--------------------------------------------");
		System.out.println(sc1);																										//부모클래스 객체 출력
		System.out.println(sc2);																										//업캐스팅한 객체 출력
		Students_class.print_ans();																									//부모 정적 메소드 출력
		System.out.println("--------------------------------------------");
		System.out.println((CollegeStudents_class)sc2);																			//업캐시팅한 객체를 다시 다운캐스팅해서 출력
	}

}
