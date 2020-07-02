package br.com.kvm.estoque.controller.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.kvm.estoque.modelo.Predio;

public class PredioDetalheDto {

	private Long id;
	private String nomeEempresa;
	private String nome;
	private String cep;
	private String rua;
	private String bairro;
	private String complemento;
	private int numeroDoEndereco;
	private List<AndarDto> andares;
	
	public PredioDetalheDto(Predio predio) {
		this.id = predio.getId();
		this.nomeEempresa = predio.getEmpresa().getNome();
		this.cep = predio.getCep();
		this.rua = predio.getRua();
		this.bairro = predio.getBairro();
		this.complemento = predio.getComplemento();
		this.numeroDoEndereco = predio.getNumeroDoEndereco();
		this.andares = new ArrayList<>();
		this.andares.addAll(predio.getAndares().stream().map(AndarDto::new).collect(Collectors.toList()));
	}
	
	public String getRua() {
		return rua;
	}
	public String getBairro() {
		return bairro;
	}
	public String getComplemento() {
		return complemento;
	}
	public Long getId() {
		return id;
	}
	public String getEmpresa() {
		return nomeEempresa;
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
	public List<AndarDto> getAndares() {
		return andares;
	}
}
