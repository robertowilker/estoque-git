package br.com.kvm.estoque.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.kvm.estoque.controller.dto.PredioDetalheDto;
import br.com.kvm.estoque.controller.dto.PredioDto;
import br.com.kvm.estoque.controller.form.PredioForm;
import br.com.kvm.estoque.modelo.Predio;
import br.com.kvm.estoque.repository.PredioRepository;

@RestController
@RequestMapping("/predio")
public class PredioController {

	@Autowired
	private PredioRepository predioRepository;
	
	@GetMapping
	public List<PredioDto> lista() {
		List<Predio> predios = predioRepository.findAll();
		return PredioDto.converter(predios);
	}
	
	@PostMapping
	@Transactional
	public ResponseEntity<PredioDto> cadastrar(@RequestBody @Valid PredioForm form, UriComponentsBuilder uriBuilder) {
		Predio predio = form.converter();
		
		predioRepository.save(predio);
		
		URI uri = uriBuilder.path("/predio/{id}").buildAndExpand(predio.getId()).toUri();
		return ResponseEntity.created(uri).body(new PredioDto(predio));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PredioDetalheDto> detalhe(@PathVariable Long id) {
		Optional<Predio> optional = predioRepository.findById(id);
		
		if(optional.isPresent()) {
			return ResponseEntity.ok(new PredioDetalheDto(optional.get()));
		}else {
			return ResponseEntity.notFound().build();
		}
	}
}
