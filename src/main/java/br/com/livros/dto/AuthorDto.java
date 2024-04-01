package br.com.livros.dto;


import br.com.livros.models.Author;

import jakarta.persistence.Column;
import org.springframework.beans.BeanUtils;

import java.util.Date;

public class AuthorDto {

    @Column(name = "AUT_CDG")
    private String codigo;

    @Column(name = "AUT_NM")
    private String nome;

    @Column(name = "AUT_DTN")
    private Date nascimento;

    @Column(name = "NCL_ID ")
    private int nascionalidade_id;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public int getNascionalidade_id() {
        return nascionalidade_id;
    }

    public void setNascionalidade_id(int nascionalidade_id) {
        this.nascionalidade_id = nascionalidade_id;
    }

    @Override
    public String toString() {
        return "AuthorDto{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", nascimento=" + nascimento +
                ", nascionalidade_id=" + nascionalidade_id +
                '}';
    }


    public Author convertFromAuthorDto() {
        Author author = new Author();
        BeanUtils.copyProperties(this, author, "id" );
        return author;
    }
}
