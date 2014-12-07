package iss.precision.laps.services;
import iss.precision.laps.models.userprofile;
import iss.precision.laps.repository.UserProfileRepository;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class adminServiceImpl implements adminService {
	@Resource
	private UserProfileRepository userprofileRepository;

	@Override
	@Transactional
	public userprofile addUser(userprofile p) {

		userprofile added = p;
		return userprofileRepository.save(added);

	}

	@Override
	@Transactional
	public userprofile updateUser(userprofile p) {

		userprofile updated = userprofileRepository.findOne(p.getUID());

		if (updated == null)
			System.err.print("Null");

		updated.setUID(p.getUID());
		updated.setName(p.getName());
		updated.setDOB(p.getDOB());
		updated.setEmailID(p.getEmailID());
		updated.setDepartmentID(p.getDepartmentID());
		updated.setReportsTo(p.getReportsTo());
		updated.setRole(p.getRole());
		updated.setPassword(p.getPassword());
		updated.setStatus(p.getStatus());
		updated.setCompensationHours(p.getCompensationHours());
		userprofileRepository.flush();
		return updated;
	}

	@Override
	public List<userprofile> listUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public userprofile getUserById(String UID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public userprofile removeUser(String UID) {
		userprofile deleted = userprofileRepository.findOne(UID);

		if (deleted == null)
			System.err.print("Null");

		userprofileRepository.delete(deleted);
		return deleted;

	}

	@Override
	@Transactional
	public userprofile findById(String UID) {
		return userprofileRepository.findOne(UID);
	}

	@Override
	@Transactional
	public List<userprofile> findAll() {
		return userprofileRepository.findAll();
	}

	@Override
	@Transactional
	public userprofile findUsertByNames(String Name) {
		// TODO Auto-generated method stub
		return userprofileRepository.findOne(Name);
	}


}
