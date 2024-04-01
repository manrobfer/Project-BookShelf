package br.com.livros.services.impl;

import br.com.livros.daos.PressDao;
import br.com.livros.dto.PressDto;
import br.com.livros.models.Press;
import br.com.livros.models.Title;
import br.com.livros.services.PressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PressServiceImpl implements PressService {

    @Autowired
    PressDao pressDao;
    @Override
    public Optional<Press> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Press save(PressDto pressDto) {
        return pressDao.save(pressDto);
    }

    @Override
    public Press delete(Title title) {
        return null;
    }

    @Override
    public List<Press> findAll() {
        return pressDao.findAllPresses();
    }
}
