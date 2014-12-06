package iss.precision.laps.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@SuppressWarnings("serial")
@Embeddable
public class compensationprimary implements Serializable {
	
		
	private String UID;
	private Date StartTime;
	private Date EndTime;
	
	public compensationprimary()
	{
		
	}

	public compensationprimary(String UID,Date StartTime ,Date Endtime)
	{
		this.UID=UID;
		this.StartTime= StartTime;
		this.EndTime= Endtime;
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
	
	
	public boolean equals (Object o)
	{
		return(  (o instanceof compensationprimary)&& UID.equals(((compensationprimary) o ).getUID() ) && StartTime.equals(((compensationprimary) o ).getStartTime()) &&EndTime.equals(((compensationprimary) o ).getEndTime())) ;                   
		
	}
	public int hashcode()
	{
		return UID.hashCode() + StartTime.hashCode()+EndTime.hashCode();
	}	
	
}
