package com.UST.Employee.EmployeeDemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UST.Employee.EmployeeDemo.Model.USTemployee;

/**
 * @author Administrator
 *
 */


	/**
	 * @param args
	 */
	
@Repository
public interface USTemployeeRepo extends JpaRepository<USTemployee,String> {
	//JpaRepository - communicate with Database
	//Employee-model class
	//Integer-type of primary key ie,id
	

}


