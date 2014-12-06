package iss.precision.laps.models;

import java.io.Serializable;

import javax.persistence.Embeddable;
@SuppressWarnings("serial")
@Embeddable
public class leaveentitlementprimary implements Serializable {
	
	private String Role; 
	private String LeaveType;

	
	public leaveentitlementprimary()
	{
		
	}
	public 	leaveentitlementprimary(String role,String leavetype)
	{
		this.Role = role;
		this.LeaveType = leavetype;
	}
	
	public void setRole(String role) {
		Role = role;
	}
	public String getRole() {
		return Role;
	}
	
	public void setLeaveType(String leaveType) {
		LeaveType = leaveType;
	}
	public String getLeaveType() {
		return LeaveType;
	}
	

	public boolean equals (Object o)
	{
		return(  (o instanceof leaveentitlementprimary)&& Role.equals(((leaveentitlementprimary) o ).getRole() ) && LeaveType.equals(((leaveentitlementprimary) o ).getLeaveType())) ;                   
	}
	public int hashcode()
	{
		return Role.hashCode() + LeaveType.hashCode();
	}	
	
}
