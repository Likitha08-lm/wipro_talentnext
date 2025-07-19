package wrapperclass;
import java.util.*;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 255:");
        int number = scanner.nextInt();
        if (number < 1 || number > 255) {
            System.out.println("Invalid input. Please enter a number between 1 and 255.");
        } else {
            String binary = Integer.toBinaryString(number);
            String paddedBinary = String.format("%8s", binary).replace(' ', '0');
            System.out.println(paddedBinary);
        }
	}

}
