package oops_fundamentals;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "Wipro";
	        int n = 3;
	        String lastN = str.substring(str.length() - n);
	        String result = "";
	        for (int i = 0; i < n; i++) {
	            result += lastN;
	        }
	        System.out.println(result);
	}
}	
