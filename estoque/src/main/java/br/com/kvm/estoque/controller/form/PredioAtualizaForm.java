package br.com.kvm.estoque.controller.form;

import br.com.kvm.estoque.modelo.Predio;
import br.com.kvm.estoque.repository.PredioRepository;

public class PredioAtualizaForm {

	private String nome;
	private String cep;
	private String rua;
	private String bairro;
	private String complemento;
	private int numeroDoEndereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
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

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public int getNumeroDoEndereco() {
		return numeroDoEndereco;
	}

	public void setNumeroDoEndereco(int numeroDoEndereco) {
		this.numeroDoEndereco = numeroDoEndereco;
	}

	public Predio atualiza(Long id, PredioRepository predioRepository) {
		Predio predio = predioRepository.getOne(id);
		predio.setNome(nome);
		predio.setCep(cep);
		predio.setRua(rua);
		predio.setBairro(bairro);
		predio.setNumeroDoEndereco(numeroDoEndereco);
		return predio;
	}

}
