package javafundamentals;
import java.util.*;

public class Question_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rev = 0;
        while(num>0) {
         int dig=num%10;
         rev=rev*10+dig;
         num=num/10;
        }
        System.out.print(rev);
	}

}
