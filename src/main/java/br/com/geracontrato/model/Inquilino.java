package br.com.geracontrato.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inquilino")
@AttributeOverrides({
	@AttributeOverride(name = "nome", column = @Column(name = "inq_nome")),
	@AttributeOverride(name = "cpf", column = @Column(name = "inq_cpf")),
	@AttributeOverride(name = "rg", column = @Column(name = "inq_rg")),
	@AttributeOverride(name = "estadoCivil", column = @Column(name = "inq_estado_civil"))
})
public class Inquilino extends Pessoa{

	@Column(name = "imov_id")
	int idImovel;


	public int getIdImovel() {
		return idImovel;
	}
	public void setIdImovel(int idImovel) {
		this.idImovel = idImovel;
	}
	
}
