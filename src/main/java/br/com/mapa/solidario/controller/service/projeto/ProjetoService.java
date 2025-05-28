package br.com.mapa.solidario.controller.service.projeto;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mapa.solidario.dto.projeto.ProjetoDTO;
import br.com.mapa.solidario.model.projeto.ProjetoModel;
import br.com.mapa.solidario.repository.projeto.IProjetoRepository;

@Service
public class ProjetoService {
	@Autowired
	IProjetoRepository iProjetoRepository;

	public List<ProjetoDTO> buscaProjetos() {
		 List<ProjetoModel> projetos = this.iProjetoRepository.findAll();
		   return projetos.stream()
                   .map(ProjetoDTO::new)
                   .collect(Collectors.toList());
	}

	public ProjetoDTO buscaProjetosPorId(UUID fromString) {
		 Optional<ProjetoModel> projeto = this.iProjetoRepository.findById(fromString);
		 if(projeto.isPresent()) {
			 return new ProjetoDTO(projeto.get());
		 }
		return new ProjetoDTO();
	}
}
