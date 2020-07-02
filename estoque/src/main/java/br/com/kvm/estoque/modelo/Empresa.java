package br.com.kvm.estoque.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.validation.CNPJValidator;

/**
 * Classe com os dados da empresa do cliente, com validador de CNPJ
 * 
 * @Version 1.0
 * @author Wilker
 *
 */
@Entity
public class Empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String cnpj;
	@OneToMany(mappedBy = "empresa")
	private List<Predio> predios;

	public Empresa() {}

	public Empresa(String nome, String cnpj) {
		validaCNPJ(cnpj);
		this.nome = nome;
		this.cnpj = cnpj;
	}

	private boolean validaCNPJ(String cnpj) {
		CNPJFormatter formatadorCNPJ = new CNPJFormatter();
		String cnpjSemFormatacao = formatadorCNPJ.unformat(cnpj);

		CNPJValidator validadorCnpj = new CNPJValidator();
		validadorCnpj.assertValid(cnpjSemFormatacao);
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {

		this.cnpj = cnpj;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Empresa other = (Empresa) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
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
		return true;
	}

	@Override
	public String toString() {
		return "Id: " + this.id + ", Nome: " + this.nome + ", CNPJ: " + this.cnpj + ".";
	}
}
