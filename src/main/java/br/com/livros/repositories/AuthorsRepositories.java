package br.com.livros.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.livros.models.Author;

@Repository
public interface AuthorsRepositories extends CrudRepository<Author, Long>  {
    void deleteById(Long id);
}
