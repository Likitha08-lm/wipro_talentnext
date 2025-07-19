package wrapperclass;


	class Employee implements Cloneable {
	    String name;
	    int age;
	    double salary;
	    Employee(String name, int age, double salary) {
	        this.name = name;
	        this.age = age;
	        this.salary = salary;
	    }
	    public Object clone() throws CloneNotSupportedException {
	        return super.clone();
	    }
	    public void display() {
	        System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary);
	    }
	}
public class Question3 {
public class EmployeeCloneTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            Employee emp1 = new Employee("Alice", 30, 50000.0);
            Employee empClone = (Employee) emp1.clone();
            emp1.name = "Bob";
            emp1.age = 35;
            emp1.salary = 60000.0;
            System.out.println("Original Employee:");
            emp1.display();
            System.out.println("Cloned Employee:");
            empClone.display();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported");
        }
	
	}
}
}
