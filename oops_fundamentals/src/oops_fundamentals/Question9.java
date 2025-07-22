package oops_fundamentals;

public class Question9 {
	public class StringManipulation {
	    public static String removeFirstAndLast(String str) {
	        if (str == null || str.length() <= 2) {
	        	return "";
	        }
	        return str.substring(1, str.length() - 1);
	    }
	    public static void main(String[] args) {
	        String input = "Suman";
	        String output = removeFirstAndLast(input);
	        System.out.println(output); 
	    }
}
}
