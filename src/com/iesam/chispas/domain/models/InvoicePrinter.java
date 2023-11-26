package com.iesam.chispas.domain.models;

public class InvoicePrinter {

    public static void print(Invoice invoice) {
        System.out.println("------------------------------Factura------------------------------\n" +
                "Codigo: " + invoice.getIdInv() + "\n" +
                "Fecha: " + invoice.getDate() + "\n" +
                "----------Cliente----------\n" +
                "Tipo de cliente: " + invoice.getCustomer().getType() + "\n" +
                "CIF/NIF: " + invoice.getCustomer().getCode() + "\n" +
                "Nombre: " + invoice.getCustomer().getName() + "\n" +
                "Numero de telefono: " + invoice.getCustomer().getPhoneNumber() + "\n" +
                "Direccion: " + invoice.getCustomer().getAddress() + "\n" +
                "Poblacion: " + invoice.getCustomer().getCity() + "\n" +
                "Provincia: " + invoice.getCustomer().getProvince() + "\n" +
                "Email: " + invoice.getCustomer().getEmail() + "\n" +
                "----------Linea Venta(producto/servicio)----------");
        for (Sales sales : invoice.getSalesList()) { //La condicion del for lo he cogido de el ejemplo que has subido.
            System.out.println("Codigo: " + sales.getIdSales() + "\n" +
                    "Nombre: " + sales.getNameSales()  + "\n" +
                    "Precio: " + sales.getPriceSales() + "\n" +
                    "Tipo IVA: " + sales.getIvaType().getType()+ "%\n" +
                    "Total con IVA: " + sales.getPriceSales() + " + " + sales.getPriceSales() * sales.getIvaType().getType() / 100 + "\n" +
                    "------------------------------");
        }
        System.out.println("Base Imponible: " + invoice.getTaxBase() + "\n" +
                "Total Factura: " + Math.round(invoice.getTotal() * 100.00) / 100.00);
    }


}
