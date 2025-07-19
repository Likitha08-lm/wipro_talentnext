package wrapperclass;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			if (args.length == 0) {
				System.out.println("Please provide an integer as a command line argument.");
				return;
			}
			int number = Integer.parseInt(args[0]);
			System.out.println(number);
			System.out.println(Integer.toBinaryString(number));
			System.out.println(Integer.toOctalString(number));
			System.out.println(Integer.toHexString(number));
		} catch (NumberFormatException e) {
			System.out.println("Invalid input. Please enter a valid integer.");
		}

	}

}
