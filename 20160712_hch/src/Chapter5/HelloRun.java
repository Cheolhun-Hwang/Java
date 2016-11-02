package Chapter5;

public class HelloRun {

	/**
	 * @param args
	 */
	private String msg;
	static int count = 0;
	static String prefix = "";
	
	public HelloRun(){
		msg = "Hello World!!";
	}
	public HelloRun(String msg){
		this.msg = msg;
	}
	public HelloRun(String msg, int opt){
		if(opt == 1){
			this.msg = msg;
		}else if(opt == 2){
			this.msg = msg + ", Party People!!!";
		}
	}
	
	public void setMsg(String msg){
		this.msg = msg;
	}
	
	public String getMsg(){
		return msg;
	}
	
	public void print(){
		count++;
		System.out.println("[" + count +"]"+prefix + msg);
	}
	
	public void go(){
		HelloRun hello = new HelloRun();
		hello.print();
		HelloRun hello2 = new HelloRun("My Hello World");
		hello2.print();
		HelloRun hello3 = new HelloRun("My Hello World", 1);
		hello3.print();
		HelloRun hello4 = new HelloRun("My Hello World", 2);
		hello4.print();
		hello.setMsg("여기는 가천대학교입니다.");
		System.out.println(hello.getMsg());
		
		HelloRun.prefix = "Greeting : ";
		hello2.print();
		hello3.print();
		
		HelloRun.prefix= "인사말 : ";
		hello2.print();
		hello3.print();
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		HelloRun hr = new HelloRun();
		hr.go();		
	}

}
