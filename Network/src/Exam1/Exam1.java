package Exam1;

import java.io.*;
import java.net.*;

public class Exam1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			URL url = new URL("http://blog.naver.com/qewqsa");
			System.out.println("프로토콜 : " + url.getProtocol());
			System.out.println("호스트 : " + url.getHost());
			System.out.println("포트 : " + url.getPort());
			
			System.out.println(">> HTML start");
			InputStream is = url.openStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String msg;
			while((msg = br.readLine()) != null){
				System.out.println(msg);
			}
			br.close();
			is.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
