package WL.CompileBooks.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/register")
public class registerController {
	@RequestMapping(value="/EADF",method=RequestMethod.GET)
	public String register(){
		return "register";
	}
}
