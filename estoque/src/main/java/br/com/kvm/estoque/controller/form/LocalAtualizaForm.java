package br.com.kvm.estoque.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.kvm.estoque.modelo.Local;
import br.com.kvm.estoque.repository.LocalRepository;

public class LocalAtualizaForm {

	@NotEmpty
	private String nomeDoLocal;
	@NotNull
	private int numeroDoAndar;
	
	public String getNomeDoLocal() {
		return nomeDoLocal;
	}
	public void setNomeDoLocal(String nomeDoLocal) {
		this.nomeDoLocal = nomeDoLocal;
	}
	public int getNumeroDoAndar() {
		return numeroDoAndar;
	}
	public void setNumeroDoAndar(int numeroDoAndar) {
		this.numeroDoAndar = numeroDoAndar;
	}
	public Local atualizar(Long id, LocalRepository localRepository) {
		Local local = localRepository.getOne(id);
		local.setNomeDoLocal(nomeDoLocal);
		local.setNumeroDoAndar(numeroDoAndar);
		return local;
	}	
}
