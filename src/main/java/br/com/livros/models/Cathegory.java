package br.com.livros.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.antlr.v4.runtime.misc.NotNull;
import java.io.Serializable;

@Entity
@Table(name="CATEGORIAS")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cathegory implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_CAT")
	@SequenceGenerator( sequenceName="SQ_CAT",allocationSize = 1 ,name="SQ_CAT")	
	@Column(name = "CAT_ID")
	private Long catid;
	
	@NotNull
	@Column(name = "CAT_CDGO")
	private int codigo;
	
	@NotNull
	@Column(name = "CAT_NM")
	private String nome;

	@NotNull
	@Column(name = "CAT_DESCR")
	private String descricao;
	
}
