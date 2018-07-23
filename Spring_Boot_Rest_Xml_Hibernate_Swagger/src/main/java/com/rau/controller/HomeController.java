package com.rau.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rau.dto.EmployeeDto;

@RestController
public class HomeController {
	
	@RequestMapping(value="/getEmployeeList",method=RequestMethod.GET)
	public List<EmployeeDto> retrive(String userName) {
		List<EmployeeDto> employeeDtoList = new ArrayList<EmployeeDto>();
		for(int i=1;i<5;i++) {
			EmployeeDto employeeDto = new EmployeeDto();
			employeeDto.setEmpId(i);
			employeeDto.setFirstName(i+"-firstName");
			employeeDto.setLastName(i+"-lastName");
			employeeDto.setAddress(i+"-address");
			employeeDto.setContactNumber(i+" -contactNumber");
			employeeDtoList.add(employeeDto);
		}
		
		return employeeDtoList;
	}
	
	@RequestMapping(value="/",method=RequestMethod.POST)
	public String retrive() {
		return "Welcome";
	}

}
