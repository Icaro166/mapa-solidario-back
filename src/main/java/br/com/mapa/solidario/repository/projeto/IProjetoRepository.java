package br.com.mapa.solidario.repository.projeto;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mapa.solidario.model.projeto.ProjetoModel;

@Repository
public interface IProjetoRepository extends JpaRepository<ProjetoModel, UUID> {

}
