package br.com.livros.daos;


import br.com.livros.dto.PressDto;
import br.com.livros.models.Press;
import br.com.livros.repositories.PressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PressDao {

    @Autowired
    PressRepository pressRepository;

    public Press save(PressDto pressDto) {
        return pressRepository.save(pressDto.convertFromPressDto());
    }

    public Press delete(Press press) {
        pressRepository.delete(press);
        return null;
    }

    public List<Press> findAllPresses(){
        return (List<Press>) pressRepository.findAll();
    }

    public Optional<Press> findById(Long id) {
        return pressRepository.findById(id);

    }


}
