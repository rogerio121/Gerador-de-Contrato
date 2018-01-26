package br.com.geracontrato.controller;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.geracontrato.dao.UsuarioDao;
import br.com.geracontrato.model.Usuario;


@Controller
public class LoginController {


	@RequestMapping("/")
	public String login() {

		return "login";
	}

	@RequestMapping("cadastro")
	public String cadastro() {

		return "cadastro-de-usuario";
	}

	@RequestMapping("cadastro-usuario")
	public String cadastroUsuario(Usuario usuario) {

		UsuarioDao dao = new UsuarioDao();
		dao.insert(usuario);

		return "login";
	}
	

	@RequestMapping("telainicial")
	public String cadastroUsuario(HttpServletRequest req, HttpServletResponse res) {

		UsuarioDao dao = new UsuarioDao();
		Usuario usuario = new Usuario();
		String email = req.getParameter("login");
		String senha = req.getParameter("senha");
		String pagina = "";

		try {
			usuario =  dao.buscarUsuarioPorSenhaEemail(email, senha);
			if(usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
				pagina = "telainicial";
			}
		}
		catch (Exception e) {
			pagina = "login";
		}
		return pagina;
	}
}
