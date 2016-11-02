package Homework_2;

public class Students_class {
	private String p_id;			//주민번호 변수
	private String p_name;			//이름 변수
	private String p_sex;			//성별 변수
	private String p_adress;		//주소변수
	private int p_age;				//나이 변수
	
	public Students_class(){		//생성자 오버로드	매개변수 없는 생성자
		p_id = "";
		p_name= "";
		p_sex="";
		p_age=0;
		p_adress="";
	}
	
	public Students_class(String p_id, String p_name, String p_sex, int p_age, String adress){	//생성자 오버로드	매개변수를 받는 생성자
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_sex = p_sex;
		this.p_age = p_age;
		this.p_adress = adress;
	}
	
	public String toString(){																					//객체 호출시 반환되는 문자열 메소드 오버라이딩
		return ("이름 : " + this.p_name + " 주민번호 : " + this.p_id +" 나이 : " + this.p_age + " 성별 : " + this.p_sex +
					" 주소 : " + this.p_adress);
	}
	public String print_personal(){																			//String 값으로 반환하는 메소드
		return ("이름 : " + this.p_name + " 주민번호 : " + this.p_id +" 나이 : " + this.p_age + " 성별 : " + this.p_sex +
					" 주소 : " + this.p_adress);
	}
	
	public void monify_p_name(String a){																		//이름 또는 빈메소드 수정시 사용
		this.p_name = a;
	}
	public void monify_p_age(int a){																			//나이 또는 빈메소드 수정시 사용
		this.p_age = a;
	}
	public void monify_p_adress(String a){																	//주소 또는 빈메소드 수정시 사용
		this.p_adress = a;
	}
	public void monify_p_sex(String a){																		//성별 또는 빈메소드 수정시 사용
		this.p_sex = a;
	}
	public void monify_p_id(String a){																		//주번 또는 빈메소드 수정시 사용
		this.p_id = a;
	}
	
	public static void print_ans(){																			//출력되었음을 알려줄 정적 메소드
		System.out.println("개인정보 출력이 완료되었습니다.");
	}
}
