package br.com.kvm.estoque.controller.dto;

import java.util.List;

import br.com.kvm.estoque.modelo.Area;
import br.com.kvm.estoque.modelo.Bairro;
import br.com.kvm.estoque.modelo.Sala;

public class AndarDto {

	private Long id;
	private int numero;
	private List<Area> areas;
	private List<Bairro> bairros;
	private List<Sala> salas;
	public Long getId() {
		return id;
	}
	public int getNumero() {
		return numero;
	}
	public int getAreas() {
		return areas.size();
	}
	public int getBairros() {
		return bairros.size();
	}
	public int getSalas() {
		return salas.size();
	}
}
