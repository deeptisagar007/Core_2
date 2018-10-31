package com.marlabs.staticAndInstance;

public class SingleTonExampleDemo {
	public static void main(String[] args) {
		MainSingleTon object1 = MainSingleTon.getInstance();
		System.out.println(object1);
		MainSingleTon object2 = MainSingleTon.getInstance();
		System.out.println(object2);
	}
}
