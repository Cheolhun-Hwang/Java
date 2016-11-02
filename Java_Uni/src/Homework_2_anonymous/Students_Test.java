package Homework_2_anonymous;

public class Students_Test{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students_anonymous ci1=new Students_anonymous() {
			
			@Override
			public void print_students() {
				// TODO Auto-generated method stub
				System.out.println("이름 : 스프린 주민번호 : 920222 나이 : 25 성별 : 남 주소 : 경기도 성남시 수정구");
			}
			
			@Override
			public void print_personal() {
				// TODO Auto-generated method stub
				System.out.println("학교명 : 가천대학교 전공 : 소프트웨어학과 학년 : 3 학번 : 201233225");
			}
			
			@Override
			public void print_ans() {
				// TODO Auto-generated method stub
				System.out.println("학생 개인정보 출력을 완료 하였습니다.");
			}
		};																	//객체생성
		
		ci1.print_personal();
		
		ci1.print_students();
		ci1.print_ans();
	}

}
