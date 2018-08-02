package lti.reflect;

public class EventImp1 implements Event {

	@Override
	public void doSomething() {
		System.out.println("First Event Implementation");
	}

	class InnerEventImp1 implements Event {
		@Override
		public void doSomething() {
			System.out.println("Second Event Implements");
		}
	}

	public void doingSomething()
	{
		class InnerMostImp1 implements Event {
			@Override
			public void doSomething() {
				System.out.println("third Event Implementation");
			}
		}
		;
		new InnerEventImp1().doSomething();
	}

	public void doingsomthingAgain() {
		new Event() {
		 public void doSomething(){
			System.out.println("Fourth Implementation");
		}
		}.doSomething();
	}
	
	public void doingSomeThingOneLastTime() {
		Event e=()->System.out.println("Fifth EVent Implementation");
		e.doSomething();
		
	}
	public static void main(String[] args) {
		EventImp1 imp1 = new EventImp1();
		imp1.doSomething();
		 InnerEventImp1 innerimp1 = imp1.new InnerEventImp1();

//		InnerEventImp1 innerimp1 = new EventImp1.InnerEventImp1();

		innerimp1.doSomething();
		
		imp1.doingSomething();
		imp1.doingsomthingAgain();
		imp1.doingSomeThingOneLastTime();
	}

}
