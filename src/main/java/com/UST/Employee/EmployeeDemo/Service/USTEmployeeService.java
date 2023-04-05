/**
 * 
 */
package com.UST.Employee.EmployeeDemo.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UST.Employee.EmployeeDemo.Model.USTemployee;
import com.UST.Employee.EmployeeDemo.Repository.USTemployeeRepo;



/**
 * @author Administrator
 *
 */
@Service
public class USTEmployeeService {
	@Autowired
	private USTemployeeRepo repo;

	public USTemployee createEmployee(USTemployee employee) {
		
		return repo.save(employee);
	}

}