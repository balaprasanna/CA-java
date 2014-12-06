package iss.precision.laps.services;

import iss.precision.laps.models.userprofile;



public interface LoginService {

public String getString(String UID,String password);
public userprofile checkUserNameAndPassword(String UID, String password);

}
