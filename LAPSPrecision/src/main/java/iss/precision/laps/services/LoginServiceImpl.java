package iss.precision.laps.services;

import javax.annotation.Resource;




import iss.precision.laps.models.userprofile;
import iss.precision.laps.repository.UserProfileRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LoginServiceImpl implements LoginService {

@Resource
private UserProfileRepository rep;
	
	
	@Override
	public String getString(String UID,String password) {
	
	String pwd = rep.findOne(UID).getPassword();
	String role = rep.findOne(UID).getRole();
	if(pwd!=null)
	{
		
		if(pwd.compareTo(password)==0)
			return role;

		else
			return null;
	}
	return null;
	
	}


	@Override
	
	public userprofile checkUserNameAndPassword(String UID, String password) {
		// TODO Auto-generated method stub
		userprofile usprofile = rep.findOne(UID);

		
		if(usprofile != null){
			if(usprofile.getPassword().equalsIgnoreCase(password)){
				// if password matches..
				return usprofile;
			}
			else
			{
				return null;
			}
		}
		
		
		return null;
	}
	
/*
	@Resource
	public UserProfileRepository userProfile;
	*/
	/*@Override
	public String checkUserNameAndPassword(String uname, String pwd) {
		// TODO Auto-generated method stub
		String username ="";
		
		userprofile obj= userProfile.findOne(uname);
		
		String pwdRecived = obj.getPassword();
		
		if(pwdRecived.equalsIgnoreCase(pwd))
		{
			username=obj.getName();
		}
		
		
		return username; 
	}*/

}
