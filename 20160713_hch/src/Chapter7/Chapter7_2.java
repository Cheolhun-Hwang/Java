package Chapter7;

import java.io.*;

public class Chapter7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader bin = new BufferedReader(in); //버퍼에 넣어서 그것을 문자열로 넣기!
		BufferedWriter bout = new BufferedWriter(out);
		try{
			String input = bin.readLine();
			//int input = in.read();
			System.out.println(input);
			out.write(input);
			out.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
