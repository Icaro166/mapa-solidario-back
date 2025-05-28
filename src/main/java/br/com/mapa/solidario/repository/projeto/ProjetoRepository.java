package br.com.mapa.solidario.repository.projeto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class ProjetoRepository {
	  @PersistenceContext
	    private EntityManager entityManager;
}
