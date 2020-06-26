package br.com.kvm.estoque.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Predio {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Empresa empresa;
	private String nome;
	private String cep;
	@OneToOne(mappedBy = "predio")
	private Endereco endereco;
	private int numeroDoEndereco;
	@OneToMany(mappedBy = "predio")
	private List<Andar> andares = new ArrayList<>();
	
	public Predio() {}
	
	public Predio(String nome, String cep, Endereco endereco, int numeroDoEndereco) {
		this.nome = nome;
		this.endereco = endereco;
		this.numeroDoEndereco = numeroDoEndereco;
	}

	public Predio(Empresa empresa, String nome, Endereco endereco, int numeroDoEndereco, List<Andar> andares) {
		this.empresa = empresa;
		this.nome = nome;
		this.endereco = endereco;
		this.numeroDoEndereco = numeroDoEndereco;
		this.andares = andares;
	}
	
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public int getNumeroDoEndereco() {
		return numeroDoEndereco;
	}
	public void setNumeroDoEndereco(int numeroDoEndereco) {
		this.numeroDoEndereco = numeroDoEndereco;
	}
	public List<Andar> getAndares() {
		return andares;
	}
	public void setAndares(List<Andar> andares) {
		this.andares = andares;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((andares == null) ? 0 : andares.hashCode());
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + numeroDoEndereco;
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
		Predio other = (Predio) obj;
		if (andares == null) {
			if (other.andares != null)
				return false;
		} else if (!andares.equals(other.andares))
			return false;
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroDoEndereco != other.numeroDoEndereco)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Id: " + this.id + ", Empresa: " + this.empresa.getNome() + 
				", Nome do Predio: " + this.nome + ".";
	}
}
