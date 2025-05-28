package br.com.mapa.solidario.model.tipoprojeto;

import java.util.UUID;

import jakarta.validation.constraints.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TIPOPROJETO")
@NoArgsConstructor
@Data
public class TipoProjetoModel {
	@Id
	private UUID id;
	@NotNull
	private String nome;
}
