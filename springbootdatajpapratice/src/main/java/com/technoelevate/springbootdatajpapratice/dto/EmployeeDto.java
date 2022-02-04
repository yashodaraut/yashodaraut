package com.technoelevate.springbootdatajpapratice.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_details")
public class EmployeeDto {
	@Id
	@Column(name = "emp_id")
	private int eid;
	@Column(name = "emp_name")
	private String ename;
	@Column(name = "emp_pass")
	private String password;
	@Column(name = "emp_post")
	private String position;
	
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
}
