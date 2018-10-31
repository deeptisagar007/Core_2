package com.marlabs.inheritance;

public class InheritanceDemo {
	public static void main(String[] args) {
		System.out.println("Main Start");
		System.out.println("************************************************************");
		System.out.println("PEmployee");
		PEmployee pEmployee = new PEmployee(1, "Deepti", "Java Trainee", "Pass", 10, 3500, 500);
		pEmployee.displayEmployeeDetail();
		pEmployee.setEmpPassword("Pass2");
		pEmployee.displayEmployeeDetail();
		System.out.println("************************************************************");
		System.out.println("CEmployee");
		CEmployee cEmployee = new CEmployee(2, "Deepti2", "Java Developer", "Pass", 1, 300, 350);
		cEmployee.displayEmployeeDetail();
		cEmployee.setEmpPassword("Pass3");
		cEmployee.displayEmployeeDetail();
		System.out.println("Main Ends");
	}
}
