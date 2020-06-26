package br.com.kvm.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kvm.estoque.modelo.Predio;

public interface PredioRepository extends JpaRepository<Predio, Long>{

}
