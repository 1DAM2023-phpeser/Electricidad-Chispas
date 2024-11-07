package com.iesam.chispas.domain.models;

public class Autonomous extends Customer {

    private String dni;
    private String fullName;

    public String getCode() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
