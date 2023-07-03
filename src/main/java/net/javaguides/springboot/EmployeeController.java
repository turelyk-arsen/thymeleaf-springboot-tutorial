package net.javaguides.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

	@GetMapping("/iteration")
	public String iteration(Model model) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Arsen1", "Turelyk1", "arsen1@gmail.com"));
		employees.add(new Employee("Arsen2", "Turelyk2", "arsen2@gmail.com"));
		employees.add(new Employee("Arsen3", "Turelyk3", "arsen3@gmail.com"));
		model.addAttribute("employees", employees);
		return "iteration";
	}
}
