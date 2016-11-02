package Chapter7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Chapter7_5 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("##간단한 메모장 v0.1");
		System.out.println("## 저장할 파일명 : ");
		Scanner scan = new Scanner(System.in);
		String filename = scan.next();
		System.out.println("## 저장은 마지막 라인에 q 입력");
		
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter write = new BufferedWriter(new FileWriter("/home/hch/"+filename));
			String s;
			while(!(s=read.readLine()).equals("q")){
				write.write(s+"\r\n");
			}
			read.close();
			write.close();
			scan.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("## 프로그램을 종료합니다.");
		System.out.println(filename + " 저장되었습니다.");
	}

}
