package Practice;

import java.util.Scanner;

public class Students extends Person {
	private String dept;
	private String grade;
	protected Students linker;
	
	public Students(){
		linker = null;
	}
	
	public String getDept(){
		return dept;
	}
	public String getGrade(){
		return grade;
	}
	public void setDept(String dept){
		this.dept = dept;
	}
	public void setGrade(String grade){
		this.grade = grade;
	}
	
	public void print_st(){
		Students point = this.linker;
		System.out.println("##등록완료내용##");
		while(point != null){
			System.out.println(point.getName() + "  " + point.getBirth() + "   " + point.getHeight() + "  " + point.getDept() + "  " + point.getGrade());
			point = point.linker;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("## 학생 등록 프로그램 ##\n");
		Students header = new Students();
		Scanner scan = new Scanner(System.in);
		String ans = "y";
		System.out.println(header.linker);
		while(ans == "y" || ans== "Y"){
			Students st_new = new Students();
			System.out.println(st_new.linker);
			System.out.print("학생이름 :");
			String name = scan.nextLine();
			st_new.setName(name);
			System.out.print("생년월일 : ");
			String birth = scan.nextLine();
			st_new.setBirth(birth);
			System.out.print("키 :");
			String height = scan.nextLine();
			st_new.setHeight(height);
			System.out.print("학과 :");
			String dept = scan.nextLine();
			st_new.setDept(dept);
			System.out.print("성적 :");
			String grade = scan.nextLine();
			st_new.setGrade(grade);
			System.out.print("등록 내용은 이하와 같습니다.\n");
			System.out.println(st_new.getName() + "  " + st_new.getBirth() + "   " + st_new.getHeight() + "  " + st_new.getDept() + "  " + st_new.getGrade());
			System.out.print("등록 완료!\n");
			//System.out.println(header.linker +"  "+ st_new.linker);
			header.linker = st_new;
			//System.out.println(header.linker +"  "+ st_new.linker );
			System.out.print("등록을 계속 하시겠습니까? [나머지/n] : ");
			ans = scan.next();
			if(ans == "n" || ans == "N"){
				break;
			}
		}
		header.print_st();
		
		
	}

}
