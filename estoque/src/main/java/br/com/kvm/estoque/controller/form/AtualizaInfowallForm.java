package br.com.kvm.estoque.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.kvm.estoque.modelo.ativo.Infowall;
import br.com.kvm.estoque.repository.InfowallRepository;

public class AtualizaInfowallForm {

	@NotEmpty
	private String modeloDeDisplayInstalado;
	@NotNull
	private int quantidadeDeMaquinas;
	
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
	public Infowall atualiza(Long id, InfowallRepository infowallRepository) {
		Infowall infowall = infowallRepository.getOne(id);
		infowall.setModeloDeDisplayInstalado(modeloDeDisplayInstalado);
		infowall.setQuantidadeDeMaquinas(quantidadeDeMaquinas);
		return infowall;
	}
}
