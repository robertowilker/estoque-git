package br.com.kvm.estoque.controller.form;

import javax.validation.constraints.NotEmpty;

import br.com.kvm.estoque.modelo.Empresa;
import br.com.kvm.estoque.repository.EmpresaRepository;

public class EmpresaAtualizaForm {

	@NotEmpty
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Empresa atualizar(Long id, EmpresaRepository empresaRepository) {
		Empresa empresa = empresaRepository.getOne(id);
		empresa.setNome(nome);
		return empresa;
	}
}
