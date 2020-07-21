package br.com.kvm.estoque.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Local {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeDoLocal;
	@ManyToOne
	private Predio predio;
	private int numeroDoAndar;
	
	@Deprecated
	public Local() {}
	
	public Local(String nomeDoLocal, Predio predio, int numeroDoAndar) {
		this.nomeDoLocal = nomeDoLocal;
		this.predio = predio;
		this.numeroDoAndar = numeroDoAndar;
	}
	
	public Local(Long id, String nomeDoLocal, Predio predio, int numeroDoAndar) {
		this.id = id;
		this.nomeDoLocal = nomeDoLocal;
		this.predio = predio;
		this.numeroDoAndar = numeroDoAndar;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeDoLocal() {
		return nomeDoLocal;
	}
	public void setNomeDoLocal(String nomeDoLocal) {
		this.nomeDoLocal = nomeDoLocal;
	}
	public Predio getPredio() {
		return predio;
	}
	public void setPredio(Predio predio) {
		this.predio = predio;
	}
	public int getNumeroDoAndar() {
		return numeroDoAndar;
	}
	public void setNumeroDoAndar(int numeroDoAndar) {
		this.numeroDoAndar = numeroDoAndar;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomeDoLocal == null) ? 0 : nomeDoLocal.hashCode());
		result = prime * result + numeroDoAndar;
		result = prime * result + ((predio == null) ? 0 : predio.hashCode());
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
		Local other = (Local) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomeDoLocal == null) {
			if (other.nomeDoLocal != null)
				return false;
		} else if (!nomeDoLocal.equals(other.nomeDoLocal))
			return false;
		if (numeroDoAndar != other.numeroDoAndar)
			return false;
		if (predio == null) {
			if (other.predio != null)
				return false;
		} else if (!predio.equals(other.predio))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Id: " + this.id + ", Nome do local: " + this.nomeDoLocal +
				 ", Andar: " + this.numeroDoAndar + ".";
	}
}
