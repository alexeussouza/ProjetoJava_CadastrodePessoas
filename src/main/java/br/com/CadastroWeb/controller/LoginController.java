package br.com.CadastroWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login") // Mapeia a URL "/login" para este método
    public String login() {
        return "login"; // Retorna o nome do template login.html (Thymeleaf irá buscar em src/main/resources/templates/login.html)
    }
}
