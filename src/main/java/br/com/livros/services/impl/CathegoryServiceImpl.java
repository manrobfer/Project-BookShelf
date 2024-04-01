package br.com.livros.services.impl;

import java.util.List;

import br.com.livros.dto.CategoryDto;
import br.com.livros.message.CathegoryMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.livros.daos.CathegoryDao;
import br.com.livros.exceptions.CathegoryException;
import br.com.livros.services.CathegoryService;
import br.com.livros.models.Cathegory;

@Service
public class CathegoryServiceImpl implements CathegoryService {

	@Autowired
	CathegoryDao cathegoryDao;

	@Override
	public Cathegory findById(Long id) {
		return cathegoryDao.findById(id).orElseThrow(() -> new CathegoryException(id));
	}

	@Override
	public Cathegory save(CategoryDto catherory) {
		return cathegoryDao.save(catherory);
	}

	@Override
	public List<Cathegory> findAll() {
		List<Cathegory> cathegories = cathegoryDao.findAllCategories();

		if (cathegories.isEmpty()) {
			throw new CathegoryException(CathegoryMessage.NO_DATA_FOUND);
		}

		return cathegories;

	}

	@Override
	public void delete(int codigo) {
		 cathegoryDao.delete(codigo);
	}
	
	

}
