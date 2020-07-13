package br.com.kvm.estoque.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.kvm.estoque.controller.dto.InfowallDto;
import br.com.kvm.estoque.controller.form.AtualizaInfowallForm;
import br.com.kvm.estoque.controller.form.InfowallForm;
import br.com.kvm.estoque.modelo.ativo.Infowall;
import br.com.kvm.estoque.repository.InfowallRepository;

@RestController
@RequestMapping("/ativos/infowall")
public class InfowallController {

	@Autowired
	private InfowallRepository infowallRepository;
	
	@GetMapping
	public List<InfowallDto> lista() {
		List<Infowall> listaDeInfowall = infowallRepository.findAll();
		return InfowallDto.converter(listaDeInfowall);
	}
	
	@PostMapping
	public ResponseEntity<InfowallDto> cadastrar(@RequestBody @Valid InfowallForm form, UriComponentsBuilder uriBuilder) {
		Infowall infowall = form.converter();
		infowallRepository.save(infowall);
		
		URI uri = uriBuilder.path("/ativos/infowall/{id}").buildAndExpand(infowall.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping("{id}")
	public void atualizar(@PathVariable Long id, @RequestBody AtualizaInfowallForm form) {
		Optional<Infowall> optional = infowallRepository.findById(id);
		
		if(optional.isPresent()) {
			Infowall infowall = form.atualiza(id, infowallRepository);
			
		}
	}
	
	public void deleta() {
		
	}
}
