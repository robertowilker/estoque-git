package br.com.kvm.estoque.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.kvm.estoque.modelo.Tv;
import br.com.kvm.estoque.repository.TvRepository;

public class TvAtualizaForm {

	@NotEmpty
	private String modelo;
	@NotNull
	private int polegadas;

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getPolegadas() {
		return polegadas;
	}
	public void setPolegadas(int polegadas) {
		this.polegadas = polegadas;
	}
	public Tv atualiza(Long id, TvRepository tvRepository) {
		Tv tv = tvRepository.getOne(id);
		tv.setModelo(modelo);
		tv.setPolegadas(polegadas);
		return tv;
	}
}
