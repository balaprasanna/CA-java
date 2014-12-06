package iss.precision.laps.models;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class leaveapplication {
	
	
	@Id
	private String LeaveAplicationID;
	private String UID;
	private Date StartTime;
	private Date EndTime;
	private String LeaveType;
	private String Reason;
	private String Remarks;
	private String WorkDissemination;
	private BigInteger ContactNumber;
	private String Status;


	
	public String getLeaveAplicationID() {
		return LeaveAplicationID;
	}
	public void setLeaveAplicationID(String leaveAplicationID) {
		LeaveAplicationID = leaveAplicationID;
	}
	public String getUID() {
		return UID;
	}
	public void setUID(String uID) {
		UID = uID;
	}
	public Date getStartTime() {
		return StartTime;
	}
	public void setStartTime(Date startTime) {
		StartTime = startTime;
	}
	public Date getEndTime() {
		return EndTime;
	}
	public void setEndTime(Date endTime) {
		EndTime = endTime;
	}
	public String getLeaveType() {
		return LeaveType;
	}
	public void setLeaveType(String leaveType) {
		LeaveType = leaveType;
	}
	public String getReason() {
		return Reason;
	}
	public void setReason(String reason) {
		Reason = reason;
	}

	public String getRemarks() {
		return Remarks;
	}
	public void setRemarks(String remarks) {
		Remarks = remarks;
	}
	public String getWorkDissemination() {
		return WorkDissemination;
	}
	public void setWorkDissemination(String workDissemination) {
		WorkDissemination = workDissemination;
	}
	public Number getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(BigInteger contactNumber) {
		ContactNumber = contactNumber;
	}

	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}



}
