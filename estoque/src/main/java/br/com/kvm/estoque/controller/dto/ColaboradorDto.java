package br.com.kvm.estoque.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.kvm.estoque.modelo.Colaborador;

public class ColaboradorDto {

	private String nome;
	private String email;
	private String telefone;
	
	public ColaboradorDto(Colaborador colaborador) {
		this.nome = colaborador.getNome();
		this.email = colaborador.getEmail();
		this.telefone = colaborador.getTelefone();
	}
	public static List<ColaboradorDto> converter(List<Colaborador> colaboradores) {
		return colaboradores.stream().map(ColaboradorDto::new).collect(Collectors.toList());
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
