package com.iesam.chispas.domain.models;

import java.util.Date;

public class Invoice {

    private String idInv;
    private Date date;
    private Double taxBase;
    private Double total;

    public String getIdInv() {
        return idInv;
    }

    public void setIdInv(String idInv) {
        this.idInv = idInv;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTaxBase() {
        return taxBase;
    }

    public void setTaxBase(Double taxBase) {
        this.taxBase = taxBase;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
