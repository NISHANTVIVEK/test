package com.capgemini;

public class Employee {
	private int employeeId,employeeAge;
	private double employeeSalary;
	private String employeeName,businessunit;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeAge=" + employeeAge + ", employeeSalary="
				+ employeeSalary + ", employeeName=" + employeeName + ", businessunit=" + businessunit + "]";
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getBusinessunit() {
		return businessunit;
	}
	public void setBusinessunit(String businessunit) {
		this.businessunit = businessunit;
	}
	

}
