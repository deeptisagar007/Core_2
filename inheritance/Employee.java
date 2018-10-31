package com.marlabs.inheritance;

public class Employee {
	int empNumber;
	String empName;
	String empDesignation;
	private String empPassword;
	int empDeptNumber;

	/**
	 * @return the empPassword
	 */
	public String getEmpPassword() {
		return empPassword;
	}

	/**
	 * @param empPassword
	 *            the empPassword to set
	 */
	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

	/**
	 * @param empNumber
	 * @param empName
	 * @param empDesignation
	 * @param empPassword
	 * @param empDeptNumber
	 */
	public Employee(int empNumber, String empName, String empDesignation, String empPassword, int empDeptNumber) {
		this.empNumber = empNumber;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empPassword = empPassword;
		this.empDeptNumber = empDeptNumber;
	}

	public void displayEmployeeDetail() {
		System.out.println("**************************************");
		System.out.println("Employee Number:" + "\t" + empNumber);
		System.out.println("Employee Name:" + "\t" + empName);
		System.out.println("Employee Designation:" + "\t" + empDesignation);
		System.out.println("Employee Department Number" + "\t" + empDeptNumber);

	}

}
