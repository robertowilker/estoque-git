package br.com.kvm.estoque.modelo.ativo;

public class Projetor {

	private Long id;
	private String marca;
	private String modelo;
	private String quantidadeDeHorasDeUsoDaLampadaDoProjetor;
	private String modeloDaLampadaDoProjetor;
	private String numeroDeSerie;
	
	@Deprecated
	public Projetor() {}
	
	public Projetor(Long id, String marca, String modelo, String quantidadeDeHorasDeUsoDaLampadaDoProjetor,
			String modeloDaLampadaDoProjetor, String numeroDeSerie) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.quantidadeDeHorasDeUsoDaLampadaDoProjetor = quantidadeDeHorasDeUsoDaLampadaDoProjetor;
		this.modeloDaLampadaDoProjetor = modeloDaLampadaDoProjetor;
		this.numeroDeSerie = numeroDeSerie;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getQuantidadeDeHorasDeUsoDaLampadaDoProjetor() {
		return quantidadeDeHorasDeUsoDaLampadaDoProjetor;
	}
	public void setQuantidadeDeHorasDeUsoDaLampadaDoProjetor(String quantidadeDeHorasDeUsoDaLampadaDoProjetor) {
		this.quantidadeDeHorasDeUsoDaLampadaDoProjetor = quantidadeDeHorasDeUsoDaLampadaDoProjetor;
	}
	public String getModeloDaLampadaDoProjetor() {
		return modeloDaLampadaDoProjetor;
	}
	public void setModeloDaLampadaDoProjetor(String modeloDaLampadaDoProjetor) {
		this.modeloDaLampadaDoProjetor = modeloDaLampadaDoProjetor;
	}
	public String getNumeroDeSerie() {
		return numeroDeSerie;
	}
	public void setNumeroDeSerie(String numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((modeloDaLampadaDoProjetor == null) ? 0 : modeloDaLampadaDoProjetor.hashCode());
		result = prime * result + ((numeroDeSerie == null) ? 0 : numeroDeSerie.hashCode());
		result = prime * result + ((quantidadeDeHorasDeUsoDaLampadaDoProjetor == null) ? 0
				: quantidadeDeHorasDeUsoDaLampadaDoProjetor.hashCode());
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
		Projetor other = (Projetor) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (modeloDaLampadaDoProjetor == null) {
			if (other.modeloDaLampadaDoProjetor != null)
				return false;
		} else if (!modeloDaLampadaDoProjetor.equals(other.modeloDaLampadaDoProjetor))
			return false;
		if (numeroDeSerie == null) {
			if (other.numeroDeSerie != null)
				return false;
		} else if (!numeroDeSerie.equals(other.numeroDeSerie))
			return false;
		if (quantidadeDeHorasDeUsoDaLampadaDoProjetor == null) {
			if (other.quantidadeDeHorasDeUsoDaLampadaDoProjetor != null)
				return false;
		} else if (!quantidadeDeHorasDeUsoDaLampadaDoProjetor.equals(other.quantidadeDeHorasDeUsoDaLampadaDoProjetor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Id: " + this.id + ", Marca: " + this.marca + ", Modelo: " + 
				this.modelo + ".";
	}
}
