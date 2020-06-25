package br.com.kvm.estoque.controller.form;

import java.util.List;

import br.com.kvm.estoque.modelo.Empresa;
import br.com.kvm.estoque.modelo.Predio;

public class EmpresaForm {

	private String nome;
	private String cnpj;
	private List<Predio> predios;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public List<Predio> getPredios() {
		return predios;
	}
	public void setPredios(List<Predio> predios) {
		this.predios = predios;
	}
	public Empresa converter() {
		Empresa empresa = new Empresa();
		empresa.setNome(nome);
		empresa.setCnpj(cnpj);
		empresa.setPredios(predios);
		return empresa;
	}
}
