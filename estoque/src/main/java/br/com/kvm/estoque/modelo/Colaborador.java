package br.com.kvm.estoque.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Colaborador {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String cpf;
	private String rg;
	private String nascimento;
	
	private String telefone;
	private String email;
	private String senha;
//	private String perfil;
	 
	private String cargo;
	 
	private String rua;
	private String bairro;
	private String complemento;
	private String numeroDaCasa;
	// construtor para fins de infraestrutura
	@Deprecated
	public Colaborador() {}

	public Colaborador(String nome, String nascimento, String cpf, String rg, String telefone, String email,
			String senha, String cargo, String rua, String bairro, String complemento, String numeroDaCasa) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.cpf = cpf;
		this.rg = rg;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
		this.cargo = cargo;
		this.rua = rua;
		this.bairro = bairro;
		this.complemento = complemento;
		this.numeroDaCasa = numeroDaCasa;
	}
	
	public Colaborador(Long id, String nome, String nascimento, String cpf, String rg, String telefone, String email,
			String senha, String cargo, String rua, String bairro, String complemento, String numeroDaCasa) {
		this.id = id;
		this.nome = nome;
		this.nascimento = nascimento;
		this.cpf = cpf;
		this.rg = rg;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
		this.cargo = cargo;
		this.rua = rua;
		this.bairro = bairro;
		this.complemento = complemento;
		this.numeroDaCasa = numeroDaCasa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nascimento == null) ? 0 : nascimento.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numeroDaCasa == null) ? 0 : numeroDaCasa.hashCode());
		result = prime * result + ((rg == null) ? 0 : rg.hashCode());
		result = prime * result + ((rua == null) ? 0 : rua.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
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
		Colaborador other = (Colaborador) obj;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		if (complemento == null) {
			if (other.complemento != null)
				return false;
		} else if (!complemento.equals(other.complemento))
			return false;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nascimento == null) {
			if (other.nascimento != null)
				return false;
		} else if (!nascimento.equals(other.nascimento))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroDaCasa == null) {
			if (other.numeroDaCasa != null)
				return false;
		} else if (!numeroDaCasa.equals(other.numeroDaCasa))
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		if (rua == null) {
			if (other.rua != null)
				return false;
		} else if (!rua.equals(other.rua))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
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

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getNumeroDaCasa() {
		return numeroDaCasa;
	}

	public void setNumeroDaCasa(String numeroDaCasa) {
		this.numeroDaCasa = numeroDaCasa;
	}

	@Override
	public String toString() {
		return "Colaborador [id=" + id + ", nome=" + nome + ", nascimento=" + nascimento + ", cpf=" + cpf + ", rg=" + rg
				+ ", telefone=" + telefone + ", email=" + email + ", senha=" + senha + ", cargo=" + cargo + ", rua="
				+ rua + ", bairro=" + bairro + ", complemento=" + complemento + ", numeroDaCasa=" + numeroDaCasa + "]";
	}
}
