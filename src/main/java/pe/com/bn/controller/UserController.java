package pe.com.bn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    @GetMapping({ "/", "" })
    public String home(Model model) {
        model.addAttribute("title", "Usuarios");
        return "users/show";
    }

}
