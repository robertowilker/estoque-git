package br.com.kvm.estoque.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.kvm.estoque.modelo.Endereco;
import br.com.kvm.estoque.modelo.Predio;

public class PredioForm {

	@NotEmpty
	private String nome;
	@NotEmpty
	private String cep;
	private String endereco;
	@NotNull
	private int numeroDoEndereco;
	
	public Predio converter() {
		Endereco endereco = new Endereco().buscaEnderecoPeloCEP(cep);
		Predio predio = new Predio(nome, cep, endereco, numeroDoEndereco);
		return predio;
	}
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getNumeroDoEndereco() {
		return numeroDoEndereco;
	}
	public void setNumeroDoEndereco(int numeroDoEndereco) {
		this.numeroDoEndereco = numeroDoEndereco;
	}
}
