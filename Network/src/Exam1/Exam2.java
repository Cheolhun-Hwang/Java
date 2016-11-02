package Exam1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

public class Exam2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			ServerSocket sc = new ServerSocket(5000);
			System.out.println("## 서버 실행..");
			while(true){
				Socket s = sc.accept();
				BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
				System.out.println("## 클라이언트 연결됨!");
				System.out.println("## 클라이언트 메시지 : " + br.readLine());
				br.close();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
