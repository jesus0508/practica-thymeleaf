package pe.com.bn.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.com.bn.domain.Employee;
import pe.com.bn.domain.Vacante;

@Controller
@RequestMapping("/home")
public class HomeController {

	@GetMapping({ "/", "" })
	public String home(Model model) {
		model.addAttribute("mensaje", "Hola ñaño");
		model.addAttribute("fecha", new Date());
		return "home";
	}

	@GetMapping("/listar")
	public String getEmployeesList(Model model) {
		List<Employee> employees = Arrays.asList(new Employee("Angelica", 18), new Employee("Jair", 21),
				new Employee("Marisa", 61), new Employee("Haydee", 61));
		model.addAttribute("employees", employees);
		return "listar";
	}

	@GetMapping("/vacantes")
	public String getVacanteDetail(Model model) {
		Vacante vacante = new Vacante();
		vacante.setId(1);
		vacante.setName("Ingeniero en telecomunicaciones");
		vacante.setDescription("Se solicita ingeniero para dar mantenimiento a la red");
		vacante.setSalary(50.0);
		vacante.setDate(new Date());
		model.addAttribute(vacante);
		return "vacantes";
	}
}
