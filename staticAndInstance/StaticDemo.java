package com.marlabs.staticAndInstance;

class Demo {
	int a;
	static int b;

	void init(int a) {
		this.a = a;
	}

	void display() {
		System.out.println("A value is: " + a);
	}
}

public class StaticDemo {
	public static void main(String[] args) {
		System.out.println("Prog Start");

		System.out.println("b value is: " + Demo.b);
		Demo.b = 2000;

		Demo demo1 = new Demo();
		demo1.display();
		demo1.a = 100;
		demo1.display();

		Demo demo2 = new Demo();
		demo2.display();
		demo2.init(Demo.b);
		demo2.display();
		Demo.b = 1500;
		System.out.println("New b: " + Demo.b);
		System.out.println("Prog End");
	}
}
