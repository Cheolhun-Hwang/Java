package Chapter9;

import java.util.ArrayList;

public class Chapter9_1_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		//Class도 가능! 단 정의된 클래스 import 시켜야됨!!
		//Nemo nm1 = new Nemo(40, 50);
		//al1.add(nm1);
		al1.add(100);
		al1.add(200);
		al1.add(300);
		al1.add(500);
		System.out.println("========================");
		for(int i = 0; i<al1.size();i++){
			System.out.println(" " + i + "  " + al1.get(i));
		}
		al1.add(3, 400);
		System.out.println("========================");
		for(int i = 0; i<al1.size();i++){
			System.out.println(" " + i + "  " + al1.get(i));
		}
		
		al1.remove(4); //index;
		System.out.println("========================");
		for(int i = 0; i<al1.size();i++){
			System.out.println(" " + i + "  " + al1.get(i));
		}
	
	}

}
