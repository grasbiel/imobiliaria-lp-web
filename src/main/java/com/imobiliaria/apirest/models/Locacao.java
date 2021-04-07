package com.imobiliaria.apirest.models;


import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table (name = "tb_locacao")
public class Locacao implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    private int ativo;
    private Date data_fim;
    private Date data_inicio;
    private int dia_vencimento;
    private BigDecimal perc_multa;
    private BigDecimal valor_aluguel;
    private String obs;

    public int getId() {
        return id;
    }

    public Date getData_fim() {
        return data_fim;
    }

    public void setData_fim(Date data_fim) {
        this.data_fim = data_fim;
    }

    public Date getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    public int getDia_vencimento() {
        return dia_vencimento;
    }

    public void setDia_vencimento(int dia_vencimento) {
        this.dia_vencimento = dia_vencimento;
    }

    public BigDecimal getPerc_multa() {
        return perc_multa;
    }

    public void setPerc_multa(BigDecimal perc_multa) {
        this.perc_multa = perc_multa;
    }

    public BigDecimal getValor_aluguel() {
        return valor_aluguel;
    }

    public void setValor_aluguel(BigDecimal valor_aluguel) {
        this.valor_aluguel = valor_aluguel;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public void setId(int id) {
        this.id = id;
    }
}
