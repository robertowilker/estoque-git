package br.com.kvm.estoque.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
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

import br.com.kvm.estoque.controller.dto.ColaboradorDetalheDto;
import br.com.kvm.estoque.controller.dto.ColaboradorDto;
import br.com.kvm.estoque.controller.form.ColaboradorAtualizaForm;
import br.com.kvm.estoque.controller.form.ColaboradorForm;
import br.com.kvm.estoque.modelo.Colaborador;
import br.com.kvm.estoque.repository.ColaboradorRepository;

@RestController
@RequestMapping("/colaboradores")
public class ColaboradorController {

	@Autowired
	private ColaboradorRepository colaboradorRepository;
	
	@GetMapping
	public List<ColaboradorDto> lista(@PageableDefault(sort = "id", 
		direction = Direction.ASC) Pageable paginacao) {
		List<Colaborador> listaColaboradores = colaboradorRepository.findAll();
		return ColaboradorDto.converter(listaColaboradores);
	}
	
	@Transactional
	@PostMapping
	public ResponseEntity<ColaboradorDto> cadastra(@RequestBody @Valid ColaboradorForm form,
			UriComponentsBuilder uriBuilder) {
		Colaborador colaborador = form.converter();
		colaboradorRepository.save(colaborador);
		
		URI uri = uriBuilder.path("/colaboradores/{id}")
				.buildAndExpand(colaborador.getId())
				.toUri();
		return ResponseEntity.created(uri).body(new ColaboradorDto(colaborador));
	}

	@GetMapping("{id}")
	public ResponseEntity<ColaboradorDetalheDto> detalha(@PathVariable Long id) {
		Optional<Colaborador> optional = colaboradorRepository.findById(id);
		
		if(optional.isPresent()){
			return ResponseEntity.ok(new ColaboradorDetalheDto(optional.get()));
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@Transactional
	@PutMapping("{id}")
	public ResponseEntity<ColaboradorDto> atualiza(@PathVariable Long id, @RequestBody @Valid ColaboradorAtualizaForm form) {
		Optional<Colaborador> optional = colaboradorRepository.findById(id);
		
		if(optional.isPresent()) {
			Colaborador colaborador = form.atualiza(id, colaboradorRepository);
			return ResponseEntity.ok(new ColaboradorDto(colaborador));
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@Transactional
	@DeleteMapping("{id}")
	public ResponseEntity<?> deleta(@PathVariable Long id) {
		Optional<Colaborador> optional = colaboradorRepository.findById(id);
		
		if(optional.isPresent()) {
			colaboradorRepository.delete(optional.get());
			return ResponseEntity.ok().build();
		}else {
			return ResponseEntity.notFound().build();
		}
	}
}
