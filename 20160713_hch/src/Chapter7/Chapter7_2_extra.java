package Chapter7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Chapter7_2_extra {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File reading = new File("/home/hch/exam.txt");
		File store = new File("/home/hch/exam2.txt");
		//파일 읽어들이고 새로운 파일에 저장하기!!!!
		try{
			BufferedReader bin = new BufferedReader(new FileReader(reading)); //버퍼에 넣어서 그것을 문자열로 넣기!
			BufferedWriter bout = new BufferedWriter(new FileWriter(store));
			String s;
			while((s = bin.readLine()) != null){
				bout.write(s + "-라인종료");
				System.out.print(s + "-라인종료");
			}
			bin.close();
			bout.close();
			reading.delete();
		}catch(Exception e){
			System.out.println("입출력 오류.");
		}
		System.out.println("DONE!!");
	}

}
