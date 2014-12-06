package iss.precision.laps.models;

import java.util.*;

import javax.persistence.*;


@Entity
@Table(name="UserProfile")
public class userprofile {
	
	@Id
	@Column(name="UID")
	private String UID;
	@Column(name="Name")
	private String Name;
	@Column(name="DOB")
	private Date DOB;
	@Column(name="EmailID")
	private String EmailID;
	@Column(name="DepartmentID")
	private String DepartmentID;
	@Column(name="ReportsTo")
	private String ReportsTo;
	@Column(name="Role")
	private String Role;
	@Column(name="Password")
	private String Password;
	@Column(name="Status")
	private int Status;
	@Column(name="CompensationHours")
	private int CompensationHours;

	
	public String getDepartment() {
		return UID;
	}
	public void setDepartment(String department) {
		UID = department;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getEmailID() {
		return EmailID;
	}
	public void setEmailID(String emailID) {
		EmailID = emailID;
	}
	public String getDepartmentID() {
		return DepartmentID;
	}
	public void setDepartmentID(String departmentID) {
		DepartmentID = departmentID;
	}
	public String getReportsID() {
		return ReportsTo;
	}
	public void setReportsID(String reportsID) {
		ReportsTo = reportsID;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Number getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
	public int getCompensationHours() {
		return CompensationHours;
	}
	public void setCompensationHours(int compensationHours) {
		CompensationHours = compensationHours;
	}

}
