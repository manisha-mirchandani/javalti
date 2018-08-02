package lti.reflect;

public class Person implements Cloneable {
	private String name;
	private int age;

	public Person() {
		this("anaoymous", -1);
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void print() {
		System.out.println("Name " + name + "\tAge :" + age);
	}

	@Override
	public String toString() {
		return "Name " + name + "\tAge :" + age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;
			if (this.name.equals(p.name) && age == p.age)
				return true;

		}
		return false;
	}

	@Override
	public void finalize() throws Throwable {
		System.out.println("Person is no more");
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		 // p1=new Person("mansha", 21);
		// p1.print();
		//
		// Person p2=new Person("mansha",21);
		// System.out.println(p1.equals(p2));
		//
		// System.out.println(p1.hashCode());
		// System.out.println(p1);
		//
		// System.out.println(p2.hashCode());

//		Person P = null;
//		for (int c = 1; c <= 5; c++)
//			P = new Person();
//		System.gc();
		
		Person p1 = new Person("jen",9);
		Person pc = (Person) p1.clone();
		System.out.println(pc);
	}

}
