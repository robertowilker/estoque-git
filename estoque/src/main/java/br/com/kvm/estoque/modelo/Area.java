package br.com.kvm.estoque.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Area {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Andar andar;
	private String nomeDaArea;
	
	public Area() {}
	
	public Area(Long id, Andar andar, String nomeDaArea) {
		this.id = id;
		this.andar = andar;
		this.nomeDaArea = nomeDaArea;
	}

	public Andar getAndar() {
		return andar;
	}
	public void setAndar(Andar andar) {
		this.andar = andar;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeDaArea() {
		return nomeDaArea;
	}
	public void setNomeDaArea(String nomeDaArea) {
		this.nomeDaArea = nomeDaArea;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((andar == null) ? 0 : andar.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomeDaArea == null) ? 0 : nomeDaArea.hashCode());
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
		Area other = (Area) obj;
		if (andar == null) {
			if (other.andar != null)
				return false;
		} else if (!andar.equals(other.andar))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomeDaArea == null) {
			if (other.nomeDaArea != null)
				return false;
		} else if (!nomeDaArea.equals(other.nomeDaArea))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Id: " + this.id + ", Nome da Area: " + this.nomeDaArea + ".";
	}
}
