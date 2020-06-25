package br.com.kvm.estoque.controller.form;

import javax.validation.constraints.NotEmpty;

import br.com.kvm.estoque.modelo.Empresa;

public class EmpresaForm {

	@NotEmpty
	private String nome;
	@NotEmpty
	private String cnpj;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Empresa converter() throws Exception{

		return new Empresa(nome, cnpj);
	}
}
