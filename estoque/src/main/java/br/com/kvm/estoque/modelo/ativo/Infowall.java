package br.com.kvm.estoque.modelo;

public class Infowall {

	private Long id;
	private String modeloDaBaseDoInfowall;
	private String modeloDeDisplayInstalado;
	private int quantidadeDeMaquinas;
	private String tipoDeMaquinaInstalada;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((modeloDaBaseDoInfowall == null) ? 0 : modeloDaBaseDoInfowall.hashCode());
		result = prime * result + ((modeloDeDisplayInstalado == null) ? 0 : modeloDeDisplayInstalado.hashCode());
		result = prime * result + quantidadeDeMaquinas;
		result = prime * result + ((tipoDeMaquinaInstalada == null) ? 0 : tipoDeMaquinaInstalada.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Infowall other = (Infowall) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (modeloDaBaseDoInfowall == null) {
			if (other.modeloDaBaseDoInfowall != null)
				return false;
		} else if (!modeloDaBaseDoInfowall.equals(other.modeloDaBaseDoInfowall))
			return false;
		if (modeloDeDisplayInstalado == null) {
			if (other.modeloDeDisplayInstalado != null)
				return false;
		} else if (!modeloDeDisplayInstalado.equals(other.modeloDeDisplayInstalado))
			return false;
		if (quantidadeDeMaquinas != other.quantidadeDeMaquinas)
			return false;
		if (tipoDeMaquinaInstalada == null) {
			if (other.tipoDeMaquinaInstalada != null)
				return false;
		} else if (!tipoDeMaquinaInstalada.equals(other.tipoDeMaquinaInstalada))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Id: " + this.id + ", Modelo da base do infowall: " +
				this.modeloDaBaseDoInfowall + ", Quantidade de maquinas instaladas: " + 
				this.quantidadeDeMaquinas + ", Tipo de maquina instalada: " + 
				this.tipoDeMaquinaInstalada + ".";
	}
}
