package br.com.kvm.estoque.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.kvm.estoque.modelo.Empresa;
import br.com.kvm.estoque.modelo.Predio;

public class PredioDto {

	private Empresa empresa;
	private String nome;
	private String cep;
	private int numeroDoEndereco;
	
	public PredioDto(Predio predio) {
		this.empresa = predio.getEmpresa();
		this.nome = predio.getNome();
		this.cep = predio.getCep();
		this.numeroDoEndereco = predio.getNumeroDoEndereco();
	}
	
	public Empresa getEmpresa() {
		return empresa;
	}
	public String getNome() {
		return nome;
	}
	public String getCep() {
		return cep;
	}
	public int getNumeroDoEndereco() {
		return numeroDoEndereco;
	}
	public static List<PredioDto> converter(List<Predio> predios) {
		return predios.stream().map(PredioDto::new).collect(Collectors.toList());
	}
}
