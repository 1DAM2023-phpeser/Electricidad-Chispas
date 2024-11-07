package com.iesam.chispas.domain.models;

import java.util.ArrayList;
import java.util.Date;

public class Invoice {

    private String idInv;
    private Date date;
    private Double taxBase;
    private Double total;
    private Customer customer;
    private ArrayList<Customer> customers;
    private ArrayList<Product> products;

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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
