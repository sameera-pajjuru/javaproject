package org.jsp.app;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;


@Entity
@NamedQuery(name="rt", query = "select e.empName,e.empDesignation from EmployeeInfo e where e.empId=:xy")
public class EmployeeInfo implements Serializable {
	
	private String empName;   
	@Id
	private int empId;
	private double empSalary;
	private String empDesignation;
	private static final long serialVersionUID = 1L;

	public EmployeeInfo() {
		super();
	}   
	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}   
	public int getEmpId() {
		return this.empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}   
	public double getEmpSalary() {
		return this.empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}   
	public String getEmpDesignation() {
		return this.empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
   
}
