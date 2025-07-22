package oops_fundamentals;

import java.util.Optional;

class InvalidEmployeeException extends Exception {
    public InvalidEmployeeException(String message) {
        super(message);
    }
}
 class Emp{
    String name;
    public Emp(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Employee Name: " + name);
    }
}
public class Question16 {
    public static void main(String[] args) {
        Emp emp = null;
        try {
            Emp result = Optional.ofNullable(emp)
                .orElseThrow(() -> new InvalidEmployeeException("Employee is invalid"));
            result.display();
        } catch (InvalidEmployeeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}