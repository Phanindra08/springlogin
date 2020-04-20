package net.codejava;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		User user=new User();
		model.addAttribute("user", user);
		return "index";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("user") User user,Model model) {
		if(!user.check())
		{
			model.addAttribute("message","Invalid Credentials");
			return "index";
		}
		model.addAttribute("username",user.getUsername());
		return "home";
	}
	
	@RequestMapping("/logout")
	public String backtohome(Model model) {
		return "redirect:/";
	}
		
}
