package com.imobiliaria.apirest.models;


import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


@Entity
@Table(name="tb_alugueis")
public class Alugueis implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private Date dt_vencimento;
    private BigDecimal valor_pago;
    private String obs;

    public Date getDt_vencimento() {
        return dt_vencimento;
    }

    public void setDt_vencimento(Date dt_vencimento) {
        this.dt_vencimento = dt_vencimento;
    }

    public BigDecimal getValor_pago() {
        return valor_pago;
    }

    public void setValor_pago(BigDecimal valor_pago) {
        this.valor_pago = valor_pago;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

}
