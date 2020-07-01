package br.com.kvm.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kvm.estoque.modelo.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>{

}
