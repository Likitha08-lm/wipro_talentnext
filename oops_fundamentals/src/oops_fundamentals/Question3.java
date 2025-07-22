package oops_fundamentals;

//public class Question3 {
class Person {
	    String name;
//	   Person(String name) {
//	        this.name = name;
//	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	}

class Employee extends Person {
		 String Empname;
	     double annualSalary;
	      int yearStarted;
	     String nationalInsuranceNumber;
	    public void setEmployee(String Empname, double annualSalary, int yearStarted, String nationalInsuranceNumber) {
	    	this.Empname=Empname;
	        this.annualSalary = annualSalary;
	        this.yearStarted = yearStarted;
	        this.nationalInsuranceNumber = nationalInsuranceNumber;
	    }
	   
	    public String getEmpname() {
	    	return Empname;
	    }
	    public double getAnnualSalary() {
	        return annualSalary;
	    }
	   
	    public int getYearStarted() {
	        return yearStarted;
	    }
	   
	    public String getNationalInsuranceNumber() {
	        return nationalInsuranceNumber;
	    }
	 }
	//}
	public class Question3{
	public class TestEmployee {
	    public static void main(String[] args) {
	        Employee employee = new Employee();
	        employee.setEmployee("Likitha", 50000.0, 2025, "AB852005");
	        System.out.println("Employee Name: " + employee.getEmpname());
	        System.out.println("Annual Salary: " + employee.getAnnualSalary());
	        System.out.println("Year Started: " + employee.getYearStarted());
	        System.out.println("National Insurance Number: " + employee.getNationalInsuranceNumber());
//	        employee.setAnnualSalary=55000.0;
	        System.out.println("Updated Annual Salary: " + employee.getAnnualSalary());
	    }
	}
}
