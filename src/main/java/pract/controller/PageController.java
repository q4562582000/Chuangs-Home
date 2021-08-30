package pract.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping(value = "/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping(value = "/index")
	public String index() {
		return "index";//HOME
	}
	
	@RequestMapping(value = "/about")
	public String about() {
		return "about";
	}
	
	@RequestMapping(value = "/work")
	public String work() {
		return "work";
	}

	@RequestMapping(value = "/pricing")
	public String pricing() {
		return "pricing";
	}

	@RequestMapping(value = "/contact")
	public String contact() {
		return "contact";
	}
	
	@RequestMapping(value = "/toolbar/topToolBar")
	public String topToolBar() {
		return "toolbar/topToolBar";
	}
}
