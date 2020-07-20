package br.com.kvm.estoque.modelo;

public class ColaboradorBuilder {

	private String nome;
	private String cpf;
	private String rg;
	private String nascimento;
	
	private String telefone;
	private String email;
	private String senha;
	 
	private String cargo;
	 
	private String rua;
	private String bairro;
	private String complemento;
	private String numeroDaCasa;
	
	public Colaborador build() {
		return new Colaborador(nome, cpf, rg, nascimento, telefone, email,
				senha, cargo, rua, bairro, complemento, numeroDaCasa);
	}
	
	public ColaboradorBuilder oColaborador(String nome, String  cpf, String rg) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		return this;
	}
	
	public ColaboradorBuilder nascidoEm(String nascimento) {
		this.nascimento = nascimento;
		return this;
	}
	
	public ColaboradorBuilder contatos(String telefone, String email) {
		this.telefone = telefone;
		this.email = email;
		return this;
	}
	
	public ColaboradorBuilder senhaDeAcesso(String senha) {
		this.senha = senha;
		return this;
	}
	
	public ColaboradorBuilder comOCargo(String cargo) {
		this.cargo = cargo;
		return this;
	}
	
	public ColaboradorBuilder moraNesteEndereco(String rua, String bairro, String complemento,
			String numeroDaCasa) {
		this.rua = rua;
		this.bairro = bairro;
		this.complemento = complemento;
		this.numeroDaCasa = numeroDaCasa;
		return this;
	}
}
