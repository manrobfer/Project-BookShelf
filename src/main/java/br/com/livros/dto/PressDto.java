package br.com.livros.dto;

import br.com.livros.models.Cathegory;
import br.com.livros.models.Press;
import lombok.Data;
import org.springframework.beans.BeanUtils;


import java.util.Date;

@Data
public class PressDto {

    private String name;

    private String nickname;

    private Date foundation;

    private String ie;

    private String cnpj;

    private String website;

    public Press convertFromPressDto() {
        Press press = new Press();
        BeanUtils.copyProperties(this, press, "id" );
        return press;
    }
}
