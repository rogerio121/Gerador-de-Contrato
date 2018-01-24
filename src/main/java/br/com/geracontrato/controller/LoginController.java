package br.com.geracontrato.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.geracontrato.dao.UsuarioDao;
import br.com.geracontrato.model.Usuario;


@Controller
public class LoginController {


	@RequestMapping("login")
	public String login() {
		
		return "login";
	}
	
	@RequestMapping("cadastro")
	public String cadastro() {
		
		return "cadastro-de-usuario";
	}
	
	@RequestMapping("cadastro-usuario")
	public void cadastroUsuario(Usuario usuario) {
		
		UsuarioDao dao = new UsuarioDao();
		dao.insert(usuario);
		
	}
}
