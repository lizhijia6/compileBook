package WL.CompileBooks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class login_page {
	@RequestMapping(method=RequestMethod.GET)
	public String home(){
		return "home";
	}
}
