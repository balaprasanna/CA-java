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
@RequestMapping(value="/Manager")
public class ManagerController {

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ManagerController.class);
	
	@Autowired
	private LoginService service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home1(Locale locale, Model model) {

		return "Manager/managerHome";
	}
	
	@RequestMapping(value = "/viewAplicationForApproval", method = RequestMethod.GET)
	public String viewAplicationForApproval(Locale locale, Model model) {

		return "Manager/viewAplicationForApproval";
	}
	
	@RequestMapping(value = "/viewEmployeeLeaveHistory", method = RequestMethod.GET)
	public String viewEmployeeLeaveHistory(Locale locale, Model model) {

		return "Manager/viewEmployeeLeaveHistory";
	}
	
	@RequestMapping(value = "/approveCompensationClaim", method = RequestMethod.GET)
	public String approveCompensationClaim(Locale locale, Model model) {

		return "Manager/approveCompensationClaim";
	}


}
