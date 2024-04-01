package br.com.livros.models;

import java.io.Serializable;
import java.sql.Date;

import br.com.livros.dto.AuthorDto;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "AUTORES")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Author implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="author_seq", sequenceName="author_seq", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="author_seq")
	@Column(name =  "AUT_ID")
	private Long id;
	
	@Column(name = "AUT_CDG")
	private String codigo;
	
	@Column(name = "AUT_NM")
	private String nome;
	
	@Column(name = "AUT_DTN")
	private Date nascimento;
	
	@Column(name = "NCL_ID ")
	private int nascionalidade_id;

}
