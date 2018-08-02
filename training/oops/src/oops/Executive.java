package oops;

public class Executive extends Employee {
	public double bonus;

	public Executive() {
	}

public Executive(String empName, double salary,double bonus) {
super(empName,salary);
this.bonus=bonus;}

	@Override
	public void payslip() {
		super.payslip();
		System.out.println("bonus" + bonus);
	}

	@Override
	public double getSalary() {
		return super.getSalary() + bonus;
	}
}
