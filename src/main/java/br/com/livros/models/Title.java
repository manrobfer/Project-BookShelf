package br.com.livros.models;

import br.com.livros.enuns.Format;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import java.util.Date;

@Entity
@Table(name = "Titulos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Title {

    @Id
    @SequenceGenerator(name="title_seq",
            sequenceName="title_seq",
            allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="title_seq")
    private Long id;

    @Column(name =  "TLT_NM")
    private String name;

    @Column(name =  "TLT_FRMT")
    private Format format;

    @Column(name =  "TLT_PNBR")
    private int page_number;

    @Column(name =  "CAT_ID")
    private int category_id;

    @Column(name =  "AUT_ID")
    private int author_id;

    @Column(name =  "TLT_EDT")
    private int edition;

    @Column(name =  "TLT_RLSE")
    private Date release;



}
