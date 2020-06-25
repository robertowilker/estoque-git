package br.com.kvm.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kvm.estoque.modelo.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{

}
