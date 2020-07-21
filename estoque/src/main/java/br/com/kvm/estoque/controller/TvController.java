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

import br.com.kvm.estoque.controller.dto.TvDto;
import br.com.kvm.estoque.controller.form.TvAtualizaForm;
import br.com.kvm.estoque.controller.form.TvForm;
import br.com.kvm.estoque.modelo.ativo.Tv;
import br.com.kvm.estoque.repository.TvRepository;

@RestController
@RequestMapping("/ativos/tv")
public class TvController {

	@Autowired
	private TvRepository tvRepository;
	
	@GetMapping
	public List<TvDto> lista(@PageableDefault(sort = "id",
		direction = Direction.ASC) Pageable paginacao) {
		List<Tv> tvs = tvRepository.findAll();
		return TvDto.converter(tvs);
	}
	
	@PostMapping
	public ResponseEntity<TvDto> cadastrar(@RequestBody @Valid TvForm form, UriComponentsBuilder uriBuilder){
		Tv tv = form.converter();
		tvRepository.save(tv);
		
		URI uri = uriBuilder.path("/ativos/tv/{id}").buildAndExpand(tv.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping("{id}")
	public ResponseEntity<TvDto> atualizar(@PathVariable Long id, @RequestBody TvAtualizaForm form) {
		Optional<Tv> optional = tvRepository.findById(id);
		
		if(optional.isPresent()) {
			Tv tv = form.atualiza(id, tvRepository);
			return ResponseEntity.ok(new TvDto(tv));
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<?> deletar(@PathVariable Long id) {
		Optional<Tv> optional = tvRepository.findById(id);
		
		if(optional.isPresent()) {
			tvRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}else {
			return ResponseEntity.notFound().build();
		}
	}
}
