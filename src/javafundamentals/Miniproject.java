package javafundamentals;

class Employeedetails {
	int empid;
	String empname;
	String dep;
	char c;
	int basic, HRA, IT;

	Employeedetails(int empid, String empname, String dep, char c, int basic, int HRA, int IT) {
		this.empid = empid;
		this.empname = empname;
		this.dep = dep;
		this.c = c;
		this.basic = basic;
		this.HRA = HRA;
		this.IT = IT;

	}
}
public class Miniproject {
		public static void main(String[] args) {
			if (args.length != 1) {
				System.out.println("enter valid id: ");
				return;
			}
			int id = Integer.parseInt(args[0]);
			Employeedetails[] empList = new Employeedetails[7];

			empList[0] = new Employeedetails(1001, "Ashish", "R&D", 'e', 20000, 8000, 3000);
			empList[1] = new Employeedetails(1002, "Suhma", "PM", 'c', 30000, 12000, 9000);
			empList[2] = new Employeedetails(1003, "Rahul", "Acct", 'k', 10000, 8000, 1000);
			empList[3] = new Employeedetails(1004, "Chahat", "Front Desk", 'r', 12000, 6000, 2000);
			empList[4] = new Employeedetails(1005, "Rajan", "Engg", 'm', 50000, 20000, 20000);
			empList[5] = new Employeedetails(1006, "Suman", "Manufacturing", 'e', 23000, 9000, 4400);
			empList[6] = new Employeedetails(1007, "Tanmay", "PM", 'c', 29000, 12000, 10000);

			boolean idfound = false;
			for (Employeedetails empno : empList) {
				if (empno.empid == id) {
					idfound = true;
					int da = 0;
					String designation = "";
					switch (empno.c) {
					case 'e':
						designation = "Engineer";
						da = 20000;
						break;
					case 'c':
						designation = "Consultant";
						da = 32000;
						break;
					case 'k':
						designation = "clerk";
						da = 12000;
						break;
					case 'r':
						designation = "Receptionist";
						da = 15000;
						break;
					case 'm':
						designation = "Manager";
						da = 40000;
						break;

					default:
						designation = "unknown";
						da = 0;
					}
					int salary = empno.basic + empno.HRA + da - empno.IT;
					System.out.println("emp no\tEmpname\t\tempDEP\t\tempdesignation\tempSalary");
					System.out.println(empno.empid + "\t" + empno.empname + "\t\t" + empno.dep + "\t\t" + designation
							+ "\t\t" + salary);
					break;
				}
			}
			if (!idfound) {
				System.out.println("no employee found with id " + id);
			

		}
	}

}
