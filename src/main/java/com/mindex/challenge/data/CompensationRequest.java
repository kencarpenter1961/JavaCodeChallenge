package com.mindex.challenge.data;

// added for task 2

import com.mindex.challenge.data.Employee;

import java.util.*; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CompensationRequest {
	private static final Logger LOG = LoggerFactory.getLogger(CompensationRequest.class);

	private String employeeId;
    private String salary;
	private String effectiveDate;
		
    public CompensationRequest() {
		LOG.debug("CompensationRequest constructor called");
    }
		
	public String getEmployeeId() {
		LOG.debug("CompensationRequest getEmployeeId called");

        return this.employeeId;
    }
	
    public void setEmployeeId(String employeeId) {
		LOG.debug("CompensationRequest setEmployeeId called with employeeId");

        this.employeeId = employeeId;
    }
	
    public String getSalary() {
		LOG.debug("CompensationRequest getSalary called");

        return salary;
    }

    public void setSalary(String salary) {
		LOG.debug("CompensationRequest setSalary called");

		// salary is a number, if not a NumberFormatException is thrown
		if ( Integer.parseInt(salary) >= 0 ){
			this.salary = salary;
		} else {
		}
    }
	
	public String getEffectiveDate() {
		LOG.debug("CompensationRequest getEffectiveDate called");

        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
		LOG.debug("CompensationRequest setEffectiveDate called");
        this.effectiveDate = effectiveDate;
    }
	
}
