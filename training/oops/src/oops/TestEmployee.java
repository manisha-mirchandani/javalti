package oops;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee("jenate", 5000);
		e1.payslip();

		Manager mgr = new Manager("manisha", 7000, 2000);
		showSalary(mgr);

		Executive exe = new Executive("manisha", 7000, 2000);
		showSalary(exe);
	}

	private static void showSalary(Employee e1) {
		if(e1 instanceof Manager)
		     System.out.println("manager salary" + e1.getSalary());
		else
			System.out.println("executive salary" + e1.getSalary());
	}
	
	
//	private static void showSalary(Executive exe) {
//		System.out.println("executive salary" + exe.getSalary());
//	}
//
//	private static void showSalary(Manager mgr) {
//		System.out.println("manager salary" + mgr.getSalary());
//	}

}
