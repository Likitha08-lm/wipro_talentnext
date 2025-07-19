package abstraction;


	class InvalAge extends Exception {
	    public InvalAge(String message) {
	        super(message);
	    }
	}
public class Question7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            if (args.length != 2) {
                throw new IllegalArgumentException("Please provide exactly 2 arguments: name and age.");
            }
            String name = args[0];
            int age;
            try {
                age = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Age must be a valid integer.");
            }
            if (age < 18 || age >= 60) {
                throw new InvalAge("Age must be >= 18 and < 60.");
            }
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);

        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalAge e) {
            System.out.println("InvalidAgeException: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
