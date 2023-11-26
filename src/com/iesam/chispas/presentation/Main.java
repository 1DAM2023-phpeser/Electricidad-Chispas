package com.iesam.chispas.presentation;

import com.iesam.chispas.domain.models.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Autonomous autonomous1 = new Autonomous();
        System.out.println("----------Datos del autonomo----------");
        autonomous1.setType("Autonomo");
        System.out.println("Introduzca el DNI");
        autonomous1.setCode(sc.nextLine());
        System.out.println("Introduzca el nombre");
        autonomous1.setName(sc.nextLine());
        System.out.println("Introduzca el Apellido");
        autonomous1.setSurname(sc.nextLine());
        System.out.println("Introduzca la direccion");
        autonomous1.setAddress(sc.nextLine());
        System.out.println("Introduzca la ciudad");
        autonomous1.setCity(sc.nextLine());
        System.out.println("Introduzca la provincia");
        autonomous1.setProvince(sc.nextLine());
        System.out.println("Introduzca el email");
        autonomous1.setEmail(sc.nextLine());
        System.out.println("Introduzca el numero de telefono");
        autonomous1.setPhoneNumber(sc.nextLine());


        Society society1 = new Society();
        System.out.println("----------Datos de la Sociedad----------");
        society1.setType("Sociedad");
        System.out.println("Introduzca el NIF");
        society1.setCode(sc.nextLine());
        System.out.println("Introduzca el nombre");
        society1.setName(sc.nextLine());
        System.out.println("Introduzca la direccion");
        society1.setAddress(sc.nextLine());
        System.out.println("Introduzca la ciudad");
        society1.setCity(sc.nextLine());
        System.out.println("Introduzca la provincia");
        society1.setProvince(sc.nextLine());
        System.out.println("Introduzca el email");
        society1.setEmail(sc.nextLine());
        System.out.println("Introduzca un numero de telefono fijo o de empresa");
        society1.setTelEmpresa(sc.nextLine());
        System.out.println("Introduzca el numero de telefono");
        society1.setPhoneNumber(sc.nextLine());


        IvaType ivaType0 = new IvaType();
        ivaType0.setType(0.00);

        IvaType ivaType4 = new IvaType();
        ivaType4.setType(4.00);

        IvaType ivaType10 = new IvaType();
        ivaType10.setType(10.00);

        IvaType ivaType21 = new IvaType();
        ivaType21.setType(21.00);



        Product product1 = new Product();
        System.out.println("----------Datos del Producto----------");
        System.out.println("Introduzca el ID");
        product1.setIdSales(sc.nextLine());
        System.out.println("Introduzca el nombre");
        product1.setNameSales(sc.nextLine());
        System.out.println("Introduzca la marca");
        product1.setBrand(sc.nextLine());
        System.out.println("Introduzca el modelo");
        product1.setModel(sc.nextLine());
        System.out.println("Introduzca el precio (formato: XX.yy)");
        product1.setPriceSales(sc.nextDouble());
        int tipoIva = 8;
        do {
            System.out.println("Introduzca el tipo de iva( (0, 4, 10, 21)");
            tipoIva = sc.nextInt();
        } while (tipoIva != 0 && tipoIva != 4 && tipoIva != 10 && tipoIva != 21);
        switch (tipoIva) {
            case 0:
                product1.setIvaType(ivaType0);
            case 4:
                product1.setIvaType(ivaType4);
            case 10:
                product1.setIvaType(ivaType10);
            case 21:
                product1.setIvaType(ivaType21);
        }

        String salto = sc.nextLine();


        Service service1 = new Service();
        System.out.println("----------Datos del Servicio----------");
        System.out.println("Introduzca el ID");
        service1.setIdSales(sc.nextLine());
        System.out.println("Introduzca el nombre");
        service1.setNameSales(sc.nextLine());
        System.out.println("Introduzca el numero de trabajadores necesitados");
        service1.setNumTrabajadores(sc.nextLine());
        System.out.println("Introduzca el precio (formato: XX,yy)");
        service1.setPriceSales(sc.nextDouble());
        do {
            System.out.println("Introduzca el tipo de iva( (0, 4, 10, 21)");
            tipoIva = sc.nextInt();
        } while (tipoIva != 0 && tipoIva != 4 && tipoIva != 10 && tipoIva != 21);
        switch (tipoIva) {
            case 0:
                service1.setIvaType(ivaType0);
            case 4:
                service1.setIvaType(ivaType4);
            case 10:
                service1.setIvaType(ivaType10);
            case 21:
                service1.setIvaType(ivaType21);
        }

        salto = sc.nextLine();


        Product product2 = new Product();
        System.out.println("----------Datos del Producto----------");
        System.out.println("Introduzca el ID");
        product2.setIdSales(sc.nextLine());
        System.out.println("Introduzca el nombre");
        product2.setNameSales(sc.nextLine());
        System.out.println("Introduzca la marca");
        product2.setBrand(sc.nextLine());
        System.out.println("Introduzca el modelo");
        product2.setModel(sc.nextLine());
        System.out.println("Introduzca el precio (formato: XX.yy)");
        product2.setPriceSales(sc.nextDouble());
        do {
            System.out.println("Introduzca el tipo de iva( (0, 4, 10, 21)");
            tipoIva = sc.nextInt();
        } while (tipoIva != 0 && tipoIva != 4 && tipoIva != 10 && tipoIva != 21);
        switch (tipoIva) {
            case 0:
                product2.setIvaType(ivaType0);
            case 4:
                product2.setIvaType(ivaType4);
            case 10:
                product2.setIvaType(ivaType10);
            case 21:
                product2.setIvaType(ivaType21);
        }

        salto = sc.nextLine();

        Service service2 = new Service();
        System.out.println("----------Datos del Servicio----------");
        System.out.println("Introduzca el ID");
        service2.setIdSales(sc.nextLine());
        System.out.println("Introduzca el numero de trabajadores necesitados");
        service2.setNumTrabajadores(sc.nextLine());
        System.out.println("Introduzca el nombre");
        service2.setNameSales(sc.nextLine());
        System.out.println("Introduzca el precio (formato: XX.yy)");
        service2.setPriceSales(sc.nextDouble());
        do {
            System.out.println("Introduzca el tipo de iva( (0, 4, 10, 21)");
            tipoIva = sc.nextInt();
        } while (tipoIva != 0 && tipoIva != 4 && tipoIva != 10 && tipoIva != 21);
        switch (tipoIva) {
            case 0:
                service2.setIvaType(ivaType0);
            case 4:
                service2.setIvaType(ivaType4);
            case 10:
                service2.setIvaType(ivaType10);
            case 21:
                service2.setIvaType(ivaType21);
        }

        salto = sc.nextLine();


        Invoice invoice1 = new Invoice();
        System.out.println("----------Datos de la Factura----------");
        System.out.println("Introduzca el ID");
        invoice1.setIdInv(sc.nextLine());
        System.out.println("Introduce la fecha de la factura (dd/mm/yyyy)");
        invoice1.setDate(sc.nextLine());
        invoice1.setTaxBase(product1.getPriceSales() + service1.getPriceSales());
        invoice1.setTotal(product1.getPriceSales() + product1.getPriceSales() * product1.getIvaType().getType() / 100 + service1.getPriceSales() + service1.getPriceSales() * service1.getIvaType().getType() / 100);
        invoice1.setCustomer(autonomous1);
        invoice1.addSales(product1);
        invoice1.addSales(service1);



        Invoice invoice2 = new Invoice();
        System.out.println("----------Datos de la Factura----------");
        System.out.println("Introduzca el ID");
        invoice2.setIdInv(sc.nextLine());
        System.out.println("Introduce la fecha de la factura (dd/mm/yyyy)");
        invoice2.setDate(sc.nextLine());
        invoice2.setTaxBase(product2.getPriceSales() + service2.getPriceSales());
        invoice2.setTotal(product2.getPriceSales() + product2.getPriceSales() * product2.getIvaType().getType() / 100 + service2.getPriceSales() + service2.getPriceSales() * service2.getIvaType().getType() / 100);
        invoice2.setCustomer(society1);
        invoice2.addSales(product2);
        invoice2.addSales(service2);


        InvoicePrinter.print(invoice1);
        InvoicePrinter.print(invoice2);
        sc.close();


    }

}