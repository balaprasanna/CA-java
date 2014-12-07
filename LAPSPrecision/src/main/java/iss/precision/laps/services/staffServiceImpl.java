package iss.precision.laps.services;

import iss.precision.laps.models.leaveapplication;
import iss.precision.laps.models.leavetable;
import iss.precision.laps.models.leavetypetable;
import iss.precision.laps.repository.LeaveApplicationRepository;
import iss.precision.laps.repository.LeaveTypeTableRepository;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class staffServiceImpl implements staffService {

	@Resource
	private LeaveTypeTableRepository ltrep;
	@Resource
	private LeaveApplicationRepository lApprep;
	
	@Override
	public List<leavetypetable> getAllLeaveType() {
		// TODO Auto-generated method stub
		
		return ltrep.findAll();
	}

	@Override
	@Transactional
	public leavetable createleaveApplicationEntry(leavetable lv) {
		// TODO Auto-generated method stub
		lApprep.saveAndFlush(lv);
		return lv;
	}

	@Override
	public List<leavetable> collectAllApplicationsHistoryByThisUser(String key) {
		// TODO Auto-generated method stub
		List<leavetable> a = lApprep.collectAllApplicationsHistoryByThisUser(key);
		return a;
	}

	@Override
	public List<leavetable> collectAllApplicationsAppliedByThisUser(String uid,
			String Status) {
		// TODO Auto-generated method stub
	List<leavetable> a = lApprep.getAllAppliedApplicationsForTheUser(uid, Status);
		return a;
	}

	@Override
	public leavetable findleaveRecord(int lid) {
		// TODO Auto-generated method stub
		return lApprep.findLeaveRecord(lid);
	}

	@Override
	@Transactional
	public leavetable updateleaveApplicationEntry(leavetable lv) {
		// TODO Auto-generated method stub
		
		leavetable newobj=	lApprep.findOne(lv.getLid());
		newobj.setContactNumber(lv.getContactNumber());
		newobj.setEndtime(lv.getEndtime());
		newobj.setStarttime(lv.getStarttime());
		newobj.setLeavetype(lv.getLeavetype());
		newobj.setReason(lv.getReason());
		newobj.setRemarks(lv.getRemarks());
		newobj.setStatus(lv.getStatus());
		newobj.setWorkdissemination(lv.getWorkdissemination());
		lApprep.flush();
		return newobj;
	}

}
