package br.com.geracontrato.model;

public class Inquilino extends Pessoa{
	
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
