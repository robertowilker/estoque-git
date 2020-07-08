package br.com.kvm.estoque.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.kvm.estoque.modelo.Tv;

public class TvDto {

	private String marca;
	private int polegadas;
	
	public TvDto(Tv tv) {
		this.marca = tv.getMarca();
		this.polegadas = tv.getPolegadas();
	}
	
	public String getMarca() {
		return marca;
	}
	public int getPolegadas() {
		return polegadas;
	}
	public static List<TvDto> converter(List<Tv> tvs) {
		return tvs.stream().map(TvDto::new).collect(Collectors.toList());
	}
}
