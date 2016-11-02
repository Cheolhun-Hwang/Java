package Week5;

public class Employee {

		public String name;
		String address;
		protected int salary;
		private int rrn;
		
		public Employee(String name, String address, int salary, int rrn){
			this.name = name;
			this.address = address;
			this.salary = salary;
			this.rrn = rrn;
		}
		
		public String toString(){
			return "Employee [ 이름 : " + name + " 주소 : " + address + " 월급 : " + salary + " 주민등록번호 : " + rrn;
		}
}
