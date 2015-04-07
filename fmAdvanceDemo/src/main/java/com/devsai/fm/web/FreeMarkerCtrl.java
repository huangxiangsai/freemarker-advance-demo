package com.devsai.fm.web;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class FreeMarkerCtrl {
	
	@RequestMapping("fm/demo")
	public ModelAndView  index(Model model){
		ModelAndView  view = new ModelAndView("demo");
		
		view.addObject("createDate", new Date(1427950889062l));
		System.out.println("demos");
		return view;
	}
	
	@RequestMapping("/")
	public String demo(){
		return "dd";
	}

}
