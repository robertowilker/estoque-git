package br.com.kvm.estoque.controller.dto;

import br.com.kvm.estoque.modelo.Local;

public class LocalDto {

	private String nomeDoLocal;
	private int numeroDoAndar;
	
	public LocalDto(Local local) {
		this.nomeDoLocal = local.getNomeDoLocal();
		this.numeroDoAndar = local.getNumeroDoAndar();
	}
	
	public String getNomeDoLocal() {
		return nomeDoLocal;
	}
	public int getNumeroDoAndar() {
		return numeroDoAndar;
	}
}
