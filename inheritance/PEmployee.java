package com.marlabs.inheritance;

public class PEmployee extends Employee {
	double empBasic;
	double empCommission;

	/**
	 * @param empNumber
	 * @param empName
	 * @param empDesignation
	 * @param empPassword
	 * @param empDeptNumber
	 * @param empBasic
	 * @param empCommission
	 */
	public PEmployee(int empNumber, String empName, String empDesignation, String empPassword, int empDeptNumber,
			double empBasic, double empCommission) {
		super(empNumber, empName, empDesignation, empPassword, empDeptNumber);
		this.empBasic = empBasic;
		this.empCommission = empCommission;
	}

	private double doSalaryCalculation() {
		double takeHomeSalary = 0.0d;
		if (empDeptNumber == 1) {
			takeHomeSalary = Math.round(empBasic + empBasic * 0.05 + empCommission);
		} else if (empDeptNumber == 2) {
			takeHomeSalary = Math.round(empBasic + empBasic * 0.15 + empCommission);
		} else {
			takeHomeSalary = Math.round(empBasic + empCommission);
		}
		return takeHomeSalary;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.marlabs.inheritance.Employee#displayEmployeeDetail()
	 */
	@Override
	public void displayEmployeeDetail() {
		super.displayEmployeeDetail();
		System.out.println("Employee Basic Salary: " + "\t" + empBasic);
		System.out.println("Employee Commission: " + "\t" + empCommission);
		System.out.println("Employee Take Home Salary: " + "\t" + doSalaryCalculation());

	}

}
