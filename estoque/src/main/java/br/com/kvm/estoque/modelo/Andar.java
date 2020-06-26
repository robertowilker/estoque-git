package br.com.kvm.estoque.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Andar {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Predio predio;
	private int numero;
	@OneToMany(mappedBy = "andar")
	private List<Area> areas;
	@OneToMany(mappedBy = "andar")
	private List<Bairro> bairros;
	@OneToMany(mappedBy = "andar")
	private List<Sala> salas;
	
	public Andar() {}
	
	public Andar(Long id, Predio predio, int numero, List<Area> areas, List<Bairro> bairros, List<Sala> salas) {
		this.id = id;
		this.predio = predio;
		this.numero = numero;
		this.areas = areas;
		this.bairros = bairros;
		this.salas = salas;
	}

	public Predio getPredio() {
		return predio;
	}
	public void setPredio(Predio predio) {
		this.predio = predio;
	}
	public Long getId() {
		return id;
	}
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public List<Area> getAreas() {
		return areas;
	}
	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Bairro> getBairros() {
		return bairros;
	}
	public void setBairros(List<Bairro> bairros) {
		this.bairros = bairros;
	}
	public List<Sala> getSalas() {
		return salas;
	}
	public void setSalas(List<Sala> salas) {
		this.salas = salas;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((areas == null) ? 0 : areas.hashCode());
		result = prime * result + ((bairros == null) ? 0 : bairros.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + numero;
		result = prime * result + ((predio == null) ? 0 : predio.hashCode());
		result = prime * result + ((salas == null) ? 0 : salas.hashCode());
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
		Andar other = (Andar) obj;
		if (areas == null) {
			if (other.areas != null)
				return false;
		} else if (!areas.equals(other.areas))
			return false;
		if (bairros == null) {
			if (other.bairros != null)
				return false;
		} else if (!bairros.equals(other.bairros))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (numero != other.numero)
			return false;
		if (predio == null) {
			if (other.predio != null)
				return false;
		} else if (!predio.equals(other.predio))
			return false;
		if (salas == null) {
			if (other.salas != null)
				return false;
		} else if (!salas.equals(other.salas))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Id: " + this.id + ", Numero do Andar: " + this.numero + ".";
	}
}
