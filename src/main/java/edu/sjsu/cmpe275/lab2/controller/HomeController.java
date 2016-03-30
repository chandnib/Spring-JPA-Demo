package edu.sjsu.cmpe275.lab2.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.sjsu.cmpe275.lab2.dao.ProfileDao;
import edu.sjsu.cmpe275.lab2.model.Profile;

@Controller
public class HomeController {

	@Autowired
	ProfileDao profileDao;
	
	@Transactional
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
        Profile prof = new Profile();
        prof.setAboutMyself("I am Rakshith");
		prof.setAddress("Marquis");
		prof.setEmail("contactmenow@croso.com");
		prof.setFirstname("Rakshith");
		prof.setLastname("Hatwar");
		prof.setOrganization("SAP");
		System.out.println("Profile is this"+prof.toString());
		profileDao.add(prof);
        return new ModelAndView("home");
	}
}
