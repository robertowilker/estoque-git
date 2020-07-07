package br.com.kvm.estoque.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.kvm.estoque.modelo.Local;
import br.com.kvm.estoque.modelo.Predio;
import br.com.kvm.estoque.repository.PredioRepository;

public class LocalForm {
	
	@NotEmpty
	private String nomeDoLocal;
	@NotEmpty
	private String nomePredio;
	@NotNull
	private int numeroDoAndar;
	
	public String getNomeDoLocal() {
		return nomeDoLocal;
	}
	public void setNomeDoLocal(String nomeDoLocal) {
		this.nomeDoLocal = nomeDoLocal;
	}
	public String getNomePredio() {
		return nomePredio;
	}
	public void setNomePredio(String nomePredio) {
		this.nomePredio = nomePredio;
	}
	public int getNumeroDoAndar() {
		return numeroDoAndar;
	}
	public void setNumeroDoAndar(int numeroDoAndar) {
		this.numeroDoAndar = numeroDoAndar;
	}
	
	public Local converter(PredioRepository predioRepository) {
		Predio predio = predioRepository.findByNome(nomePredio);
		return new Local(nomeDoLocal, predio, numeroDoAndar);
	}
}
