package Week3;

import java.util.Arrays;

public class SortExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int size = 10;
		int[] number = new int[size];
		
		for(int i = 0;i<size ; i++){
			int r= (int) (Math.random()*100);
			number[i] = r;
		}
		
		System.out.print("최초의 리스트 :");
		for(int r:number){
			System.out.print(r+ " ");
		}
		Arrays.sort(number);
		
		System.out.print("\n정렬된 리스트 : ");
		for(int r: number){
			System.out.print(r + " ");
		}
	}

}
