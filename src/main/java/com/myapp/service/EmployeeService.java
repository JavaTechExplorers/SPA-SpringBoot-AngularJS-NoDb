package com.myapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.myapp.service.so.EmployeeSo;

@Component
public class EmployeeService {

    List<EmployeeSo> employeeInMemoryList = new ArrayList<>();

    public List<EmployeeSo> getData(EmployeeSo employeeSo) throws Exception {

	List<EmployeeSo> target = new ArrayList<>();

	for (EmployeeSo employeeEntity : employeeInMemoryList) {

	    if (employeeEntity != null) {

		EmployeeSo so = new EmployeeSo();
		so.setEmpName(employeeEntity.getEmpName());
		so.setEmpDesc(employeeEntity.getEmpDesc());
		so.setEmpGender(employeeEntity.getEmpGender());

		target.add(so);
	    }
	}

	return target;
    }

    public EmployeeSo save(EmployeeSo employeeSo) throws Exception {

	employeeInMemoryList.add(employeeSo);

	return employeeSo;
    }
}
