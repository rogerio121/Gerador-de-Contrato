package br.com.geracontrato.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AllController {
	
	@RequestMapping("home")
	public String foi() {
		return "login";
	}
}
