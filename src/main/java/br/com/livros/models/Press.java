package br.com.livros.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
@Table(name = "press")
public class Press {

    @Id
    @SequenceGenerator(name="press_seq",
            sequenceName="press_seq",
            allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="press_seq")
    private Long id;

    @Column(name ="PRS_NM")
    private String name;

    @Column(name ="PRS_NKNM")
    private String nickname;

    @Column(name ="PRS_FDNT")
    private Date foundation;

    @Column(name ="PRS_IE")
    private String ie;

    @Column(name ="PRS_CNPJ")
    private String cnpj;

    @Column(name ="PRS_WST")
    private String website;
}
