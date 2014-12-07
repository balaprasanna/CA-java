package iss.precision.laps.services;

import java.util.List;

import iss.precision.laps.models.userprofile;

public interface adminService {

	 public userprofile addUser(userprofile p);
	 public userprofile updateUser(userprofile p);
	 public List<userprofile> listUsers();
	 public userprofile getUserById(String UID);
	 public userprofile removeUser(String UID);
	 public userprofile findById(String UID);
	 public List<userprofile> findAll();
	 public userprofile findUsertByNames(String Name);

}
