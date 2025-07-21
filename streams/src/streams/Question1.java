package streams;
import java.io.*;
import java.util.Date;

public class Question1 {
	public class EmployeeSerializationDemo{
	static class Employee implements Serializable {
		private static final long serialVersionUID = 1L;

		private String name;
		private Date dateOfBirth;
		private String department;
		private String designation;
		private double salary;
		public Employee() {}
		public Employee(String name, Date dateOfBirth, String department, String designation, double salary) {
			this.name = name;
			this.dateOfBirth = dateOfBirth;
			this.department = department;
			this.designation = designation;
			this.salary = salary;
		}
		public String getName() { return name; }
		public void setName(String name) { this.name = name; }
		public Date getDateOfBirth() { return dateOfBirth; }
		public void setDateOfBirth(Date dateOfBirth) { this.dateOfBirth = dateOfBirth; }
		public String getDepartment() { return department; }
		public void setDepartment(String department) { this.department = department; }
		public String getDesignation() { return designation; }
		public void setDesignation(String designation) { this.designation = designation; }
		public double getSalary() { return salary; }
		public void setSalary(double salary) { this.salary = salary; }
		public String toString() {
			return "Name: " + name +
					"\nDate of Birth: " + dateOfBirth +
					"\nDepartment: " + department +
					"\nDesignation: " + designation +
					"\nSalary: " + salary;
		}
	}
	public static void main(String[] args) {
		Employee emp = new Employee("Anitha", new Date(96, 4, 24), "HR", "Manager", 65000.0);
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data"))) {
			oos.writeObject(emp);
			System.out.println("Employee object serialized to file 'data'.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data"))) {
			Employee deserializedEmp = (Employee) ois.readObject();
			System.out.println("\nDeserialized Employee object:");
			System.out.println(deserializedEmp);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	}
}
