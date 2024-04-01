package br.com.livros.services.impl;

import java.util.List;
import java.util.Optional;

import br.com.livros.dto.AuthorDto;
import br.com.livros.services.AuthorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.livros.daos.AuthorsDao;
import br.com.livros.models.Author;

@Service
public class AthorsServiceImpl implements AuthorsService {
	
	@Autowired
	AuthorsDao authorDao;

	@Override
	public Optional<Author> findById(Long id) {
		
		return authorDao.findById(id);
	}

	@Override
	public AuthorDto save(AuthorDto authorDto) {
		authorDao.save(authorDto);
		 return null;
	}

	@Override
	public Author deleteById(Long id ) {
		return authorDao.deleteById(id);
	}

	@Override
	public List<Author> findAll() {		
		return authorDao.findAll();
	}

}
