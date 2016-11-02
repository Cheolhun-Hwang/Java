package Week5;

class Bank{
double getInteresRate(){
	return 0.0;
}
}

class BadBank extends Bank{
	double getInteresRate(){
		return 10.0;
	}
}

class NormalBank extends Bank{
	double getInteresRate(){
		return 5.0;
	}
}

class GoodBank extends Bank{
	double getInteresRate(){
		return 3.0;
	}
}


public class BankTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BadBank b1 = new BadBank();
		NormalBank b2 = new NormalBank();
		GoodBank b3 = new GoodBank();
		
		System.out.println("BadBank 세율 : " + b1.getInteresRate());
		System.out.println("NormalBank 세율 : " + b2.getInteresRate());
		System.out.println("GoodBank 세율 : " + b3.getInteresRate());
	}

}
