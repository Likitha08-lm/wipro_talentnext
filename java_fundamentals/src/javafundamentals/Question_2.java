package javafundamentals;

public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=2) {
			System.out.println("Please enter exactly two integers");
		}
		 try {
	            int num1 = Integer.parseInt(args[0]);
	            int num2 = Integer.parseInt(args[1]);
	            int sum = num1 + num2;

	            System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
	        } catch(Exception e) {
	        	System.out.println("Please enter valid integers.");
	        }

	}

}
