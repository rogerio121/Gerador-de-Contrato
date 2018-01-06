package br.com.geracontrato.model;

public class Usuario extends Pessoa{
	
	String email;
	String senha;
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	public Usuario(String pNome, String pCpf, String pRg, String pEstadoCivil) {
		super(pNome, pCpf, pRg, pEstadoCivil);
		// TODO Auto-generated constructor stub
	}
	
}
