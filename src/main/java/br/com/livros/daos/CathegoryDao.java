package br.com.livros.daos;


import br.com.livros.dto.CategoryDto;
import br.com.livros.models.Cathegory;
import br.com.livros.repositories.CathegoryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CathegoryDao {
	
	@Autowired
	CathegoryRepository cathegoryRepository;
	
	
	public Cathegory save(CategoryDto category) {
		return cathegoryRepository.save(category.convertFromCathegoryDto());
		
	}

	@Transactional
	public void delete(int codigo) {
		cathegoryRepository.deleteByCodigo(codigo);
	}
	
	public List<Cathegory> findAllCategories(){
		return (List<Cathegory>) cathegoryRepository.findAll();
	}

	public Optional<Cathegory> findById(Long id) {
		return cathegoryRepository.findById(id);
		
	}
}
