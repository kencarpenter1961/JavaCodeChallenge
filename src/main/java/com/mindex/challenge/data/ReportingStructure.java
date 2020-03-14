package com.mindex.challenge.data;

// added for task 1

import com.mindex.challenge.data.Employee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReportingStructure {
	private static final Logger LOG = LoggerFactory.getLogger(ReportingStructure.class);

    private Employee employee;
    private int numberOfReports;

    public ReportingStructure(Employee employee	) {
		LOG.debug("ReportingStructure constructor called with employee");

		this.employee = employee;
		
		if ( employee.getDirectReports() == null ) {
			this.numberOfReports = 0;
		} else {
			this.numberOfReports = employee.getDirectReports().size();
		};
    }

	public Employee getEmployee() {
		LOG.debug("ReportingStructure getEmployee called");

        return this.employee;
    }

    public void setEmployee(Employee employee) {
		LOG.debug("ReportingStructure setEmployee called");
        this.employee = employee;
    }

    public int getNumberOfReports() {
		LOG.debug("ReportingStructure getNumberOfReports called");

        return numberOfReports;
    }

    public void setNumberOfReports(int numberOfReports) {
		LOG.debug("ReportingStructure setNumberOfReports called");

        this.numberOfReports = numberOfReports;
    }
}
