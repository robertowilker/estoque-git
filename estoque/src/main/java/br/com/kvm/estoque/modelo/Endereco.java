package br.com.kvm.estoque.modelo;

import java.io.IOException;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;

@Entity
public class Endereco {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne
	private Predio predio;
	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String localidade;
	private String uf;
	
	public Endereco() {}
	
	public Endereco(String cep, Predio predio, String logradouro, String complemento, String bairro, String localidade, String uf) {
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.localidade = localidade;
		this.uf = uf;
	}
	
	public Endereco(String cep, String logradouro, String complemento, String bairro, String localidade, String uf) {
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.localidade = localidade;
		this.uf = uf;
	}

	/**
	 * Busca o CEP passado na API do ViaCEP,
	 * e retorna as informações do endereço
	 * caso exista.
	 * 
	 * @param cep
	 * @return
	 */
	public Endereco buscaEnderecoPeloCEP(String cep) {
		
		ViaCEPClient cliente = new ViaCEPClient();
		ViaCEPEndereco viaCEPEndereco;
		Endereco endereco;
		formataCEP(cep);
		
		try {
			viaCEPEndereco = cliente.getEndereco(cep);
			
			endereco = new Endereco(viaCEPEndereco.getCep(), viaCEPEndereco.getLogradouro(), viaCEPEndereco.getLogradouro(),
					viaCEPEndereco.getBairro(), viaCEPEndereco.getLocalidade(), viaCEPEndereco.getUf());
			
			return endereco;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		 return null;
	}
	
	/**
	 * Esse metodo retira a mascara
	 * do CEP para tornalo pesquisavel
	 * usando a API viaCEP.
	 * 
	 * @param cep
	 * @return
	 */
	private String formataCEP(String cep) {
		if(cep.contains(".")) {
			cep.replace(".", "");
		}
		if(cep.contains("-")) {
			cep.replace("-", "");
		}
		if(cep.contains("_")) {
			cep.replace("_", "");
		}
		
		return cep;
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

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((localidade == null) ? 0 : localidade.hashCode());
		result = prime * result + ((logradouro == null) ? 0 : logradouro.hashCode());
		result = prime * result + ((predio == null) ? 0 : predio.hashCode());
		result = prime * result + ((uf == null) ? 0 : uf.hashCode());
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
		Endereco other = (Endereco) obj;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		if (complemento == null) {
			if (other.complemento != null)
				return false;
		} else if (!complemento.equals(other.complemento))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (localidade == null) {
			if (other.localidade != null)
				return false;
		} else if (!localidade.equals(other.localidade))
			return false;
		if (logradouro == null) {
			if (other.logradouro != null)
				return false;
		} else if (!logradouro.equals(other.logradouro))
			return false;
		if (predio == null) {
			if (other.predio != null)
				return false;
		} else if (!predio.equals(other.predio))
			return false;
		if (uf == null) {
			if (other.uf != null)
				return false;
		} else if (!uf.equals(other.uf))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Id: " + this.id + ", CEP: " + this.cep + ", Logradouro: " + 
				this.logradouro + ", Complemento: " + this.complemento + ", Bairro: " +
				this.bairro + ", Localidade: " + this.localidade + ", UF: " + this.uf;
	}
	
//	Teste de busca na API ViaCEP
//	public static void main(String[] args) {
//		Endereco endereco = new Endereco().buscaEnderecoPeloCEP("04858-620");
//		System.out.println(endereco);
//	}
}
