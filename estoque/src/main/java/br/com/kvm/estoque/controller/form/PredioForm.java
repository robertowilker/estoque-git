package br.com.kvm.estoque.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.kvm.estoque.modelo.Predio;

public class PredioForm {
	
	@NotEmpty
	private String nome;
	@NotEmpty
	private String cep;
	@NotEmpty
	private String rua;
	@NotEmpty
	private String bairro;
	@NotEmpty
	private String complemento;
	@NotNull
	private int numeroDoEndereco;
	
	public Predio converter() {
		Predio predio = new Predio(nome, cep, rua, bairro, complemento,
				numeroDoEndereco);
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
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumeroDoEndereco() {
		return numeroDoEndereco;
	}
	public void setNumeroDoEndereco(int numeroDoEndereco) {
		this.numeroDoEndereco = numeroDoEndereco;
	}
}
