package com.marlabs.inheritance;

public class SuperDemo1 {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		Demo1 demo1 = new Demo1();
		demo1.display();
		Demo1 demo2 = new Demo1(100);
		demo2.display();
		System.out.println("Main Ends");
	}
}

class Demo {
	int i;

	public Demo() {
		System.out.println("Demo Default construcor");
		i = 10;
	}

	public Demo(int i) {
		this.i = i;
		System.out.println("Parameterized Demo");
	}
}

class Demo1 extends Demo {
	int i;

	public Demo1() {
		System.out.println("Demo1 Default construcor");
		this.i = super.i;
	}

	public Demo1(int i) {
		super(201);
		this.i = i;
		System.out.println("Parameterized Demo1");
	}

	public void display() {
		System.out.println("Base class i variable value: " + super.i);
		System.out.println("Child class i variable value: " + i);
	}
}
