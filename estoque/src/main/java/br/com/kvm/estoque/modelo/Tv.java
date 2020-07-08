package br.com.kvm.estoque.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tv {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String marca;
	private String modelo;
	private int polegadas;
	private String numeroDeSerie;
	
	public Tv() {}
	
	public Tv(String marca, String modelo, int polegadas, String numeroDeSerie) {
		this.marca = marca;
		this.modelo = modelo;
		this.polegadas = polegadas;
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
	public int getPolegadas() {
		return polegadas;
	}
	public void setPolegadas(int polegadas) {
		this.polegadas = polegadas;
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
		result = prime * result + ((numeroDeSerie == null) ? 0 : numeroDeSerie.hashCode());
		result = prime * result + polegadas;
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
		Tv other = (Tv) obj;
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
		if (numeroDeSerie == null) {
			if (other.numeroDeSerie != null)
				return false;
		} else if (!numeroDeSerie.equals(other.numeroDeSerie))
			return false;
		if (polegadas != other.polegadas)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Id: " + this.id + ", Marca: " + this.marca + ", Modelo: " +
				this.modelo + ", Polegadas: " + this.polegadas + 
				", Número de Série: " + this.numeroDeSerie + ".";
	}
}
