package iss.precision.laps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import iss.precision.laps.models.leaveapplication;
import iss.precision.laps.models.leavetable;

public interface LeaveApplicationRepository extends JpaRepository<leavetable,Integer> {

	//@Query("SELECT s.UID,s.StartTime,s.EndTime,s.ContactNumber,s.LeaveType,s.Reason,s.Status FROM leaveapplication s where s.UID = :n")
	
/*@Query("SELECT s FROM leaveapplication s where s.UID = :n")
public List<leaveapplication> getAllAppliedApplicationsForTheUser(@Param("n") String key);*/

@Query("SELECT s FROM leavetable s where s.UID = :n")
public List<leavetable> collectAllApplicationsHistoryByThisUser(@Param("n") String key);

@Query("SELECT s FROM leavetable s where s.status = :m and s.UID = :n")
public List<leavetable> getAllAppliedApplicationsForTheUser(@Param("n") String uid,@Param("m") String status);

@Query("SELECT s FROM leavetable s where s.lid = :n")
public leavetable findLeaveRecord(@Param("n") int lid);

}