package br.com.livros.services;

import java.util.List;

import br.com.livros.dto.CategoryDto;
import br.com.livros.models.Cathegory;

public interface CathegoryService {
	
	 Cathegory findById(Long id);
	public Cathegory save(CategoryDto catherory);
	void delete(int codigo);
	 List<Cathegory> findAll();

}
