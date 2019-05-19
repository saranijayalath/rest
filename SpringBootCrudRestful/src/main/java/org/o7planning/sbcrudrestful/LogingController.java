package org.o7planning.sbcrudrestful;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LogingController {
		
		@RequestMapping(value="/login", method=RequestMethod.GET)
		public String getLoginForm() {
			return "login";
			
		}
		
		@RequestMapping(value="/login", method=RequestMethod.POST)
		public String login(@ModelAttribute(name="loginform") LoginForm loginForm, Model model) {
			
			String username = loginForm.getUsername();
			String password = loginForm.getPassword();
			
			if("admin".equals(username) && "admin".equals(password)){
				return "Home";
				
			}
			model.addAttribute("invalidCredentials", true);
			return "login";
			
		}
}
