package iss.precision.laps.controllers;

import java.util.Locale;
import java.util.logging.Logger;

import iss.precision.laps.HomeController;
import iss.precision.laps.models.userprofile;
import iss.precision.laps.services.LoginService;



import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private LoginService service;

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String home1(Locale locale, Model model) {

		return "Login/loginPage";
	}

	
	
		@RequestMapping(value = "login", method = RequestMethod.POST)
		public ModelAndView login(@RequestParam String UID, @RequestParam String password) {
	
			ModelAndView view = null;
			userprofile usProf = service.checkUserNameAndPassword(UID, password);	
			
			try
			{
			if (usProf != null) {
				logger.info(usProf.getName()+""+usProf.getRole());
				
				if(usProf.getRole().equalsIgnoreCase("Manager"))
				{
					view = new ModelAndView("redirect:/Manager/");
				}
				else if(usProf.getRole().equalsIgnoreCase("Administrator"))
				{
					view = new ModelAndView("redirect:/Admin/");
				}
				else if(usProf.getRole().equalsIgnoreCase("Staff"))
				{
					view = new ModelAndView("redirect:/Staff/");
					view.addObject("uid", usProf.getUID());
				}
				
				
				
				
			}
			else
			{
				throw new NullPointerException();
			}
			
			}
			catch(NullPointerException e){
				view = new ModelAndView("redirect:/Error");
			}
			
		return view;
		}
}
