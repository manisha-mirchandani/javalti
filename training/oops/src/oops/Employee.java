package oops;

public abstract class Employee {
	private int empNo;
	private String empName;
	private double salary;
	
	private static int autogen;
	
	static {
		System.out.println("employee clss loaded");
		autogen = 1001;
	}

	public Employee() {

	}

	public Employee(String empName, double salary) {
		this.empNo = autogen ++;
		this.empName = empName;
		this.salary = salary;
	}

	public void payslip()
		{
			System.out.println("emp no : "+ empNo);
			System.out.println("emp name : "+ empName);
			System.out.println("emp salary : "+ salary);
		}

	public double getSalary() {
		return salary;
	}

}
