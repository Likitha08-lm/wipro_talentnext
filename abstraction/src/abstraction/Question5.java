package abstraction;
import java.util.*;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int[] array = null;
        try {
            System.out.println("Enter the number of elements in the array");
            int size = Integer.parseInt(scanner.nextLine());  
            array = new int[size];
            System.out.println("Enter the elements in the array");
            for (int i = 0; i < size; i++) {
                array[i] = Integer.parseInt(scanner.nextLine()); 
            }
            System.out.println("Enter the index of the array element you want to access");
            int index = Integer.parseInt(scanner.nextLine()); 
            System.out.println("The array element at index " + index + " = " + array[index]);
            System.out.println("The array element successfully accessed");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        } 
        catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException");
        }
	}
}
