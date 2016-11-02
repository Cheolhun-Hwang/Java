package Homework_2_interface;

public class College_interface implements Students_interface {

	private String p_id;			//주민번호 변수
	private String p_name;			//이름 변수
	private String p_sex;			//성별 변수
	private String p_adress;		//주소변수
	private int p_age;				//나이 변수
	private String college_name; 		//학교명 변수
	private String major;				//전공 변수
	private int c_year;					//학년 변수
	private String s_id;				//학번 변수
	
	public College_interface(String[] a){								//생성자 오버로드	매개변수를 String 배열로 받는다.
		this.p_id = a[0];
		this.p_name= a[1];
		this.p_sex= a[2];
		this.p_age= Integer.parseInt(a[3]);							 	 //String 값을 int 형으로 바꾸어 저장한다.
		this.p_adress=a[4];
		this.college_name = a[5];									
		this.major = a[6];
		this.c_year = Integer.parseInt(a[7]);								
		this.s_id = a[8];
	}
	
	public College_interface(){											//생성자 오버로드	매개변수를 받지 않는다.
		this.p_id = "";														//상속받은 부모클래스도 매개변수를 주지 않아 아무것도 없는상태로 만든다.
		this.p_name= "";
		this.p_sex="";
		this.p_age=0;
		this.p_adress="";													
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
	public void monify_p_name(String a){										//이름 또는 빈메소드 수정시 사용
		this.p_name = a;
	}
	public void monify_p_age(int a){											//나이 또는 빈메소드 수정시 사용
		this.p_age = a;
	}
	public void monify_p_adress(String a){									//주소 또는 빈메소드 수정시 사용
		this.p_adress = a;
	}
	public void monify_p_sex(String a){										//성별 또는 빈메소드 수정시 사용
		this.p_sex = a;
	}
	public void monify_p_id(String a){										//주번 또는 빈메소드 수정시 사용
		this.p_id = a;
	}
	
	public String toString(){													//객체 호출시 String 값으로 반환하게 하는 메소드 오버라이딩
		return ("학교명 : "+this.college_name+" 전공 : " +this.major +" 학년 : " + this.c_year + " 학번 : " + this.s_id);
	}
	
	public void print_personal(){												//인터페이스 추상 클래스 정의 - 개인정보
		System.out.println("이름 : " + this.p_name + " 주민번호 : " + this.p_id +" 나이 : " + this.p_age + " 성별 : " + this.p_sex +
				" 주소 : " + this.p_adress);
	}
	
	public void print_ans(){													//인터페이스 추상클래스 정의 - 출력완료정보
		System.out.println("학생 개인정보 출력을 완료하였습니다.");
	}
	
	public void print_students(){												//인터페이스 추상클래스 정의 - 학생정보
		System.out.println("이름 : " + this.p_name + " 주민번호 : " + this.p_id +" 나이 : " + this.p_age + " 성별 : " + this.p_sex +
				" 주소 : " + this.p_adress+ "\n학교명 : "+this.college_name+" 전공 : " +this.major +" 학년 : " + this.c_year + " 학번 : " + this.s_id);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] student1 = {"930222", "애자일", "남", "24", "경기도 성남시 수정구", "가천대학교", "컴퓨터공학과", "2", "201333752"};		//초기화를 위한 배열
		
		College_interface ci1=new College_interface(student1); 																	//객체생성
		
		System.out.println("개인 정보 :");
		ci1.print_personal();																											
		System.out.println("학교 정보 :");
		System.out.println(ci1);
		System.out.println("전체 정보 :");
		ci1.print_students();
		ci1.print_ans();
		
	}
}
