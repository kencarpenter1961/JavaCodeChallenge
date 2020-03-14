package com.mindex.challenge.service;

import com.mindex.challenge.data.Employee;
import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.data.CompensationRequest;


public interface EmployeeService {
    Employee create(Employee employee);
    Employee read(String id);
    Employee update(Employee employee);
	/** added fot task 2 */
	Compensation create(CompensationRequest compensationRequest);
	Compensation readCompensation(String id);
}
