package Chapter9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Chapter9_3 {
	HashMap<String, ArrayList<String>> productdb;
	
	public Chapter9_3(){
		productdb = new HashMap<String, ArrayList<String>>();
		
		ArrayList<String> plist1 = new ArrayList<String>();
		ArrayList<String> plist2 = new ArrayList<String>();
		ArrayList<String> plist3 = new ArrayList<String>();
		
		plist1.addAll(Arrays.asList("스마트TV", "갤럭스S7", "노트20.1"));
		productdb.put("삼성", plist1);
		plist2.addAll(Arrays.asList("커브드TV", "옵티무스G10", "시원에어컨2"));
		productdb.put("엘지", plist2);
		plist3.addAll(Arrays.asList("애플TV", "아이폰7S", "아이패드"));
		productdb.put("애플", plist3);
	}
	
	public void serach(){
		System.out.println("## 상품 검색 ##");
		System.out.println("# 제조사를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		
		String p = scan.next();
		
		ArrayList<String> result = (ArrayList<String>)productdb.get(p);
		if(result != null){
			for(String s:result){
				System.out.println(s);
			}
		}
		else
		{
			System.out.println("검색결과가 없습니다.");
			scan.close();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chapter9_3 app = new Chapter9_3();
		app.serach();
	}

}
