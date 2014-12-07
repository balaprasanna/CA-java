package iss.precision.laps.services;

import iss.precision.laps.models.leaveapplication;
import iss.precision.laps.models.leavetable;
import iss.precision.laps.models.leavetypetable;

import java.util.List;

public interface staffService {
	
// to fetcch all the leave types in db
public List<leavetypetable> getAllLeaveType();

// to be user to insert a new leave application in databsae. 
public leavetable createleaveApplicationEntry(leavetable lv);

//to be user to update a new leave application in databsae.
public leavetable updateleaveApplicationEntry(leavetable lv);



// to be used to fetch all the history leave for the specific user..{key is the user id}
public List<leavetable> collectAllApplicationsHistoryByThisUser(String key);

//to be used to fetch all the applied leave for the specific user ..{key is the user id}
public List<leavetable> collectAllApplicationsAppliedByThisUser(String uid,String Status0);

public leavetable findleaveRecord(int lid);
}
