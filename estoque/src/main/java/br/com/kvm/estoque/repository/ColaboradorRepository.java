package br.com.kvm.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kvm.estoque.modelo.Colaborador;

public interface ColaboradorRepository extends JpaRepository<Colaborador, Long>{

}
