/* 작성일 : 20160712
 * 작성자 : 황철훈
 * 내용 : 교재 예제
 */
package Chapter5;

public class HelloWorld {
	private String msg;
	static int count = 0;
	static String prefix = "";
	
	public HelloWorld(){
		msg = "Hello World!!";
	}
	public HelloWorld(String msg){
		this.msg = msg;
	}
	public HelloWorld(String msg, int opt){
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld hello = new HelloWorld();
		hello.print();
		HelloWorld hello2 = new HelloWorld("My Hello World");
		hello2.print();
		HelloWorld hello3 = new HelloWorld("My Hello World", 1);
		hello3.print();
		HelloWorld hello4 = new HelloWorld("My Hello World", 2);
		hello4.print();
		
		hello.setMsg("여기는 가천대학교입니다.");
		System.out.println(hello.getMsg());
		
		HelloWorld.prefix = "Greeting : ";
		hello2.print();
		hello3.print();
		
		HelloWorld.prefix= "인사말 : ";
		hello2.print();
		hello3.print();
	}

}
