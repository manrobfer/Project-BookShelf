package br.com.livros.dto;

import br.com.livros.models.Author;
import br.com.livros.models.Cathegory;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class CategoryDto {

    private int codigo;
    private String nome;

    private String descricao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Cathegory convertFromCathegoryDto() {
        Cathegory cathegory = new Cathegory();
        BeanUtils.copyProperties(this, cathegory, "id" );
        return cathegory;
    }
}
