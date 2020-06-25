package br.com.kvm.estoque.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.kvm.estoque.modelo.Empresa;

@RunWith(SpringRunner.class)
@DataJpaTest
public class EmpresaRepositoryTest {
	
	@Autowired
	private EmpresaRepository repository;
	
	@Test
	public void createShouldPersistData() {
		Empresa empresa = new Empresa("Santander", "77.839.141/0001-27");
		this.repository.save(empresa);
		Assertions.assertThat(empresa.getId()).isNotNull();
		Assertions.assertThat(empresa.getNome()).isEqualTo("Santander");
		Assertions.assertThat(empresa.getCnpj()).isEqualTo("77.839.141/0001-27");
	}
}
