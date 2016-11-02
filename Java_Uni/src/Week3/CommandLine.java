package Week3;

public class CommandLine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length > 0){
			for(int i=0; i<args.length;i++){
				System.out.println(" " + args[i]);
			}
			
			if(args[0].equals("-h")){
				System.out.println("HELP ");
			}
		}
	}

}
