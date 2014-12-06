package iss.precision.laps.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;



@SuppressWarnings("serial")
@Entity 
public class compensation implements Serializable{
	@EmbeddedId

	private	compensationprimary cp;
	
	private String Reason;
	private String Remarks;
	private int Status;

	public compensation()
	{
		
	}

	public compensation(String UID,Date StartTime ,Date Endtime)
	{
		this.cp= new compensationprimary(UID, StartTime, Endtime);
	}
	
	

	public String getUID() {
		return cp.getUID();
	}

	public Date getStartTime() {
		return cp.getStartTime();
	}

	public Date getEndTime() {
		return cp.getEndTime();
	}


	public String getReason() {
		return Reason;
	}
	public void setReason(String reason) {
		Reason = reason;
	}
	public Number getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}

	public String getRemarks() {
		return Remarks;
	}

	public void setRemarks(String remarks) {
		Remarks = remarks;
	}
}
