package net.javaguides.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/if")
	public String users(Model model) {
		List<User> users = new ArrayList<>();
		users.add(new User("Name", "email", "admin"));
		users.add(new User("Name2", "email2", "user"));
		users.add(new User("Name3", "email3", "user"));
		model.addAttribute("users", users);
		return "if";
	}
	
	@GetMapping("/switchs")
	public String switchExample(Model model) {
		User user = new User("Arsen", "arsen@gmail.com", "admin");
		model.addAttribute("user", user);
		return "case";
	}

}
