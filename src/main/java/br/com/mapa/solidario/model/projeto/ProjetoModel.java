package br.com.mapa.solidario.model.projeto;

import java.util.List;
import java.util.UUID;

import br.com.mapa.solidario.model.contato.ContatoModel;
import br.com.mapa.solidario.model.tipoprojeto.TipoProjetoModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PROJETO")
@NoArgsConstructor
@Data
public class ProjetoModel {
	@Id
	private UUID id;
	@NotNull
	private String nome;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "TIPOPROJETOID")
	private TipoProjetoModel tipoProjeto;
	
    @Size(max = 1000)
    private String descricao;
    
    @Column(name="CHAVEPIX")
    private String chavePix;

    @Column(name="QRCODEURL")
    private String qrCodeUrl;

    private String logo;

    private String site;

    private String localizacao;
    
    @NotNull
    @OneToMany(mappedBy = "projeto", orphanRemoval = false, fetch = FetchType.LAZY)
    private List<ContatoModel> contato;
}
