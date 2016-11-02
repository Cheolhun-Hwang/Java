/**
 * 파일명 : windows_filereader.java
 * 작성일 : 2016. 7. 26.
 * 파일설명 :
 */
package Text;

import java.io.*;

/**
 * @author qewqs
 *
 */
public class windows_filereader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\qewqs\\Desktop\\예제_스크롤링.txt");
			InputStreamReader inreader = new InputStreamReader(fin, "utf-8");
			BufferedReader breader = new BufferedReader(inreader);
			//int s;
			String s;
			while((s =/*inreader.read()*/ breader.readLine()) != /*-1*/ null){
				System.out.println(/*(char)*/s);
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		}
	}

}
