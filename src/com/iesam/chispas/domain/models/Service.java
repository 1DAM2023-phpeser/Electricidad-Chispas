package com.iesam.chispas.domain.models;

public class Service extends Sales{

   private String numTrabajadores;

   public String getNumTrabajadores() {
      return  numTrabajadores;
   }

   public void setNumTrabajadores(String numTrabajadores) {
      this.numTrabajadores = numTrabajadores;
   }

   @Override
   public String getNameSales() {
      return super.getNameSales() + " (" + numTrabajadores + " trabajadores)";
   }

}
