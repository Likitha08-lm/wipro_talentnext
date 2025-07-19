package abstraction;
import java.util.*;
	abstract class Compartment {
	    public abstract String notice();
	}
	class FirstClass extends Compartment {
	    public String notice() {
	        return "First Class Compartment: Reserved for first-class passengers only.";
	    }
	}
	class Ladies extends Compartment {
	    public String notice() {
	        return "Ladies Compartment: Reserved for female passengers only.";
	    }
	}
	class General extends Compartment {
	    public String notice() {
	        return "General Compartment: Open to all passengers.";
	    }
	}
	class Luggage extends Compartment {
	    public String notice() {
	        return "Luggage Compartment: For storing luggage and parcels.";
	    }
	}
public class Question1 {
 public class TestCompartment {
	    public static void main(String[] args) {
	        Compartment[] compartments = new Compartment[10];
	        Random random = new Random();

	        for (int i = 0; i < 10; i++) {
	            int randomNumber = random.nextInt(4) + 1; 

	            switch (randomNumber) {
	                case 1:
	                    compartments[i] = new FirstClass();
	                    break;
	                case 2:
	                    compartments[i] = new Ladies();
	                    break;
	                case 3:
	                    compartments[i] = new General();
	                    break;
	                case 4:
	                    compartments[i] = new Luggage();
	                    break;
	            }
	            System.out.println("Compartment " + (i + 1) + ": " + compartments[i].notice());
	        }
	    }
	}
}

