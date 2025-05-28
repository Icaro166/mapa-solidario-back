package br.com.mapa.solidario.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mapa.solidario.controller.service.projeto.ProjetoService;
import br.com.mapa.solidario.dto.projeto.ProjetoDTO;

@RestController
@RequestMapping("/projeto")
public class ProjetosController {
	
	@Autowired
	ProjetoService projetoService;
	
	@GetMapping
	public List<ProjetoDTO> procuraProjetos() {
		return this.projetoService.buscaProjetos();
	}
	@GetMapping("/{id}")
	public ProjetoDTO procuraProjetoPorId(@PathVariable("id") String id ) {
		return this.projetoService.buscaProjetosPorId(UUID.fromString(id));
	}
}
