package br.com.livros.daos;

import br.com.livros.dto.CategoryDto;
import br.com.livros.dto.TitleDto;
import br.com.livros.models.Cathegory;
import br.com.livros.models.Title;
import br.com.livros.repositories.TitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TitleDao {

    @Autowired
    TitleRepository titleRepository;


    public Title save(TitleDto titleDto) {
        return titleRepository.save(titleDto.convertFromTitleDto());

    }

    public Cathegory delete(Title category) {
        titleRepository.delete(category);
        return null;
    }

    public List<Title> findAllTitles(){
        return (List<Title>) titleRepository.findAll();
    }

    public Optional<Title> findById(Long id) {
        return titleRepository.findById(id);

    }

}
