package br.com.kvm.estoque.controller.dto;

import br.com.kvm.estoque.modelo.Local;

public class LocalDetalheDto {

	private Long id;
	private String nomeDoLocal;
	private String predio;
	private int numeroDoAndar;
	
	public LocalDetalheDto(Local local) {
		this.id = local.getId();
		this.nomeDoLocal = local.getNomeDoLocal();
		this.predio = local.getPredio().getNome();
		this.numeroDoAndar = local.getNumeroDoAndar();
	}

	public Long getId() {
		return id;
	}

	public String getNomeDoLocal() {
		return nomeDoLocal;
	}

	public String getPredio() {
		return predio;
	}

	public int getNumeroDoAndar() {
		return numeroDoAndar;
	}
}
