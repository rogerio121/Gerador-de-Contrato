package br.com.geracontrato.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Inquilino extends Pessoa{
	
	@Id
	@Column(name = "imov_id")
	int idImovel;

	
	public int getIdImovel() {
		return idImovel;
	}
	public void setIdImovel(int idImovel) {
		this.idImovel = idImovel;
	}
	public Inquilino(String pNome, String pCpf, String pRg, String pEstadoCivil, int idImovel) {
		super(pNome, pCpf, pRg, pEstadoCivil);
		this.idImovel = idImovel;
	}
	
}
