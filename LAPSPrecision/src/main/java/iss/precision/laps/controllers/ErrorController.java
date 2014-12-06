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
public class ErrorController {

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ErrorController.class);
	
	@Autowired
	private LoginService service;

	@RequestMapping(value = "Error", method = RequestMethod.GET)
	public String home1(Locale locale, Model model) {

		return "Error/error";
	}

	

}
