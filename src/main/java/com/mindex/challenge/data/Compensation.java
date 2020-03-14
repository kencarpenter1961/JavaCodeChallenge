package com.mindex.challenge.data;

// added as part of task 2

import com.mindex.challenge.data.Employee;

import java.util.*; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Compensation {
	private static final Logger LOG = LoggerFactory.getLogger(Compensation.class);

	private Employee employee;
    private String salary;
	private String effectiveDate;
	
	private static HashMap<String, Compensation> store = new HashMap<String, Compensation>();
		
    public Compensation() {
    }
	
	public Compensation(Employee employee, String salary, String effectiveDate) {
		this.employee = employee;
		this.salary = salary;
		this.effectiveDate = effectiveDate;
		
		store.put(employee.getEmployeeId(),this);
    }
	
	public static Compensation getCompensationById(String employeeId) {
		LOG.debug("getCompensationById with {}", employeeId);
		
        if (employeeId == null) {
            throw new RuntimeException("Compensation null employeeId");
        }	

		Compensation compensation = store.get(employeeId);
		if (compensation == null) {
            throw new RuntimeException("Compensation was not found for employeeId: " + employeeId);
        }	
		return compensation;
		
	}
	
	public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
	
    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
		// salary is a number, if not a FormatNumberException is thrown
		if ( Integer.parseInt(salary) >= 0 ){
			this.salary = salary;
		} 
    }
	
	public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }
}
