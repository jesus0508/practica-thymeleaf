package pe.com.bn.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.com.bn.domain.User;

@Controller
@RequestMapping("/login")
public class LoginController {

	@GetMapping({ "/", "" })
	public String index(Model model) {
		model.addAttribute(new User());
		return "login/index";
	}

	@PostMapping({ "/", "" })
	public String login(@Valid User user, BindingResult bindingResult, Model model) {
		Map<String, String> errors = new HashMap<>();
		if (bindingResult.hasErrors()) {
//			errors = bindingResult.getFieldErrors().stream()
//					.collect(Collectors.toMap(e -> e.getField(), e -> e.getDefaultMessage()));
//			model.addAttribute("errors", errors);
			
			return "login/index";
		}
		model.addAttribute(user);
		return "users/show";
	}

}