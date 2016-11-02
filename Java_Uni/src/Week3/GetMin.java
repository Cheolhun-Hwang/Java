package Week3;

public class GetMin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s[] = {12,3,19,6,18,8,12,4,1,19};
		int min;
		
		min = s[0];
		
		for(int i=0;i<s.length;i++){
			if(s[i]<min){
				min=s[i];
			}
		}
		System.out.println("최소값은 " + min + "입니다.");
	}

}
