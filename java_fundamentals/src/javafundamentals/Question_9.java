package javafundamentals;
import java.util.*;

public class Question_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int n = num; n > 0; n /= 10) {
            sum += n % 10; 
        }
        System.out.println("Sum of digits of " + num + " is: " + sum);
	}

}
