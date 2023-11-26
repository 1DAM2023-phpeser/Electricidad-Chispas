package com.iesam.chispas.domain.models;

import java.util.ArrayList;

public class Invoice {

    private String idInv;
    private String date;
    private Double taxBase;
    private Double total;
    private Customer customer;
    private Autonomous autonomous;
    private ArrayList<Sales> salesList = new ArrayList<>();

    public String getIdInv() {
        return idInv;
    }

    public void setIdInv(String idInv) {
        this.idInv = idInv;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Sales> getSalesList() {
        return salesList;
    }

    public void setSalesList(ArrayList<Sales> salesList) {
        this.salesList = salesList;
    }

    //Los dos siguientes metodos fueron gracias al ejemplo
    public void addSales(Sales sales) {
        salesList.add(sales);
    }

    public Sales getSales(Integer posicion) {
        return salesList.get(posicion);
    }

    public Autonomous getAutonomous() {
        return autonomous;
    }

    public void setAutonomous(Autonomous autonomous) {
        this.autonomous = autonomous;
    }
}
