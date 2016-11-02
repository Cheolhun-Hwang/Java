/**
 * 파일명 : Textreader.java
 * 작성일 : 2016. 7. 23.
 * 파일설명 :
 */
package Text;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author qewqs
 *
 */
public class Textreader {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//File reading = new File("C:\\Users\\qewqs\\Desktop");
		//InputStreamReader file = new InputStreamReader(reading/*, "utf-8"*/);
		FileInputStream filein = new FileInputStream("C:\\Users\\qewqs\\Desktop\\예제_스크롤링.txt");
		//파일 읽어들이고 새로운 파일에 저장하기!!!!
		try{
			//BufferedReader bin = new BufferedReader(new FileReader(reading)); //버퍼에 넣어서 그것을 문자열로 넣기!
			int s;
			while((s = /*bin.readLine()*/ filein.read()) != -1){
				System.out.print(s);
			}
			filein.close();
		}catch(Exception e){
			System.out.println("입출력 오류.");
		}
		System.out.println("DONE!!");
	}
}

