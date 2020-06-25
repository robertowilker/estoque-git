package br.com.kvm.estoque.controller.dto;

import br.com.kvm.estoque.modelo.Empresa;

public class EmpresaDetalhesDto {

	private Long id;
	private String nome;
	private String cnpj;
	
	public EmpresaDetalhesDto(Empresa empresa) {
		this.id = empresa.getId();
		this.nome = empresa.getNome();
		this.cnpj = empresa.getCnpj();
	}
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getCnpj() {
		return cnpj;
	}
}
