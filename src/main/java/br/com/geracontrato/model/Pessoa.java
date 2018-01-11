package br.com.geracontrato.model;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Pessoa {

	String nome;
	
	@Id
	String cpf;
	String rg;
	String estadoCivil;


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	
	
	public Pessoa(String pNome, String pCpf, String pRg, String pEstadoCivil) {
		this.nome = pNome;
		this.cpf = pCpf;
		this.rg = pRg;
		this.estadoCivil = pEstadoCivil;
	}
	
	public Pessoa() {
		super();
	}





}
