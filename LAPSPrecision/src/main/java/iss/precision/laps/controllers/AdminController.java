package iss.precision.laps.controllers;

import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;

import iss.precision.laps.HomeController;
import iss.precision.laps.models.userprofile;
import iss.precision.laps.services.LoginService;



import iss.precision.laps.services.adminService;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;




@Controller
@RequestMapping(value="/Admin")
public class AdminController {


	
	@Autowired
	private adminService userservice;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home1(Locale locale, Model model) {

		return "Admin/adminHome";
	}
	@RequestMapping(value = "/manageLeaveType", method = RequestMethod.GET)
	public String manageLeaveType(Locale locale, Model model) {

		return "Admin/manageLeaveType";
	}
	
	//Manage Staff Details Starts Here..........
	
	@RequestMapping(value = "/ManageStaff_List", method = RequestMethod.GET)
	public ModelAndView manageStaff(Locale locale, Model model) {
		
		List<userprofile> userList = userservice.findAll();
		for (userprofile userprofile : userList) {
			System.out.println(userprofile);
		}
		ModelAndView mav = new ModelAndView("Admin/ManageStaff_List");

		mav.addObject("userList", userList);
		return mav;

		
	}
	
	@RequestMapping(value = "/ManageStaff_AddNew", method = RequestMethod.GET)
	public ModelAndView newUserPage() {
		ModelAndView mav = new ModelAndView("/Admin/ManageStaff_AddNew", "user",
				new userprofile());
		return mav;
	}

	@RequestMapping(value = "/ManageStaff_AddNew", method = RequestMethod.POST)
	public ModelAndView addNewUser(@ModelAttribute("user") userprofile user,
			BindingResult result, final RedirectAttributes redirectAttributes) {

		if (result.hasErrors())
			return new ModelAndView("/Admin/ManageStaff_AddNew");

		ModelAndView mav = new ModelAndView();
		String message = "New User " + user.getName()
				+ " was successfully created.";

		userservice.addUser(user);
    	mav.setViewName("redirect:Admin/ManageStaff_List");

		redirectAttributes.addFlashAttribute("message", message);
		return mav;
	}
	
	//Ends Here
	
	
	
	
	@RequestMapping(value = "/manageLeaveEntitlement", method = RequestMethod.GET)
	public String manageLeaveEntitlement(Locale locale, Model model) {

		return "Admin/manageLeaveEntitlement";
	}
	@RequestMapping(value = "/approvalHierarchy", method = RequestMethod.GET)
	public String approvalHierarchy(Locale locale, Model model) {

		return "Admin/approvalHierarchy";
	}
}
