package br.com.geracontrato.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "imovel")
public class Imovel {
	
	@Id
	@GeneratedValue
	@Column(name = "imov_id")
	int idImovel;
	
	@Column(name = "imov_numero")
	int numero;
	
	@Column(name = "imov_comodos")
	int comodos;
	
	@Column(name = "imov_valor_numero")
	double valorEmNumero;
	
	@Column(name = "imov_rua")
	String rua;
	
	@Column(name = "imov_bairro")
	String bairro;
	
	@Column(name = "imov_cidade")
	String cidade;
	
	@Column(name = "imov_uf")
	String uf;
	
	@Column(name = "imov_cep")
	String cep;
	
	@Column(name = "imov_valor_extenso")
	String valorExtenso;
	
	@Column(name = "usu_cpf")
	String cpfUsuario;
	
	
	
	public int getIdImovel() {
		return idImovel;
	}
	public void setIdImovel(int idImovel) {
		this.idImovel = idImovel;
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	public int getComodos() {
		return comodos;
	}
	public void setComodos(int comodos) {
		this.comodos = comodos;
	}
	
	
	public double getValorEmNumero() {
		return valorEmNumero;
	}
	public void setValorEmNumero(double valorEmNumero) {
		this.valorEmNumero = valorEmNumero;
	}
	
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
	public String getValorExtenso() {
		return valorExtenso;
	}
	public void setValorExtenso(String valorExtenso) {
		this.valorExtenso = valorExtenso;
	}
	
	
	public String getCpfUsuario() {
		return cpfUsuario;
	}
	public void setCpfUsuario(String cpfUsuario) {
		this.cpfUsuario = cpfUsuario;
	}
	
}
