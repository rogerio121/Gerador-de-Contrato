package br.com.geracontrato.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {


	@RequestMapping("login2")
	public String login() {
		
		return "login";
	}
}
