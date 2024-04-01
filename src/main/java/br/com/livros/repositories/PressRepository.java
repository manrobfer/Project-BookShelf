package br.com.livros.repositories;

import br.com.livros.models.Press;
import org.springframework.data.repository.CrudRepository;

public interface PressRepository extends CrudRepository<Press, Long> {
}
