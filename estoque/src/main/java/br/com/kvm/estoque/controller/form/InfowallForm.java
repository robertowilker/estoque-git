package br.com.kvm.estoque.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.kvm.estoque.modelo.ativo.Infowall;

public class InfowallForm {

	@NotEmpty
	private String modeloDaBaseDoInfowall;
	@NotEmpty
	private String modeloDeDisplayInstalado;
	@NotNull
	private int quantidadeDeMaquinas;
	@NotEmpty
	private String tipoDeMaquinaInstalada;
	
	public String getModeloDaBaseDoInfowall() {
		return modeloDaBaseDoInfowall;
	}
	public void setModeloDaBaseDoInfowall(String modeloDaBaseDoInfowall) {
		this.modeloDaBaseDoInfowall = modeloDaBaseDoInfowall;
	}
	public String getModeloDeDisplayInstalado() {
		return modeloDeDisplayInstalado;
	}
	public void setModeloDeDisplayInstalado(String modeloDeDisplayInstalado) {
		this.modeloDeDisplayInstalado = modeloDeDisplayInstalado;
	}
	public int getQuantidadeDeMaquinas() {
		return quantidadeDeMaquinas;
	}
	public void setQuantidadeDeMaquinas(int quantidadeDeMaquinas) {
		this.quantidadeDeMaquinas = quantidadeDeMaquinas;
	}
	public String getTipoDeMaquinaInstalada() {
		return tipoDeMaquinaInstalada;
	}
	public void setTipoDeMaquinaInstalada(String tipoDeMaquinaInstalada) {
		this.tipoDeMaquinaInstalada = tipoDeMaquinaInstalada;
	}
	public Infowall converter() {
		Infowall infowall = new Infowall(modeloDaBaseDoInfowall, modeloDeDisplayInstalado,
				quantidadeDeMaquinas, tipoDeMaquinaInstalada);
		return infowall;
	}
}
