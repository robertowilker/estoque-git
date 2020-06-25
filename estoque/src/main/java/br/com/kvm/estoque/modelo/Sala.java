package br.com.kvm.estoque.modelo;

public class Sala {

	private Long id;
	private String nomeDaSala;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeDaSala() {
		return nomeDaSala;
	}
	public void setNomeDaSala(String nomeDaSala) {
		this.nomeDaSala = nomeDaSala;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomeDaSala == null) ? 0 : nomeDaSala.hashCode());
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
		Sala other = (Sala) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomeDaSala == null) {
			if (other.nomeDaSala != null)
				return false;
		} else if (!nomeDaSala.equals(other.nomeDaSala))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Id: " + this.id + ", Nome da Sala: " + this.nomeDaSala + ".";
	}
}
