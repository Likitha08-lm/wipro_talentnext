package oops_fundamentals;

public class Question10 {
	public class StringManipulation {
	    public static String removeXFromEdges(String str) {
	        if (str.startsWith("x")) {
	            str = str.substring(1);
	        }
	        if (str.endsWith("x")) {
	            str = str.substring(0, str.length() - 1);
	        }
	        return str;
	    }

	    public static void main(String[] args) {
	        System.out.println(removeXFromEdges("xHix"));     
	        System.out.println(removeXFromEdges("America")); 
	    }
	}

}