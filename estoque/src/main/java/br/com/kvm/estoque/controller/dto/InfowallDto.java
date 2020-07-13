package br.com.kvm.estoque.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.kvm.estoque.modelo.ativo.Infowall;

public class InfowallDto {

	private Long id;
	private String modeloDaBaseDoInfowall;
	private String modeloDeDisplayInstalado;
	
	public InfowallDto(Infowall infowall) {
		this.id = infowall.getId();
		this.modeloDaBaseDoInfowall = infowall.getModeloDaBaseDoInfowall();
		this.modeloDeDisplayInstalado = infowall.getModeloDeDisplayInstalado();
	}
	
	public static List<InfowallDto> converter(List<Infowall> listaDeInfowall) {
		return listaDeInfowall.stream().map(InfowallDto::new).collect(Collectors.toList());
	}
	public Long getId() {
		return id;
	}
	public String getModeloDaBaseDoInfowall() {
		return modeloDaBaseDoInfowall;
	}
	public String getModeloDeDisplayInstalado() {
		return modeloDeDisplayInstalado;
	}
}
