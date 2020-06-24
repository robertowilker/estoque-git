package br.com.kvm.estoque.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Area {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeDaArea;
	
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
