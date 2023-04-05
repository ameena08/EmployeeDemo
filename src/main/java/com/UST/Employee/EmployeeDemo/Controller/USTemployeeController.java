/**
 * 
 */
package com.UST.Employee.EmployeeDemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UST.Employee.EmployeeDemo.Model.USTemployee;
import com.UST.Employee.EmployeeDemo.Service.USTEmployeeService;

/**
 * @author Administrator
 *
 */

		@RestController
		@RequestMapping("/ustemp/registration")
		@CrossOrigin("*")
		public class USTemployeeController {
			@Autowired
			private USTEmployeeService employeeService;
			
			@PostMapping("/addustemps")
			public USTemployee addEmployee(@RequestBody USTemployee employee) {
				return employeeService.createEmployee(employee);
			}

}

