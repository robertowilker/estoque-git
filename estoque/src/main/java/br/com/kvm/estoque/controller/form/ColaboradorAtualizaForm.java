package br.com.kvm.estoque.controller.form;

import br.com.kvm.estoque.modelo.Colaborador;
import br.com.kvm.estoque.repository.ColaboradorRepository;

public class ColaboradorAtualizaForm {

	private String telefone;
	private String email;

	public Colaborador atualiza(Long id, ColaboradorRepository colaboradorRepository) {
		Colaborador colaborador = colaboradorRepository.getOne(id);
		colaborador.setTelefone(telefone);
		colaborador.setEmail(email);
		return colaborador;
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
}
