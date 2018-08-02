package lti.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class DynamicReflection {

	public static void main(String[] args) throws Exception {
		String qcn = "lti.reflect.Customer";

		// Manually loading the class
		Class custClass = Class.forName(qcn);

		// getting the parameterised constructor
		Constructor custConst = custClass.getConstructor(String.class);

		// instantiating with parameterised constructor
		Object obj = custConst.newInstance("jenate");
		System.out.println(obj);
		
		//getting private method of class
		Method printMethod = custClass.getDeclaredMethod("print",null);
		
		//calling print method on customer object
		printMethod.setAccessible(true);
		printMethod.invoke(obj,null);
	}

}
