package Homework_2_abstract;


public class CollegeStudents_abastract extends Students_abstract{
	private String college_name; 		//학교명 변수
	private String major;				//전공 변수
	private int c_year;					//학년 변수
	private String s_id;				//학번 변수
	
	public CollegeStudents_abastract(String[] a){								//생성자 오버로드	매개변수를 String 배열로 받는다.
		super(a[0], a[1], a[2], Integer.parseInt(a[3]), a[4]);			//상속받은 부모 클래스의 생성자 호출하여 다음 매개변수를 전달한다.
		this.college_name = a[5];									
		this.major = a[6];
		this.c_year = Integer.parseInt(a[7]);								//String 값을 int 형으로 바꾸어 저장한다.
		this.s_id = a[8];
	}
	
	public CollegeStudents_abastract(){											//생성자 오버로드	매개변수를 받지 않는다.
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
	
	@Override
	public void print_ans() {																											//추상클래스 추상메소드 정의
		// TODO Auto-generated method stub
		System.out.println("학생 개인정보 출력이 완료되었습니다.");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] student1 = {"930222", "애자일", "남", "24", "경기도 성남시 수정구", "가천대학교", "컴퓨터공학과", "2", "201333752"};		//초기화를 위한 배열
		String[] student2 = {"920222", "스프린", "남", "25", "경기도 성남시 수정구", "가천대학교", "소프트웨어학과", "3", "201233225"};	//초기화를 위한 배열
		
		CollegeStudents_abastract cc1 = new CollegeStudents_abastract(student1);														//객체 생성
		CollegeStudents_abastract cc2 = new CollegeStudents_abastract(student2);														//객체생성
		
		System.out.println("--------------------------------------------");													//자식클래스+부모클래스 내용 출력
		System.out.println(cc1);
		cc1.print_ans();
		System.out.println(cc2);
		cc2.print_ans();
		
	}

	
}
