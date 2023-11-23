package com.iesam.chispas.domain.models;

public class Society extends Customer {


    private String nif;
    private String nameSociety;

    public String getCode() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return nameSociety;
    }

    public void setNameSociety(String nameSociety) {
        this.nameSociety = nameSociety;
    }
}
