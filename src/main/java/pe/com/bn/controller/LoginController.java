package pe.com.bn.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.com.bn.domain.Country;
import pe.com.bn.domain.User;

@Controller
@RequestMapping("/login")
public class LoginController {

    @ModelAttribute("countries")
    public List<Country> countries(){
        return Arrays.asList(new Country(1, "Argentina"),
                        new Country(2, "Bolivia"),
                        new Country(3, "Brasil"),
                        new Country(4, "Chile"),
                        new Country(5, "Colombia"),
                        new Country(6, "Ecuador"),
                        new Country(7, "Paraguay"),
                        new Country(8, "Perú"),
                        new Country(9, "Uruguay"),
                        new Country(10, "Venezuela") );
    }

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