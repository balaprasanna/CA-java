package iss.precision.laps.controllers;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;

import iss.precision.laps.HomeController;
import iss.precision.laps.models.leaveapplication;
import iss.precision.laps.models.leavetable;
import iss.precision.laps.models.leavetypetable;
import iss.precision.laps.models.userprofile;
import iss.precision.laps.services.LoginService;



import iss.precision.laps.services.staffService;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/Staff")
public class StaffController {

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(StaffController.class);
	
	@Autowired
	private LoginService service;
	// put auto wire for every service. reference... danger zone
	@Autowired
	private staffService _staffservice;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home1(@RequestParam String uid) {	

		ModelAndView mv = new ModelAndView("Staff/staffHome");
		mv.addObject("uid", uid);
		return mv;
	}

	@RequestMapping(value = "/submitLeaveApplication", method = RequestMethod.GET)
	public ModelAndView leaveApplication(@RequestParam String uid) {	

		// say which pay you want to launc
		// note : where is your page located manually...
		// here Staff/leaveApplication
		
		ModelAndView mv = new ModelAndView("Staff/LeaveApplication");
		//@RequestParam String uid,Model model
		logger.info(""+_staffservice.getAllLeaveType().get(0).getLeaveType());
		
		
		/*	ArrayList<String>  a = new ArrayList<String>();
		
		for (int i = 0; i < typeColl.size(); i++) {
			a.add(typeColl.get(i).getLeaveType());
		}*/
		List<leavetypetable> typeColl = _staffservice.getAllLeaveType();
		mv.addObject("LeaveTypeCollection",typeColl);
		mv.addObject("uid",uid);
		//mv.addObject("test", service.checkUserNameAndPassword("bala", "pass"));
		return mv;
		
	}
	

	@RequestMapping(value = "/submitLeaveApplication_process", method = RequestMethod.POST)
	public ModelAndView leaveApplication_process(@RequestParam String uid,
			@RequestParam Date stime,
			@RequestParam Date etime,
			@RequestParam String reason,
			@RequestParam String leavetype,
			@RequestParam String contactNumber) {	

		ModelAndView mv = new ModelAndView("Staff/LeaveApplication");
		//@RequestParam String uid,Model model
		logger.info(""+_staffservice.getAllLeaveType().get(0).getLeaveType());
		
		List<leavetypetable> typeColl = _staffservice.getAllLeaveType();
		/*	ArrayList<String>  a = new ArrayList<String>();
		
		for (int i = 0; i < typeColl.size(); i++) {
			a.add(typeColl.get(i).getLeaveType());
		}*/
		
	//	mv.addObject("LeaveTypeCollection",typeColl);
	//	mv.addObject("uid",uid);
	//	mv.addObject("stime",stime);
	//	mv.addObject("etime",etime);
	//	mv.addObject("reason",reason);
	//	mv.addObject("leavetype",leavetype);
	//	mv.addObject("contactNumber",contactNumber);
		
		leavetable lv = new leavetable();
		lv.setUID(uid);
		lv.setStarttime(stime);
		lv.setEndtime(etime);
		lv.setLeavetype(leavetype);
		lv.setReason(reason);
		lv.setRemarks(reason);
		lv.setWorkdissemination(reason);
		lv.setContactNumber(contactNumber);
		lv.setStatus("Applied");
		leavetable obj = _staffservice.createleaveApplicationEntry(lv);
		
		if(obj!= null)
		{
			//mv.setViewName("Staff/staffHome");
			mv.setViewName("redirect:/Staff/");
			mv.addObject("uid",uid);
			mv.addObject("result", "Leave  Applied SuccessFully");
		}
		//mv.addObject("test", service.checkUserNameAndPassword("bala", "pass"));
		return mv;
		
	}
	
	
	@RequestMapping(value = "/manageLeaveApplication", method = RequestMethod.GET)
	public String manageLeaveApplication(@RequestParam String uid ,Locale locale, Model model) {	
		
		List<leavetable> obj = _staffservice.collectAllApplicationsAppliedByThisUser(uid,"Applied");
	
		model.addAttribute("leaveApplicationList", obj);

		return "Staff/manageLeaveApplication";
	}
	
