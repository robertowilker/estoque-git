package br.com.kvm.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kvm.estoque.modelo.ativo.Infowall;

public interface InfowallRepository extends JpaRepository<Infowall, Long>{

}
