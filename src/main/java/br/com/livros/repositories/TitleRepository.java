package br.com.livros.repositories;

import br.com.livros.models.Author;
import br.com.livros.models.Title;
import org.springframework.data.repository.CrudRepository;

public interface TitleRepository extends CrudRepository<Title, Long> {
}
