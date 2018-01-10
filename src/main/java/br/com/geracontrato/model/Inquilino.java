package br.com.geracontrato.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AttributeOverrides({
	@AttributeOverride(name="nome", column=@Column(name="inq_nome")),
	@AttributeOverride(name="cpf", column=@Column(name="inq_cpf")),
	@AttributeOverride(name="rg", column=@Column(name="inq_rg")),
	@AttributeOverride(name="estadoCivil", column=@Column(name="inq_estado_civil")),
})
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
