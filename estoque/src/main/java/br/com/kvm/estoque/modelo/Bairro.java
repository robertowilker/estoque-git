package br.com.kvm.estoque.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bairro {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeDoBairro;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeDoBairro() {
		return nomeDoBairro;
	}
	public void setNomeDoBairro(String nomeDoBairro) {
		this.nomeDoBairro = nomeDoBairro;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomeDoBairro == null) ? 0 : nomeDoBairro.hashCode());
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
		Bairro other = (Bairro) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomeDoBairro == null) {
			if (other.nomeDoBairro != null)
				return false;
		} else if (!nomeDoBairro.equals(other.nomeDoBairro))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Id: " + this.id + ", Nome do Bairro: " + this.nomeDoBairro + ".";
	}
}
