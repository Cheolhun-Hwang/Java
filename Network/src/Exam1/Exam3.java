package Exam1;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.*;

public class Exam3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Socket s = new Socket("127.0.0.1", 5000);
			System.out.println("## 클라이언트 실행..");
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			pw.println("쿠스쿠스쿠스쿠스쿠스");
			pw.close();
			s.close();
			System.out.println("## 클라이언트 종료..");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
