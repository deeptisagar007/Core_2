package com.marlabs.inheritance;

public class CEmployee extends Employee {
	double perDaySalary;
	float numberOfDays;

	/**
	 * @param empNumber
	 * @param empName
	 * @param empDesignation
	 * @param empPassword
	 * @param empDeptNumber
	 * @param perDaySalary
	 * @param numberOfDays
	 */
	public CEmployee(int empNumber, String empName, String empDesignation, String empPassword, int empDeptNumber,
			double perDaySalary, float numberOfDays) {
		super(empNumber, empName, empDesignation, empPassword, empDeptNumber);
		this.perDaySalary = perDaySalary;
		this.numberOfDays = numberOfDays;
	}

	private double doSalaryCalculation() {
		double takeHomeSalary = 0.0d;
		takeHomeSalary = Math.round(perDaySalary * numberOfDays);
		return takeHomeSalary;
	}

	@Override
	public void displayEmployeeDetail() {
		super.displayEmployeeDetail();
		System.out.println("Employee Per-Day Salary:" + "\t" + perDaySalary);
		System.out.println("Employee Worded-Day:" + "\t" + numberOfDays);
		System.out.println("Employee Per-Day Salary:" + "\t" + doSalaryCalculation());

	}

}
