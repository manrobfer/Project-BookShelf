package br.com.livros.dto;

import br.com.livros.enuns.Format;

import br.com.livros.models.Title;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import java.util.Date;

@Data
public class TitleDto {

    private String name;

    private Format format;

    private int page_number;

    private int category_id;

    private int author_id;

    private int edition;

    private Date release;


    public Title convertFromTitleDto() {
        Title title = new Title();
        BeanUtils.copyProperties(this, title, "id");
        return title;
    }
}