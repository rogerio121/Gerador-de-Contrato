package br.com.geracontrato.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
@AttributeOverrides({
	@AttributeOverride(name = "nome", column = @Column(name = "usu_nome")),
	@AttributeOverride(name = "cpf", column = @Column(name = "usu_cpf")),
	@AttributeOverride(name = "rg", column = @Column(name = "usu_rg")),
	@AttributeOverride(name = "estadoCivil", column = @Column(name = "usu_estado_civil"))
})
public class Usuario extends Pessoa{
	
	@Column(name = "usu_email")
	String email;
	
	@Column(name = "usu_senha")
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
	
}
