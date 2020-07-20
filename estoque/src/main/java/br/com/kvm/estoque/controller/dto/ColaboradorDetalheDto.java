package br.com.kvm.estoque.controller.dto;

import br.com.kvm.estoque.modelo.Colaborador;

public class ColaboradorDetalheDto {

	private Long id;
	private String nome;
	private String cpf;
	private String rg;
	private String nascimento;
	
	private String telefone;
	private String email;
	 
	private String cargo;
	 
	private String rua;
	private String bairro;
	private String complemento;
	private String numeroDaCasa;
	
	public ColaboradorDetalheDto(Colaborador colaborador) {
		this.id = colaborador.getId();
		this.nome = colaborador.getNome();
		this.cpf = colaborador.getCpf();
		this.rg = colaborador.getRg();
		this.nascimento = colaborador.getNascimento();
		this.telefone = colaborador.getTelefone();
		this.email = colaborador.getEmail();
		this.cargo = colaborador.getCargo();
		this.rua = colaborador.getRua();
		this.bairro = colaborador.getBairro();
		this.complemento = colaborador.getComplemento();
		this.numeroDaCasa = colaborador.getNumeroDaCasa();
	}
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getRg() {
		return rg;
	}
	public String getNascimento() {
		return nascimento;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getEmail() {
		return email;
	}
	public String getCargo() {
		return cargo;
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
	public String getNumeroDaCasa() {
		return numeroDaCasa;
	}
}