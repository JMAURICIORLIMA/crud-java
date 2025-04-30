package com.github.crud_java.entity;

import javax.persistence.*;

@Entity
@Table(name = "PRODUTO")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NOME_PRODUTO", length = 50, nullable = false, unique = false)
    private String nome;

}
