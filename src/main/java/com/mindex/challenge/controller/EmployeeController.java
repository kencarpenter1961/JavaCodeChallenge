package com.mindex.challenge.controller;

// modified for task 1 and task 2

import com.mindex.challenge.data.Employee;
import com.mindex.challenge.service.EmployeeService;
import com.mindex.challenge.data.ReportingStructure;
import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.data.CompensationRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    private static final Logger LOG = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public Employee create(@RequestBody Employee employee) {
        LOG.debug("Received employee create request for [{}]", employee);

        return employeeService.create(employee);
    }
	
    @GetMapping("/employee/{id}")
    public Employee read(@PathVariable String id) {
        LOG.debug("Receivedread  request for id [{}]", id);

        return employeeService.read(id);
    }

    @PutMapping("/employee/{id}")
    public Employee update(@PathVariable String id, @RequestBody Employee employee) {

        LOG.debug("Received update request for id [{}] and employee [{}]", id, employee);

        employee.setEmployeeId(id);
        return employeeService.update(employee);
    }
	
// added as part of task 1
	@GetMapping("/employee/reportingstructure/{id}")
    public ReportingStructure reportingStatus(@PathVariable String id) {
        LOG.debug("Received ReportingStructure request for id [{}]", id);
		
        return (new ReportingStructure(employeeService.read(id)));
    }
	
// added as part of task 2
	@PostMapping("/employee/compensation")
    public Compensation create(@RequestBody CompensationRequest compensationRequest) {
        LOG.debug("Received compensation create request for [{}]", compensationRequest);

		Compensation compensation = employeeService.create(compensationRequest);
		
        return compensation;
    }
	
	@GetMapping("/employee/compensation/{id}")
    public Compensation readCompensation(@PathVariable String id) {
        LOG.debug("Received compensation read request for id [{}]", id);
		
        return Compensation.getCompensationById(id);
    }

}