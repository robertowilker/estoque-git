package br.com.kvm.estoque.controller.dto;

import br.com.kvm.estoque.modelo.Andar;

public class AndarDto {

	private Long id;
	private int numero;
	
	public AndarDto(Andar andar) {
		this.id = andar.getId();
		this.numero = andar.getNumero();
	}
	
	public Long getId() {
		return id;
	}
	public int getNumero() {
		return numero;
	}
}
