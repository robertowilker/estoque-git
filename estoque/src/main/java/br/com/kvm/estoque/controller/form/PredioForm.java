package br.com.kvm.estoque.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.kvm.estoque.modelo.Empresa;
import br.com.kvm.estoque.modelo.Predio;
import br.com.kvm.estoque.repository.EmpresaRepository;

public class PredioForm {

	private String nomeEmpresa;
	@NotEmpty
	private String nome;
	@NotEmpty
	private String cep;
	@NotEmpty
	private String rua;
	@NotEmpty
	private String bairro;
	@NotEmpty
	private String complemento;
	@NotNull
	private int numeroDoEndereco;
	
	public Predio converter(EmpresaRepository empresaRepository) {
		
		Empresa empresa = empresaRepository.findByNome(nomeEmpresa);
		
		Predio predio = new Predio(empresa, nome, cep, rua, bairro, complemento,
				numeroDoEndereco);
		return predio;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
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
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumeroDoEndereco() {
		return numeroDoEndereco;
	}
	public void setNumeroDoEndereco(int numeroDoEndereco) {
		this.numeroDoEndereco = numeroDoEndereco;
	}
}
