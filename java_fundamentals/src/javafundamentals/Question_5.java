package javafundamentals;

public class Question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 char ch = args[0].charAt(0); 

	        if (ch >= 'a' && ch <= 'z'){
	            System.out.println("Alphabet");
	        } else if (ch >= '0' && ch <= '9') {
	            System.out.println("Digit");
	        } else {
	            System.out.println("Special Character");
	        }

	}

}
