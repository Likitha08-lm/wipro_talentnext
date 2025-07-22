package oops_fundamentals;

public class Question7 {

    public static String getFirstHalf(String str) {
        if (str.length() % 2 == 0) {
            return str.substring(0, str.length() / 2);
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(getFirstHalf("TomCat")); 
        System.out.println(getFirstHalf("Apron"));    
    }
}
