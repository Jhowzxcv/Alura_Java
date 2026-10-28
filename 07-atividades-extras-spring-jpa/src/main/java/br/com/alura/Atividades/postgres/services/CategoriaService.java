package br.com.alura.Atividades.postgres.services;

import br.com.alura.Atividades.postgres.Categoria;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @PersistenceContext
    private EntityManager entityManager;

    /**
     * Método que busca uma categoria pelo nome ou cria uma nova se não existir
     */
    @Transactional
    public Categoria obterOuCriarCategoria(String nomeCategoria) {
        try {
            // Tenta encontrar categoria existente pelo nome
            return entityManager.createQuery(
                            "SELECT c FROM Categoria c WHERE c.nome = :nome", Categoria.class)
                    .setParameter("nome", nomeCategoria)
                    .getSingleResult();
        } catch (NoResultException e) {
            // Se não encontrar, cria uma nova
            Categoria novaCategoria = new Categoria(nomeCategoria);
            entityManager.persist(novaCategoria);
            return novaCategoria;
        }
    }
}

