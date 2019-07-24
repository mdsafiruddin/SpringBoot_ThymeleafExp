package com.app.model;

public class Employee {
 private Integer empId;
 private String empName;
 private Double empSal;
 private String empAddr;
 
 public Employee() {
	System.out.println("employee object");
}

public Integer getEmpId() {
	return empId;
}

public void setEmpId(Integer empId) {
	this.empId = empId;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public Double getEmpSal() {
	return empSal;
}

public void setEmpSal(Double empSal) {
	this.empSal = empSal;
}

public String getEmpAddr() {
	return empAddr;
}

public void setEmpAddr(String empAddr) {
	this.empAddr = empAddr;
}

public Employee(Integer empId, String empName, Double empSal, String empAddr) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empSal = empSal;
	this.empAddr = empAddr;
}

@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empAddr=" + empAddr + "]";
}
 
 
}
