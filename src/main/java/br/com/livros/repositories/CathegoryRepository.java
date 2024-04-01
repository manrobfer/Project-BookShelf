package br.com.livros.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.livros.models.Cathegory;

@Repository
public interface CathegoryRepository extends CrudRepository<Cathegory, Long>  {

    void deleteByCodigo(int codigo);
	
		 


}
