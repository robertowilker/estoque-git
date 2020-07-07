package br.com.kvm.estoque.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.kvm.estoque.controller.dto.LocalDetalheDto;
import br.com.kvm.estoque.controller.dto.LocalDto;
import br.com.kvm.estoque.controller.form.LocalAtualizaForm;
import br.com.kvm.estoque.controller.form.LocalForm;
import br.com.kvm.estoque.modelo.Local;
import br.com.kvm.estoque.repository.LocalRepository;
import br.com.kvm.estoque.repository.PredioRepository;

@RestController
@RequestMapping("/predio/local")
public class LocalController {

	@Autowired
	private PredioRepository predioRepository;
	
	@Autowired
	private LocalRepository localRepository;
	
	@GetMapping
	public List<LocalDto> lista(@PageableDefault(sort = "id",
		direction = Direction.ASC) Pageable paginacao) {
		List<Local> locais = localRepository.findAll();
		return LocalDto.converter(locais);
	}
	
	@PostMapping
	public ResponseEntity<LocalDto> cadastra(@RequestBody @Valid LocalForm form, UriComponentsBuilder uriBuilder) {
		Local local = form.converter(predioRepository);
		localRepository.save(local);
		
		URI uri = uriBuilder.path("/local/{id}").buildAndExpand(local.getId()).toUri();
		return ResponseEntity.created(uri).body(new LocalDto(local));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<LocalDetalheDto> detalhes(@PathVariable Long id) {
		Optional<Local> optional = localRepository.findById(id);
		
		if(optional.isPresent()) {
			return ResponseEntity.ok(new LocalDetalheDto(optional.get()));
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<LocalDto> atualiza(@PathVariable Long id, @RequestBody @Valid LocalAtualizaForm form) {
		Optional<Local> optional = localRepository.findById(id);
		
		if(optional.isPresent()) {
			Local local = form.atualizar(id, localRepository);
			return ResponseEntity.ok(new LocalDto(local));
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<?> deleta(@PathVariable Long id) {
		Optional<Local> optional = localRepository.findById(id);
		
		if(optional.isPresent()) {
			localRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}else {
			return ResponseEntity.notFound().build();
		}
	}
}
