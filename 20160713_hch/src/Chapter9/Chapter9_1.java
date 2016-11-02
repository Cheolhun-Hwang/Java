package Chapter9;

import java.util.*;

public class Chapter9_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al1 = new ArrayList<String>();
		ArrayList<String> al2 = new ArrayList<String>();
		
		al1.add("홍길동");
		
		al1.add("하구나마타타");
		al1.add("10");
		
		al2.add("두산");
		al2.add("기아");
		al2.add("100");
		al1.add(1, "나타");
		
		al2.addAll(al1);
		al2.remove(4);
		for(int i = 0;i<al1.size();i++){
			System.out.println(al1.get(i));
		}
		
		
		System.out.println("----------------");
		for(String s : al2){
			System.out.println(s);
		}
	}

}
