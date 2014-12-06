package iss.precision.laps.models;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class keymanagement {
	
	@Id
	private String KeyName;
	private String VALUE;
	
	public String getKeyname() {
		return KeyName;
	}
	public void setKeyname(String keyName) {
		KeyName = keyName;
	}
	public String getValue() {
		return VALUE;
	}
	public void setValue(String value) {
		VALUE = value;
	}
	

}
