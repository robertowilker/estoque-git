package br.com.kvm.estoque.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.kvm.estoque.controller.dto.EmpresaDetalhesDto;
import br.com.kvm.estoque.controller.dto.EmpresaDto;
import br.com.kvm.estoque.controller.form.EmpresaAtualizaForm;
import br.com.kvm.estoque.controller.form.EmpresaForm;
import br.com.kvm.estoque.modelo.Empresa;
import br.com.kvm.estoque.repository.EmpresaRepository;

/**
 * Controller para efetuar operações com a entidade Empresa.
 * 
 * @version 1.0
 * @author Wilker
 *
 */
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
	@Transactional
	public ResponseEntity<EmpresaDto> cadastrar(@RequestBody @Valid EmpresaForm form, UriComponentsBuilder uriBuilder){
		Empresa empresa = form.converter();

		empresaRepository.save(empresa);

		URI uri = uriBuilder.path("/empresa/{id}").buildAndExpand(empresa.getId()).toUri();
		return ResponseEntity.created(uri).body(new EmpresaDto(empresa));

	}

	@GetMapping("/{id}")
	public ResponseEntity<EmpresaDetalhesDto> detalhes(@PathVariable Long id) {
		Optional<Empresa> optional = empresaRepository.findById(id);
		
		if(optional.isPresent()) {
			return ResponseEntity.ok(new EmpresaDetalhesDto(optional.get()));
		}else {
			return ResponseEntity.notFound().build();
		}
	}

	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<EmpresaDto> atualiza(@PathVariable Long id, @RequestBody @Valid EmpresaAtualizaForm form) {
		Optional<Empresa> optional = empresaRepository.findById(id);
		
		if(optional.isPresent()) {
			Empresa empresa = form.atualizar(id, empresaRepository);
			return ResponseEntity.ok(new EmpresaDto(empresa));
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity<Empresa> deleta(@PathVariable Long id) {
		Optional<Empresa> optional = empresaRepository.findById(id);
		
		if(optional.isPresent()) {
			empresaRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}else {
			return ResponseEntity.notFound().build();
		}
	}
}
