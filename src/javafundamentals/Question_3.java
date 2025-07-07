package javafundamentals;

public class Question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=2) {
			System.out.println("Please enter exactly two integers");
		}
		int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        if (a%10 ==b % 10) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

	}

}
