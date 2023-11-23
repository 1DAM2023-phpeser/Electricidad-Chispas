package com.iesam.chispas.domain.models;

import java.util.ArrayList;

public class InvoicePrinter {

    public void print(Invoice invoice){
        System.out.println("------------------------------Factura------------------------------\n" +
                "Codigo: " + invoice.getIdInv() + "\n" +
                "Fecha: " + invoice.getDate() + "\n" +
                "----------Cliente----------\n" +
                "CIF/NIF: " + invoice.getCustomer().getCode() + "\n" +
                "Nombre: " + invoice.getCustomer().getName() + "\n" +
                "Direccion: " + invoice.getCustomer().getAddress() + "\n" +
                "Poblacion: " + invoice.getCustomer().getCity() + "\n" +
                "Provincia: " + invoice.getCustomer().getProvince()+ "\n" +
                "Email: " + invoice.getCustomer().getEmail() + "\n" +
                "----------Linea Venta(producto/servicio)----------");
        for (int i = 0; i <= 1; i++){
            System.out.println( "Codigo: " + invoice.getSales().get(i).getIdSales() + "\n" +
                    "Nombre: " + invoice.getSales().get(i).getNameSales() + "\n" +
                    "Precio: " + invoice.getSales().get(i).getPriceSales() + "\n" +
                    "Tipo IVA: " + invoice.getSales().get(i).getIvaType().getType() + "%\n" +
                    "Total con IVA: " + invoice.getSales().get(i).getPriceSales() + " + " + invoice.getSales().get(i).getPriceSales() * invoice.getSales().get(i).getIvaType().getType() / 100 + "\n" +
                    "------------------------------");
        }
        System.out.println("Base Imponible: " + invoice.getTaxBase() + "\n" +
                "Total Factura: " + Math.round(invoice.getTotal() * 100.00) / 100.00);
    }
}
