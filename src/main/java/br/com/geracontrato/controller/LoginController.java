package br.com.geracontrato.controller;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.geracontrato.dao.*;
import br.com.geracontrato.model.*;


@Controller
public class LoginController {

	//Tela de Login
	@RequestMapping("/")
	public String login() {

		return "login";
	}

	@RequestMapping("cadastro")
	public String cadastro() {

		return "cadastro-de-usuario";
	}

	@RequestMapping("telainicial")
	public ModelAndView  efetuarLogin(HttpServletRequest req, HttpServletResponse res) {

		UsuarioDao dao = new UsuarioDao();
		Usuario usuario = new Usuario();
		String email = req.getParameter("login");
		String senha = req.getParameter("senha");
		String pagina = "";

		ModelAndView mv = new ModelAndView("login");
		try {
			usuario =  dao.buscarUsuarioPorSenhaEemail(email, senha);
			System.out.println("foi1");
			mv = new ModelAndView("telainicial");
			mv.addObject("usuario", usuario);
			System.out.println("foi");
		}
		catch (Exception e) {
			
		}
		return mv;
	}

	
	
	//Tela de cadastro de Usuario	
	@RequestMapping("salvar-usuario")
	public String salvarUsuario(Usuario usuario) {
		
		try {
			UsuarioDao dao = new UsuarioDao();
			dao.insert(usuario);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return "login";
	}


	
	//Tela Inicial	
	@RequestMapping("cadastro-inquilino")
	public String cadastroInquilino() {

		return "cadastro-de-inquilino";
	}

	@RequestMapping("cadastro-imovel")
	public ModelAndView cadastroImovel(Usuario usuario) {
		
		ModelAndView mv = new ModelAndView("cadastro-de-imovel");
		mv.addObject(usuario);
		return mv;
	}

	
	
	//Tela Cadastro de inquilino
	@RequestMapping("salvar-inquilino")
	public String salvarInquilino(Inquilino inquilino) {

		try {
			InquilinoDao dao = new InquilinoDao();
			dao.insert(inquilino);
		} catch (Exception e) {
			System.out.println(e);
		}

		return "telainicial";
	}

	//Tela Cadastro de Imóvel
	@RequestMapping("salvar-imovel")
	public ModelAndView salvarImovel(Imovel imovel) {
		ModelAndView mv = new ModelAndView("telainicial");
		try {
			ImovelDao dao = new ImovelDao();
			dao.insert(imovel);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return mv;
	}
}
