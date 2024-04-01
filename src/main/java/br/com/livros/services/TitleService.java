package br.com.livros.services;

import br.com.livros.dto.AuthorDto;
import br.com.livros.dto.TitleDto;
import br.com.livros.models.Author;
import br.com.livros.models.Title;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface TitleService {

    Optional<Title> findById(Long id);
    Title save(TitleDto titleDto);
    Title delete(Title title);
    List<Title> findAll();
}
