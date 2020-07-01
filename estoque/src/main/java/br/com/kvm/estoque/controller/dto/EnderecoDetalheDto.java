package br.com.kvm.estoque.controller.dto;

import br.com.kvm.estoque.modelo.Endereco;

public class EnderecoDetalheDto {

	private Long id;
	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String localidade;
	private String uf;
	
	private EnderecoDetalheDto(Endereco endereco) {
		this.id = endereco.getId();
		this.cep = endereco.getCep();
		this.logradouro = endereco.getLogradouro();
		this.complemento = endereco.getComplemento();
		this.bairro = endereco.getBairro();
		this.localidade = endereco.getLocalidade();
		this.uf = endereco.getUf();
	}
	
	public Long getId() {
		return id;
	}
	public String getCep() {
		return cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public String getLocalidade() {
		return localidade;
	}
	public String getUf() {
		return uf;
	}
}
