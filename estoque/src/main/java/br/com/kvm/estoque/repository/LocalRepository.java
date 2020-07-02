package br.com.kvm.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kvm.estoque.modelo.Local;

public interface LocalRepository extends JpaRepository<Local, Long>{

}
