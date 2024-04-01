package br.com.livros.daos;

import java.util.List;
import java.util.Optional;

import br.com.livros.dto.AuthorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import br.com.livros.models.Author;
import br.com.livros.repositories.AuthorsRepositories;

@Component
public class AuthorsDao {
	
	@Autowired
	AuthorsRepositories authorRepository;
	
	
	public List<Author> findAll() {
		return (List<Author>) authorRepository.findAll();}
	
	public Optional<Author> findById(Long id) {
		return authorRepository.findById(id);}
	
	public Author save(AuthorDto authorDto) {
		Author author = authorDto.convertFromAuthorDto();
		return authorRepository.save(author);
	}
	
	public Author deleteById(Long id) {
		authorRepository.deleteById(id);
	    return null;
	}

}
