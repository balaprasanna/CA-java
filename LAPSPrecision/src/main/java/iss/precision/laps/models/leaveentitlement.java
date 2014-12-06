package iss.precision.laps.models;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@SuppressWarnings("serial")

@Entity
public class leaveentitlement implements Serializable{
	@EmbeddedId
	private leaveentitlementprimary type;
	
	int NoOfDays;
	
	public leaveentitlement()
	{
		
	}
	
	public leaveentitlement(String Role,String Leavetype)
	{
		this.type = new leaveentitlementprimary(Role, Leavetype);
	}
	
	public String getRole() {
		return type.getRole();}
	
	public String getLeaveType(String leaveType) {
		return type.getLeaveType();
	}
	public int getNoOfDays() {
		return NoOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		NoOfDays = noOfDays;
	}

	
}
