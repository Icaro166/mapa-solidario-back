package br.com.mapa.solidario.dto.contato;

import br.com.mapa.solidario.model.contato.ContatoModel;
import lombok.Data;

@Data
public class ContatoDTO {
		private String contato;
		private String tipoContato;
		
		public ContatoDTO(ContatoModel model) {
			this.setContato(model.getContato());
			this.setTipoContato(model.getTipoContato().getDescricao());
		}
}
