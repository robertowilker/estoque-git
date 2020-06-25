package br.com.kvm.estoque.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.kvm.estoque.controller.dto.EmpresaDto;
import br.com.kvm.estoque.controller.form.EmpresaForm;
import br.com.kvm.estoque.modelo.Empresa;
import br.com.kvm.estoque.repository.EmpresaRepository;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

	@Autowired
	private EmpresaRepository empresaRepository;

	@GetMapping
	public List<EmpresaDto> lista() {
		List<Empresa> empresas = empresaRepository.findAll();
		return EmpresaDto.converter(empresas);
	}

	@PostMapping
	public ResponseEntity<EmpresaDto> cadastrar(@RequestBody @Valid EmpresaForm form, UriComponentsBuilder uriBuilder) throws Exception{
		Empresa empresa;

		empresa = form.converter();

		empresaRepository.save(empresa);

		URI uri = uriBuilder.path("/empresa/{id}").buildAndExpand(empresa.getId()).toUri();
		return ResponseEntity.created(uri).body(new EmpresaDto(empresa));

	}

//	@GetMapping("/{id}")
//	public void detalhes(@PathVariable Long id) {
//	}
}
