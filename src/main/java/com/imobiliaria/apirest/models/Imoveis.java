package com.imobiliaria.apirest.models;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "tb_imoveis")
public class Imoveis implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    private String tipo_imovel;
    private String endereco;
    private String cep;
    private int dormitorios;
    private int banheiros;
    private int suites;
    private int metragem;
    private BigDecimal valor_aluguel_sug;
    private String obs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo_imovel() {
        return tipo_imovel;
    }

    public void setTipo_imovel(String tipo_imovel) {
        this.tipo_imovel = tipo_imovel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getDormitorios() {
        return dormitorios;
    }

    public void setDormitorios(int dormitorios) {
        this.dormitorios = dormitorios;
    }

    public int getBanheiros() {
        return banheiros;
    }

    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }

    public int getSuites() {
        return suites;
    }

    public void setSuites(int suites) {
        this.suites = suites;
    }

    public int getMetragem() {
        return metragem;
    }

    public void setMetragem(int metragem) {
        this.metragem = metragem;
    }

    public BigDecimal getValor_aluguel_sug() {
        return valor_aluguel_sug;
    }

    public void setValor_aluguel_sug(BigDecimal valor_aluguel_sug) {
        this.valor_aluguel_sug = valor_aluguel_sug;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
}
