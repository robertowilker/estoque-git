package br.com.kvm.estoque.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.kvm.estoque.modelo.Empresa;

public class EmpresaDto {

	private String nome;
	private String cnpj;
	
	public EmpresaDto(Empresa empresa) {
		this.nome = empresa.getNome();
		this.cnpj = empresa.getCnpj();
	}
	
	public String getNome() {
		return nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public static List<EmpresaDto> converter(List<Empresa> empresas) {
		return empresas.stream().map(EmpresaDto::new).collect(Collectors.toList());
	}
	
	
}