	@RequestMapping(value = "/manageLeaveApplication/manageLeaveApplication_edit", method = RequestMethod.GET)
	public String manageLeaveApplication_edit(@RequestParam int lid,
	
			Locale locale, Model model) {	
		
		leavetable obj = _staffservice.findleaveRecord(lid);
		model.addAttribute("leaveRecord", obj);

		List<leavetypetable> typeColl = _staffservice.getAllLeaveType();
		model.addAttribute("LeaveTypeCollection",typeColl);
		
		return "Staff/EditLeaveApplication";
	}
	
	
	@RequestMapping(value = "/manageLeaveApplication/manageLeaveApplication_delete", method = RequestMethod.GET)
	public ModelAndView manageLeaveApplication_delete(@RequestParam int lid,
	
			Locale locale, Model model) {	
		
	/*	leavetable obj = _staffservice.findleaveRecord(lid);
		model.addAttribute("leaveRecord", obj);

		List<leavetypetable> typeColl = _staffservice.getAllLeaveType();
		model.addAttribute("LeaveTypeCollection",typeColl);*/
		ModelAndView mv = new ModelAndView("redirect:/Staff/manageLeaveApplication");
		leavetable leave = _staffservice.removeleaveapplication(lid);
		
		return mv;
	}
	
	
	@RequestMapping(value = "/manageLeaveApplication/manageLeaveApplication_submit", method = RequestMethod.POST)
	public ModelAndView manageLeaveApplication_edit_submit(@RequestParam String uid,
			@RequestParam Date stime,
			@RequestParam Date etime,
			@RequestParam String reason,
			@RequestParam String leavetype,
			@RequestParam String contactNumber,
			@RequestParam int lid) {	

		ModelAndView mv = new ModelAndView("Staff/LeaveApplication");
		//@RequestParam String uid,Model model
	//	logger.info(""+_staffservice.getAllLeaveType().get(0).getLeaveType());
		
		List<leavetypetable> typeColl = _staffservice.getAllLeaveType();
	
		
	//	mv.addObject("LeaveTypeCollection",typeColl);
	//	mv.addObject("uid",uid);
	//	mv.addObject("stime",stime);
	//	mv.addObject("etime",etime);
	//	mv.addObject("reason",reason);
	//	mv.addObject("leavetype",leavetype);
	//	mv.addObject("contactNumber",contactNumber);
		
		leavetable lv = new leavetable();
		lv.setLid(lid);
		lv.setUID(uid);
		lv.setStarttime(stime);
		lv.setEndtime(etime);
		lv.setLeavetype(leavetype);
		lv.setReason(reason);
		lv.setRemarks(reason);
		lv.setWorkdissemination(reason);
		lv.setContactNumber(contactNumber);
		lv.setStatus("Applied");
		leavetable obj = _staffservice.updateleaveApplicationEntry(lv);
		
		if(obj!= null)
		{
			//mv.setViewName("Staff/staffHome");
			mv.setViewName("redirect:/Staff/");
			mv.addObject("uid",uid);
			mv.addObject("result", "Leave Updated  SuccessFully");
		}
		//mv.addObject("test", service.checkUserNameAndPassword("bala", "pass"));
		return mv;
		
	}
	
	
	
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public ModelAndView test(@RequestParam String uid,
			@RequestParam Date stime,
			@RequestParam Date etime,
			@RequestParam String reason,
			@RequestParam String leavetype,
			@RequestParam String contactNumber,
			@RequestParam int lid) {	

		
		ModelAndView mv = new ModelAndView("Staff/LeaveApplication");

		
		leavetable lv = new leavetable();
		lv.setLid(lid);
		lv.setUID(uid);
		lv.setStarttime(stime);
		lv.setEndtime(etime);
		lv.setLeavetype(leavetype);
		lv.setReason(reason);
		lv.setRemarks(reason);
		lv.setWorkdissemination(reason);
		lv.setContactNumber(contactNumber);
		lv.setStatus("Applied");
		leavetable obj = _staffservice.updateleaveApplicationEntry(lv);
		
		if(obj!= null)
		{
			//mv.setViewName("Staff/staffHome");
			mv.setViewName("redirect:/Staff/");
			mv.addObject("uid",uid);
			mv.addObject("result", "Leave Updated  SuccessFully");
		}
		//mv.addObject("test", service.checkUserNameAndPassword("bala", "pass"));
		return mv;
		
	}
	
	
	
	@RequestMapping(value = "/claimLeaveCompensation", method = RequestMethod.GET)
	public String claimLeaveCompensation(Locale locale, Model model) {	

		return "Staff/claimCompensation";
	}
		
	
	@RequestMapping(value = "/viewPersonalLeaveHistory", method = RequestMethod.GET)
	public String viewPersonalLeaveHistory(@RequestParam String uid, Locale locale, Model model) {	
		
		List<leavetable> obj = _staffservice.collectAllApplicationsHistoryByThisUser(uid);
		
		model.addAttribute("leaveApplicationList", obj);

		return "Staff/viewPersonalLeaveHistory";
	}
	
	
}
