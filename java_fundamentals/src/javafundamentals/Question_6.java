package javafundamentals;
import java.util.*;

public class Question_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character");
        char code = sc.next().charAt(0); 
        switch(Character.toUpperCase(code)) {
        case 'R':
        	System.out.println("Red");
        	break;
        case 'B' :
        	System.out.println("Blue");
        	break;
        case 'G' :
        	System.out.println("Green");
        	break;
        case 'O' :
        	System.out.println("Orange");
        	break;
        case 'Y' :
        	System.out.println("Yellow");
        	break;
        case 'W' :
        	System.out.println("White");
        	break;
        	default :
        		System.out.println("Invalid code");
        }
	}
}
