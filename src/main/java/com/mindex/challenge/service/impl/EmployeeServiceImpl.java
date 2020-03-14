package com.mindex.challenge.service.impl;

import com.mindex.challenge.dao.EmployeeRepository;
import com.mindex.challenge.data.Employee;
import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.data.CompensationRequest;

import com.mindex.challenge.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static final Logger LOG = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee create(Employee employee) {
        LOG.debug("Creating employee [{}]", employee);

        employee.setEmployeeId(UUID.randomUUID().toString());
        employeeRepository.insert(employee);

        return employee;
    }

    @Override
    public Employee read(String id) {
        LOG.debug("Reading employee with id [{}]", id);

        Employee employee = employeeRepository.findByEmployeeId(id);

        if (employee == null) {
            throw new RuntimeException("Invalid employeeId: " + id);
        }

        return employee;
    }
	
    @Override
    public Employee update(Employee employee) {
        LOG.debug("Updating employee [{}]", employee);

        return employeeRepository.save(employee);
    }
	
/** added for task 2 **/
    @Override
    public Compensation create(CompensationRequest compensationRequest) {
        LOG.debug("Creating compensationRequest [{}]", compensationRequest);
	
		String id = compensationRequest.getEmployeeId();
		String salary = compensationRequest.getSalary();
		String effectiveDate = compensationRequest.getEffectiveDate();
		
		Employee employee = employeeRepository.findByEmployeeId(id);
		
		if (employee == null) {
            throw new RuntimeException("Invalid employeeId: " + id);
        }		
		Compensation compensation = new Compensation(employee,salary,effectiveDate);
        return compensation;
    }
	
	@Override
    public Compensation readCompensation(String id) {
        LOG.debug("Reading compensation with id [{}]", id);

        Compensation compensation = Compensation.getCompensationById(id);

        if (compensation == null) {
            throw new RuntimeException("Compensation not found, employeeId: " + id);
        }

        return compensation;
    }
}
