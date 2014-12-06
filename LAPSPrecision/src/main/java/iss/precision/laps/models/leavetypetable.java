package iss.precision.laps.models;

import javax.persistence.Id;

public class leavetypetable {
	
	@Id
	private String	LeaveType;

	public String getLeaveType() {
		return LeaveType;
	}

	public void setLeaveType(String leaveType) {
		LeaveType = leaveType;
	}
	

}
