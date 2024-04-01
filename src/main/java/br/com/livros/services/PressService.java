package br.com.livros.services;

import br.com.livros.dto.PressDto;
import br.com.livros.dto.TitleDto;
import br.com.livros.models.Press;
import br.com.livros.models.Title;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface PressService {

    Optional<Press> findById(Long id);
    Press save(PressDto pressDto);
    Press delete(Title title);
    List<Press> findAll();
}
