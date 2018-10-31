package com.marlabs.staticAndInstance;

public class StaticDemo2 {
	static int b;

	public void instanceMethodOne() {
		System.out.println("In Instance Method One");
	}

	public void instanceMethodTwo() {
		System.out.println("In Instance Method Two");

		System.out.println(
				"Rule 2: Can directly(without className) call one instance method inside another instance method of same class");
		instanceMethodOne();

		System.out.println(
				"Rule 3: Can directly(without className) call static methods inside any instnce method of same class");
		staticMethodOne();

		System.out
				.println("Rule 4: Can call static method of different class with syntax as className.staticMethodName");
		System.out.println("Link randomMethod of Math class: " + Math.random());
	}

	public static void staticMethodOne() {
		System.out.println("In Static Method One");
	}

	public StaticDemo2() {
		System.out.println("StaticDemo2 Const");
	}

	{
		System.out.println("Instance Block 1");
	}

	public static void main(String[] args) {
		System.out.println("Main Start");
		System.out.println("Rule 1: Can call instanceMethod with syntax as objectName.instanceMethodName");
		StaticDemo2 objName = new StaticDemo2();
		objName.instanceMethodOne();
		objName.instanceMethodTwo();
		System.out.println("Rule 5: Can directly call one static Method inside of another Static Method of same class");
		staticMethodOne();
		System.out.println("Main End");
	}

	static {
		System.out.println("First Static Block");
		System.out.println("B variable value: " + b);
		b = 201;
	}
	static {
		System.out.println("Second Static Block");
		Demo demo = new Demo();
		demo.init(101);
		demo.display();
		System.out.println("B variable value: " + b);
	}
	static {
		System.out.println("Main starts after execution of all the static Blocks");
	}

	{
		System.out.println("Instance Block 2");
	}
}
