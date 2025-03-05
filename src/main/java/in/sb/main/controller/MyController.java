package in.sb.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.sb.main.entity.User1;
import in.sb.main.services.UserServices;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;



@Controller
public class MyController {
	
	@Autowired
	private UserServices userServices;
	
	@GetMapping("/regpage")
	public String openRegisterPage(Model model) {
		model.addAttribute("user", new User1());
		
		return "register";
	}

	@PostMapping("/regform")
	public String submitregForm(@ModelAttribute("user") User1 user,Model model) {
		boolean status=userServices.userRegister(user);
		if(status) {
			model.addAttribute("successMess", "registration successfully");
		}
		else {
			model.addAttribute("errMess", "not register successfully");
		}
		return "register";
	}
	
	
	@GetMapping("/logpage")
	public String openLoginPage(Model model) {
		model.addAttribute("user", new User1());
		return"login";
	}
	
	
	@PostMapping("/logform")
	public String submitLoginForm(@ModelAttribute("user") User1 user,Model model) {
	User1 validuser =userServices.userLogin(user.getEmail(), user.getPassword());
	if(validuser!=null) {
		model.addAttribute("modelname", validuser.getName());
		return "profile";
	}else {
		model.addAttribute("errMess", "email and password not match");
		return "login";
		

	}
	
		
	}
	@GetMapping("/logout")
	public String userLogOut(HttpServletRequest httpservlet) {
		HttpSession session= httpservlet.getSession(false);
		if(session!=null) {
			 session.invalidate();
		}
		return "login";
		
	}
	
}
