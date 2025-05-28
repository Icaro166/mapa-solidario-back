package br.com.mapa.solidario.dto.projeto;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.mapa.solidario.dto.contato.ContatoDTO;
import br.com.mapa.solidario.model.projeto.ProjetoModel;
import lombok.Data;
@Data
public class ProjetoDTO {
	private UUID id;
	private String nome;
	private String tipoProjeto;
    private String descricao;
    private String chavePix;
    private String qrCodeUrl;
    private String logo;
    private String site;
    private String localizacao;
    private List<ContatoDTO> contato;
    public ProjetoDTO() {
		
	}
    public ProjetoDTO(ProjetoModel model) {
		this.setChavePix(model.getChavePix());
		this.setDescricao(model.getDescricao());
		this.setId(model.getId());
		this.setLocalizacao(model.getLocalizacao());
		this.setNome(model.getNome());
		this.setQrCodeUrl(model.getQrCodeUrl());
		this.setLogo(model.getLogo());
		this.setSite(model.getSite());
		this.setTipoProjeto(model.getTipoProjeto().getNome());
		this.setContato(model.getContato().stream().map(ContatoDTO::new).collect(Collectors.toList()));
	}
    
}
