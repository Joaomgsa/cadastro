package io.github.joaomgsa.cadastro.controller;

import io.github.joaomgsa.cadastro.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/*Controller de usuários
 * Apresenta o formulário de usuários e recebe os dados vindo deles*/

@Controller
@RequestMapping("/users")
public class UserController {
	/*Apresenta o formulário
	 * 
	 * @param model @return*/
	@GetMapping
	public String userForm(final Model model) {
		model.addAttribute("user", new User());
		
		return "userForm";
	}
	
	/*
	 * recebe os dados do formulário e apresenta eles em uma view
	 * 
	 * @param user
	 * @return */
	@PostMapping 
	public String result(@ModelAttribute final User user) {
		return "result";
	}

}
