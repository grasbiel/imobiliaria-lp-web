package com.imobiliaria.apirest.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="tb_cliente")
public class Cliente {

    @Id
    @GeneratedValue ( strategy= GenerationType.AUTO)
    private  int id;

    private String nome_cliente;
    private String cpf;
    private String telefone;
    private String email;
    private Date dt_nascimento;
}
