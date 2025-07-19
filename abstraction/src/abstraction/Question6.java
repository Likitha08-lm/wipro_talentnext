package abstraction;
import java.util.*;

	class NegativeValueException extends Exception {
	    public NegativeValueException(String message) {
	        super(message);
	    }
	}
	class OutOfRangeException extends Exception {
	    public OutOfRangeException(String message) {
	        super(message);
	    }
	}
public class Question6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int numberOfStudents = 2;
        for (int i = 1; i <= numberOfStudents; i++) {
            try {
                System.out.println("Enter name of student " + i + ":");
                String name = scanner.nextLine();
                int[] marks = new int[3];
                int total = 0;
                for (int j = 0; j < 3; j++) {
                    System.out.println("Enter mark " + (j + 1) + " for " + name + ":");
                    String input = scanner.nextLine();
                    int mark;
                    try {
                        mark = Integer.parseInt(input);
                    } catch (NumberFormatException e) {
                        throw new NumberFormatException("Invalid input! Please enter integer values.");
                    }
                    if (mark < 0) {
                        throw new NegativeValueException("Marks cannot be negative.");
                    }
                    if (mark > 100) {
                        throw new OutOfRangeException("Marks must be between 0 and 100.");
                    }
                    marks[j] = mark;
                    total += mark;
                }
                double average = total / 3.0;
                System.out.println("Average marks for " + name + ": " + average);
                System.out.println("----------------------------");
            } catch (NumberFormatException e) {
                System.out.println("java.lang.NumberFormatException: " + e.getMessage());
                System.out.println("Skipping this student due to invalid input.\n");
            } catch (NegativeValueException e) {
                System.out.println("NegativeValueException: " + e.getMessage());
                System.out.println("Skipping this student due to invalid input.\n");
            } catch (OutOfRangeException e) {
                System.out.println("OutOfRangeException: " + e.getMessage());
                System.out.println("Skipping this student due to invalid input.\n");
            }
        }
	}

}
