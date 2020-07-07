package br.com.kvm.estoque.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.kvm.estoque.modelo.Local;

public class LocalDto {

	private Long id;
	private String nomeDoLocal;
	private int numeroDoAndar;
	
	public LocalDto(Local local) {
		this.id = local.getId();
		this.nomeDoLocal = local.getNomeDoLocal();
		this.numeroDoAndar = local.getNumeroDoAndar();
	}
	
	public Long getId() {
		return id;
	}
	public String getNomeDoLocal() {
		return nomeDoLocal;
	}
	public int getNumeroDoAndar() {
		return numeroDoAndar;
	}

	public static List<LocalDto> converter(List<Local> locais) {
		return locais.stream().map(LocalDto::new).collect(Collectors.toList());
	}
}
