package com.iesam.chispas.domain.models;

public class Autonomous extends Customer {

   private String Surname;

@Override
    public String getName() {
        return super.getName() + " " + this.getSurname();
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        this.Surname = surname;
    }
}
