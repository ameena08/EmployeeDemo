/**
 * 
 */
package com.UST.Employee.EmployeeDemo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Administrator
 *
 */


	

	@Entity
	public class USTemployee {
		@Id
		
	
		private String name;
		private String email;
		private int experience;
		private String domain;
		public USTemployee() {
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getExperience() {
			return experience;
		}
		public void setExperience(int experience) {
			this.experience = experience;
		}
		public String getDomain() {
			return domain;
		}
		public void setDomain(String domain) {
			this.domain = domain;
		}
	

}
