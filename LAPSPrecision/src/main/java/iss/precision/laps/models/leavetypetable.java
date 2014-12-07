package iss.precision.laps.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class leavetypetable {
	
	@Id
@Column(name="LeaveType")
	private String LeaveType;

	public String getLeaveType() {
		return LeaveType;
	}

	public void setLeaveType(String leaveType) {
		LeaveType = leaveType;
	}
	

}
