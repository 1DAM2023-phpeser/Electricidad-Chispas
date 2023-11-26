package com.iesam.chispas.domain.models;

public class Autonomous extends Customer {

   private String Surname;

@Override
    public String getName() {
        return super.getName() + " " + this.getSurname();
    } //No se me habia ocurrido esta forma de meter el apellido

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        this.Surname = surname;
    }
}
