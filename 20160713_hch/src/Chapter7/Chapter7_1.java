package Chapter7;

//import java.io.InputStream;
//import java.io.OutputStream;
import java.io.*;

public class Chapter7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream in = System.in;
		OutputStream out = System.out;
		char[] a = new char[10];
		try{
			int input = in.read();
			System.out.println(input);
			out.write(input);
			out.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
