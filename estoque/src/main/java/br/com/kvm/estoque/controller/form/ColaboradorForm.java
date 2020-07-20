package br.com.kvm.estoque.controller.form;

import javax.validation.constraints.NotEmpty;

import br.com.kvm.estoque.modelo.Colaborador;
import br.com.kvm.estoque.modelo.ColaboradorBuilder;

public class ColaboradorForm {

	@NotEmpty
	private String nome;
	@NotEmpty
	private String cpf;
	@NotEmpty
	private String rg;
	@NotEmpty
	private String nascimento;
	
	@NotEmpty
	private String telefone;
	@NotEmpty
	private String email;
	@NotEmpty
	private String senha;
	 
	@NotEmpty
	private String cargo;

	@NotEmpty
	private String rua;
	@NotEmpty
	private String bairro;
	@NotEmpty
	private String complemento;
	@NotEmpty
	private String numeroDaCasa;
	
	public Colaborador converter() {
		ColaboradorBuilder colaboradorBuilder = new ColaboradorBuilder();
		
		return colaboradorBuilder.oColaborador(nome, cpf, cargo)
		.nascidoEm(nascimento)
		.contatos(telefone, email)
		.comOCargo(cargo)
		.moraNesteEndereco(rua, bairro, complemento, numeroDaCasa)
		.build();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getNumeroDaCasa() {
		return numeroDaCasa;
	}
	public void setNumeroDaCasa(String numeroDaCasa) {
		this.numeroDaCasa = numeroDaCasa;
	}
}
