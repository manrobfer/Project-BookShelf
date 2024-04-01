package br.com.livros.services.impl;

import br.com.livros.daos.TitleDao;
import br.com.livros.dto.TitleDto;
import br.com.livros.models.Title;
import br.com.livros.services.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TitleServiceImpl implements TitleService {

    @Autowired
    TitleDao titleDao;

    @Override
    public Optional<Title> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Title save(TitleDto titleDto) {
        return titleDao.save(titleDto);
    }

    @Override
    public Title delete(Title title) {
        return null;
    }

    @Override
    public List<Title> findAll() {
        return titleDao.findAllTitles();
    }
}
