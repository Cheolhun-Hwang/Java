package Homework_1;

public class Exam1 {
	
	public static int Custnum = 0;
	private int CustNum;
	
	Exam1(){
		CustNum = 0;
	}
	
	public void Set_Cust_Num(int num){
		this.CustNum = num;
	}
	public int get_Cust_Num(){
		return this.CustNum;
	}
	
	public static void print_car_info_static(Car temp){
		System.out.println("### Car info ");
		System.out.println("고객 번호 : " + (temp.get_CustID()+1));
		System.out.println("차 ID : " + temp.get_CarID());
		System.out.println("차 종 : " + temp.get_Carsort());
		System.out.println("차량 색상 : " + temp.get_Col());
	}
	
	public void print_car_info(Car temp){
		System.out.println("### Car info ");
		System.out.println("고객 번호 : " + (temp.get_CustID()+1));
		System.out.println("차 ID : " + temp.get_CarID());
		System.out.println("차 종 : " + temp.get_Carsort());
		System.out.println("차량 색상 : " + temp.get_Col());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam1 ex1 = new Exam1();
		Exam1 ex2 = new Exam1();
		
		Car Customer1 = new Car("폭스바겐", "Silver", Custnum++);
		ex1.Set_Cust_Num(Custnum);
		
		System.out.println("정적변수 : " + ex1.Custnum);
		System.out.println("정적변수 : " + ex2.Custnum);
		System.out.println("ex1 : " + ex1.CustNum);
		System.out.println("ex2 : " + ex2.CustNum);
		System.out.println("===========================================");
		Car Customer2 = new Car("소나타", "Black", Custnum++);
		ex2.Set_Cust_Num(Custnum);
		System.out.println("정적변수 : " + ex1.Custnum);
		System.out.println("정적변수 : " + ex2.Custnum);
		System.out.println("ex1 : " + ex1.CustNum);
		System.out.println("ex2 : " + ex2.CustNum);
		System.out.println("===========================================");
		ex1.Custnum++;
		System.out.println("정적변수 : " + ex1.Custnum);
		System.out.println("정적변수 : " + ex2.Custnum);
		System.out.println("ex1 : " + ex1.CustNum);
		System.out.println("ex2 : " + ex2.CustNum);
		
		System.out.println("===========================================");
		ex1.print_car_info(Customer1);
		System.out.println("===========================================");
		print_car_info_static(Customer2);
	}

}
