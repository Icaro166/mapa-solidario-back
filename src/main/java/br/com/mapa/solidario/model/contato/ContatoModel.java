package br.com.mapa.solidario.model.contato;

import java.util.UUID;

import br.com.mapa.solidario.enums.TipoContato;
import br.com.mapa.solidario.model.projeto.ProjetoModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CONTATO")
@NoArgsConstructor
@Data
public class ContatoModel {
	
	@Id
	private UUID id;
	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name = "TIPOCONTATO")
	private TipoContato tipoContato;
	@NotNull
	private String contato;
	@NotNull
	@ManyToOne
	@JoinColumn(name = "PROJETOID")
	private ProjetoModel projeto;
}
