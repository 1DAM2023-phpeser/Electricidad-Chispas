package com.iesam.chispas.domain.models;

public class Society extends Customer {

    private String telEmpresa;

    @Override
    public String getPhoneNumber() {
        return super.getPhoneNumber() + " || Numero fijo: " + telEmpresa;
    }

    public String getTelEmpresa() {
        return telEmpresa;
    }

    public void setTelEmpresa(String telEmpresa) {
        this.telEmpresa = telEmpresa;
    }
}
