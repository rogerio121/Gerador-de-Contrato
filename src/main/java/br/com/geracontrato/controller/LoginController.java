package br.com.geracontrato.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
	public void  efetuarLogin(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
		String email = req.getParameter("login");
		String senha = req.getParameter("senha");

		UsuarioDao dao = new UsuarioDao();
		Usuario usuarioLogado = dao.buscarUsuarioPorSenhaEemail(email, senha);

		if(usuarioLogado != null) {
			HttpSession sessao = req.getSession();
			sessao.setAttribute("usuarioLogado", usuarioLogado);
			sessao.setMaxInactiveInterval(3000);
			
			req.getRequestDispatcher("telainicial").forward(req, res);

		}else{
			req.getRequestDispatcher("").forward(req, res);
		}
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
