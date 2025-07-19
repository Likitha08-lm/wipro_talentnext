package abstraction;


	class InvalidCountryException extends Exception {
		public InvalidCountryException() {
			super("User Outside India cannot be registered");
		}

		public InvalidCountryException(String message) {
			super(message);
		}
	}
	class UserRegistration {
	    void registerUser(String username, String userCountry) throws InvalidCountryException {
	        if (!userCountry.equalsIgnoreCase("India")) {
	            throw new InvalidCountryException("User Outside India cannot be registered");
	        } else {
	            System.out.println("User registration done successfully");
	        }
	    }
	} 
public class Question8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserRegistration registration = new UserRegistration();
        try {
            registration.registerUser("Mickey", "US");
        } catch (InvalidCountryException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        try {
            registration.registerUser("Mini", "India");
        } catch (InvalidCountryException e) {
            System.out.println("Exception: " + e.getMessage());
        }
	}
}	
