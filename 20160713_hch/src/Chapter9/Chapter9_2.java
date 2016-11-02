package Chapter9;

import java.util.Collection;
import java.util.HashMap;

public class Chapter9_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("101", "황철훈");
		hm.put("102", "김지훈");
		hm.put("103", "김민재");
		
		System.out.println(hm.get("102"));
		System.out.println("===================");
		Collection<String> c =hm.values();
		for(String s : c){
			System.out.println(s);
		}
	}

}
