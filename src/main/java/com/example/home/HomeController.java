package com.example.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jia.hch
 *
 */
@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping("")
	public String index() {
		return "home";
	}

	@RequestMapping("update")
	public ModelAndView update(String name, String label) {
		ModelAndView mv = new ModelAndView("result");
		mv.addObject("name", name);
		mv.addObject("label", label);
		return mv;
	}
}
